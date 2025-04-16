var clickCount = 0;
var currentCanvasDimension = { x: 0, y: 0 }
var flowDiagramFolder;
var graphBuffer = 50;
var gapBetweenTwoClicks = 500;
var ifElseMultiplier;
var loopConnectorXBuffer = 50;
var maxNodeWidth;
var noOfLevels = 0;
var pixelsForCapitalLetters = 10;
var pixelsForSmallLetters = 7;
var rootNode;
var textLengthPerNodeInPixels = 200;
var paperId;
var graphId;

var JAVA_VIEW = 0;
var NATURAL_LANGUAGE_VIEW = 'NATURAL_LANGUAGE_VIEW';
var CURRENT_VIEW = NATURAL_LANGUAGE_VIEW;


function setPaperId(paper) {
    paperId = paper;
}

function setGraphId(graph) {
    graphId = graph;
}

function setFlowDiagramFolder(folderPath) {
    flowDiagramFolder = folderPath;
}

function moveNodesOnYAxis(gapBetweenNodes) {
    var previousNodeBBox;
    var previousNode;
    _.each(graphId.getElements(), function(eachNode) {
        position = eachNode.get('position');
        if (previousNode) {
            previousNodeBBox = previousNode.getBBox();
            position = { x: position.x, y: previousNodeBBox.y + previousNodeBBox.height + gapBetweenNodes };
            eachNode.set('position', position);
        }
        previousNode = eachNode;
    });
}

/**
 * connectionType - source/target
 */
function getNextNodeForANode(node) {
    var connectionLink = getConnector(node, 'source');
    var requiredNode;

    if (connectionLink) {
        requiredNode = getConnectedNode(connectionLink, 'target');
    }
    return requiredNode;
}

/**
 * connectionType - source/target
 */
function getPreviousNodeForANode(node) {
    var connectionLink = getConnector(node, 'target');
    var requiredNode;

    if (connectionLink) {
        requiredNode = getConnectedNode(connectionLink, 'source');
    }
    return requiredNode;
}

function getConnectedNode(connector, connectionType) {
    if (connector) {
        var connectedNodeId = connector.get(connectionType).id;
        return graphId.getCell(connectedNodeId);
    }
}

/**
 * connectionType - source/target
 */
function getConnectedNodesForALink(connectors, connectionType) {
    var connectedNodes = [];
    var connectedNodeId;

    if (connectors && connectors.length > 0) {
        _.each(connectors, function(connector) {
            connectedNodeId = connector.get(connectionType).id;
            connectedNodes.push(graphId.getCell(connectedNodeId));
        });
    }

    return connectedNodes;
}

function getConnectors(node, connectorType) {
    var connectors = [];
    _.each(graphId.getLinks(), function(eachLink) {
        if (node.get('id') == eachLink.get(connectorType).id) {
            connectors.push(eachLink);
        }
    });
    return connectors;
}

function getConnector(node, connectorType) {
    var connector;
    _.each(graphId.getLinks(), function(eachLink) {
        if (node.get('id') == eachLink.get(connectorType).id && !eachLink.get('loopConnector')) {
            connector = eachLink;
        }
    });
    return connector;
}

function getConnectorsFromNode(node, connectorType) {
    var connectors = [];
    _.each(graphId.getLinks(), function(eachLink) {
        if (node.get('id') == eachLink.get(connectorType).id) {
            connectors.push(eachLink);
        }
    });
    return connectors;
}

function getPreviousNodeForConnector(connector) {
    return graphId.getCell(connector.get('source').id);
}

function getNextNodeForConnector(connector) {
    return graphId.getCell(connector.get('target').id);
}

function beautifyLoopConnectors() {
    _.each(graphId.getLinks(), function(eachLink) {
        if (eachLink.get('loopConnector')) {
            var prevNodes = getConnectedNodesForALink(new Array(eachLink), 'source');
            var nextNodes = getConnectedNodesForALink(new Array(eachLink), 'target');

            var prevNode = prevNodes[0];
            var nextNode = nextNodes[0];

            var maxXAxisPointOfInnerVertices = getMaxXAxisOfInnerVerticesAndNodes(prevNode, nextNode);
            var noOfInnerLoopConnectors = getNoOfInnerLoopConnectors(prevNode, nextNode);

            var vertices = [];

            if (prevNode.getBBox().y > nextNode.getBBox().y) {
                vertices.push({
                    x: maxXAxisPointOfInnerVertices + loopConnectorXBuffer,
                    y: prevNode.getBBox().y + prevNode.getBBox().height / 2,
                });

                vertices.push({
                    x: maxXAxisPointOfInnerVertices + loopConnectorXBuffer,
                    y: nextNode.getBBox().y + nextNode.getBBox().height / 2,
                });
                eachLink.set('vertices', vertices);
            } else {
                console.log("Node Handled");
            }
        } else if (sourceAndTargetLinksInDifferentAxis(eachLink)) {
            var prevNodes = getConnectedNodesForALink(new Array(eachLink), 'source');
            var nextNodes = getConnectedNodesForALink(new Array(eachLink), 'target');

            var prevNode = prevNodes[0];
            var nextNode = nextNodes[0];

            var vertices = [];

            if (eachLink.get('ifBlockStartLink')) {
                vertices.push({
                    x: nextNode.getBBox().x + nextNode.getBBox().width / 2,
                    y: prevNode.getBBox().y + prevNode.getBBox().height / 2,
                });
            } else if (eachLink.get('ifBlockEndLink')) {
                vertices.push({
                    x: prevNode.getBBox().x + prevNode.getBBox().width / 2,
                    y: nextNode.getBBox().y + nextNode.getBBox().height / 2,
                });
            } else if (eachLink.get('elseBlockStartLink')) {
                if (nextNode.getBBox().y > prevNode.getBBox().y && nextNode.getBBox().x > prevNode.getBBox().x) {
                    vertices.push({
                        x: nextNode.getBBox().x + nextNode.getBBox().width / 2,
                        y: prevNode.getBBox().y + prevNode.getBBox().height / 2,
                    });
                } else if (nextNode.getBBox().y > prevNode.getBBox().y && nextNode.getBBox().x < prevNode.getBBox().x) {
                    vertices.push({
                        x: prevNode.getBBox().x + prevNode.getBBox().width / 2,
                        y: nextNode.getBBox().y + nextNode.getBBox().height / 2,
                    });
                } else {
                    console.log("Not Handled");
                }
            } else if (eachLink.get('elseBlockEndLink')) {
                vertices.push({
                    x: prevNode.getBBox().x + prevNode.getBBox().width / 2,
                    y: nextNode.getBBox().y + nextNode.getBBox().height / 2,
                });
            } else {
                console.log("Not Handled : ", eachLink);
            }

            if (vertices.length > 0) {
                eachLink.set('vertices', vertices);
            }
        } else {
            var prevNodes = getConnectedNodesForALink(new Array(eachLink), 'source');
            var nextNodes = getConnectedNodesForALink(new Array(eachLink), 'target');

            var prevNode = prevNodes[0];
            var nextNode = nextNodes[0];

            var vertices = [];

            if (eachLink.get('ifBlockStartAndEndLink')) {
                vertices.push({
                    x: prevNode.getBBox().x - 0.6 * maxNodeWidth,
                    y: prevNode.getBBox().y + prevNode.getBBox().height / 2,
                });

                vertices.push({
                    x: nextNode.getBBox().x - 0.6 * maxNodeWidth,
                    y: nextNode.getBBox().y + nextNode.getBBox().height / 2,
                });
            } else if (eachLink.get('elseBlockStartAndEndLink')) {
                vertices.push({
                    x: prevNode.getBBox().x + prevNode.getBBox().width + 0.6 * maxNodeWidth,
                    y: prevNode.getBBox().y + prevNode.getBBox().height / 2,
                });

                vertices.push({
                    x: nextNode.getBBox().x + nextNode.getBBox().width + 0.6 * maxNodeWidth,
                    y: nextNode.getBBox().y + nextNode.getBBox().height / 2,
                });
            }

            if (vertices.length > 0) {
                eachLink.set('vertices', vertices);
            }
        }
    });
}

function getMaxXAxisOfInnerVerticesAndNodes(loopConnectorSourceNode, loopConnectorTargetNode) {
    var maxXAxisPointOfInnerVertices = 0;

    var loopConnectorSourcePosition = loopConnectorSourceNode.get('position');
    var loopConnectorTargetPosition = loopConnectorTargetNode.get('position');

    var vertices;
    var eachCellPosition;
    var eachCellBBox;

    _.each(graphId.getLinks(), function(eachLink) {
        vertices = eachLink.get('vertices');
        _.each(vertices, function(eachVertex) {
            if (eachVertex.y < loopConnectorSourcePosition.y &&
                eachVertex.y > loopConnectorTargetPosition.y) {
                maxXAxisPointOfInnerVertices = maxXAxisPointOfInnerVertices > eachVertex.x ?
                    maxXAxisPointOfInnerVertices : eachVertex.x;
            }
        });
    });

    //console.log(loopConnectorSourcePosition);
    //console.log(loopConnectorTargetPosition);

    _.each(graphId.getElements(), function(eachCell) {
        eachCellPosition = eachCell.get('position');
        eachCellBBox = eachCell.getBBox();
        if (eachCellPosition.y < loopConnectorSourcePosition.y &&
            eachCellPosition.y > loopConnectorTargetPosition.y) {
            maxXAxisPointOfInnerVertices = maxXAxisPointOfInnerVertices > (eachCellPosition.x + eachCellBBox.width) ?
                maxXAxisPointOfInnerVertices : (eachCellPosition.x + eachCellBBox.width);
        }
    });

    if (maxXAxisPointOfInnerVertices == 0) {
        var sourceNodeBBox = loopConnectorSourceNode.getBBox();
        maxXAxisPointOfInnerVertices = sourceNodeBBox.x + sourceNodeBBox.width;
    }

    return maxXAxisPointOfInnerVertices;
}

function getNoOfInnerLoopConnectors(loopConnectorSourceNode, loopConnectorTargetNode) {
    var noOfInnerLoopConnectors = 0;

    var loopConnectorSourcePosition = loopConnectorSourceNode.get('position');
    var loopConnectorTargetPosition = loopConnectorTargetNode.get('position');

    _.each(graphId.getLinks(), function(eachLink) {
        if (eachLink.get('loopConnector')) {
            var sourceNodes = getConnectedNodesForALink(new Array(eachLink), 'source');
            var targetNodes = getConnectedNodesForALink(new Array(eachLink), 'target');

            var sourceNode = sourceNodes[0];
            var targetNode = targetNodes[0];

            var sourceNodePosition = sourceNode.get('position');
            var targetNodePosition = targetNode.get('position');

            if (sourceNodePosition.y < loopConnectorSourcePosition.y &&
                targetNodePosition.y > loopConnectorTargetPosition.y) {
                noOfInnerLoopConnectors++;
            }
        }
    });

    return noOfInnerLoopConnectors;
}

function sourceAndTargetLinksInDifferentAxis(link) {
    var prevNodes = getConnectedNodesForALink(new Array(link), 'source');
    var nextNodes = getConnectedNodesForALink(new Array(link), 'target');

    var prevNode = prevNodes[0];
    var nextNode = nextNodes[0];

    //Consider + or - 5 variance, just in case
    if (Math.abs(nextNode.getBBox().y - prevNode.getBBox().y) <= 5 ||
        Math.abs(nextNode.getBBox().x - prevNode.getBBox().x) <= 5
    ) {
        //Nodes are in similar x or y axis
        return false;
    }
    if (Math.abs((nextNode.getBBox().y + nextNode.getBBox().height / 2) - (prevNode.getBBox().y + prevNode.getBBox().height / 2)) <= 5 ||
        Math.abs((nextNode.getBBox().x + nextNode.getBBox().width / 2) - (prevNode.getBBox().x + prevNode.getBBox().width / 2)) <= 5
    ) {
        return false;
    } else if (prevNode.getBBox().x != nextNode.getBBox().x && prevNode.getBBox().y != nextNode.getBBox().y) {
        return true;
    }
}

function alignStopNode(startNode, stopNode) {
    var nextNodeToStartNode = getNextNodeForANode(startNode);
    if (nextNodeToStartNode) {
        var startNodeBBox = startNode.getBBox();
        var nextNodeBBox = nextNodeToStartNode.getBBox();

        var startNodePosition = {
            x: nextNodeBBox.x + (nextNodeBBox.width - startNodeBBox.width) / 2,
            y: startNodeBBox.y
        }

        startNode.set('position', startNodePosition);
    }

    stopNode.resize(startNodeBBox.width, startNodeBBox.height);

    var previousNodeToStopNode = getPreviousNodeForANode(stopNode);
    if (previousNodeToStopNode) {
        var stopNodeBBox = stopNode.getBBox();
        var previousNodeBBox = previousNodeToStopNode.getBBox();

        var stopNodePosition = {
            x: previousNodeBBox.x + (previousNodeBBox.width - stopNodeBBox.width) / 2,
            y: stopNodeBBox.y
        }
        stopNode.set('position', stopNodePosition);
    }

    graphId.resetCells(graphId.getCells());
}

function moveImproperIfElseBlocks() {
    //console.log("moveImproperIfElseBlocks is called");
    var previousNode;
    var nodeType, previousNodeType;
    var nodePosition, previousNodePosition;

    _.each(graphId.getElements(), function(node) {
        nodeType = node.get('nodeType');
        if (nodeType == 'Rhombus') {
            previousNode = getPreviousNodeForANode(node);
            previousNodeType = previousNode.get('nodeType');

            nodePosition = node.get('position');
            previousNodePosition = previousNode.get('position');

            if (previousNodeType != 'Rhombus' && nodePosition.x != previousNodePosition.x) {
                moveBlockByPixels(node, nodePosition.x - previousNodePosition.x);
            }
        }
    });
}

function moveImproperWhileBlocks() {
    var endWhileNodeId;
    var previousNode;
    var nodePosition, previousNodePosition;

    _.each(graphId.getElements(), function(node) {
        endWhileNodeId = node.get('whileStart');
        if (endWhileNodeId) {
            //console.log("endWhileNodeId : " + endWhileNodeId);
            previousNode = getPreviousNodeForANode(node);
            nodePosition = node.get('position');
            previousNodePosition = previousNode.get('position');

            if (nodePosition.x != previousNodePosition.x) {
                moveBlockByPixels(node, nodePosition.x - previousNodePosition.x, endWhileNodeId);
            }
        }
    });
}

function moveBlockByPixels(node, moveByPixels, endNodeIdDefault) {
    var endNodeId = endNodeIdDefault;

    if (!endNodeId) {
        endNodeId = node.get('endIfConditionId');
    }

    var nodeIdsToMove = [];
    var linkIdsToMove = [];

    getNodesToMoveOnXAxis(node, null, endNodeId, true, nodeIdsToMove, linkIdsToMove);
    addIdToIdsList(nodeIdsToMove, endNodeId);

    _.each(nodeIdsToMove, function(nodeId) {
        eachNode = graphId.getCell(nodeId);
        eachNodePosition = eachNode.get('position');
        eachNodePosition.x = eachNodePosition.x - moveByPixels;
        eachNode.set('position', eachNodePosition);
    });

    _.each(linkIdsToMove, function(linkId) {
        eachLink = graphId.getCell(linkId);
        linkVertices = eachLink.get('vertices');
        _.each(linkVertices, function(eachVertex) {
            eachVertex.x = eachVertex.x - moveByPixels;
        });
        eachLink.set('vertices', linkVertices);
    });
}

function moveInvisibleNodes() {
    var minAxisPosition = getMinAxisPointsOfModel();

    if (minAxisPosition.x < 25) {
        minAxisPosition.x -= 25;

        minAxisPosition.x = Math.abs(minAxisPosition.x);

        _.each(graphId.getElements(), function(eachCell) {
            bBox = eachCell.getBBox();
            eachCellPosition = eachCell.get('position');
            eachCellPosition.x += minAxisPosition.x;
            eachCell.set('position', eachCellPosition);
        });

        _.each(graphId.getLinks(), function(eachLink) {
            vertices = eachLink.get('vertices');
            _.each(vertices, function(eachVertex) {
                eachVertex.x += minAxisPosition.x;
            });
            eachLink.set('vertices', vertices);
        });

        graphId.resetCells(graphId.getCells());
    }
}

function moveIfElseBlocks() {
    var nodeType;
    var endIfConditionId;
    var moveIfBlockBy;
    var moveElseBlockBy;

    _.each(graphId.getElements(), function(eachCell) {
        nodeType = eachCell.get('nodeType');
        if (nodeType == 'Rhombus') {
            try {
                moveIfBlockBy = eachCell.get('moveIfBlockBy');
                if (moveIfBlockBy > 0) {
                    adjustIfElseBlocks(eachCell, moveIfBlockBy - 2, undefined);
                }

                moveElseBlockBy = eachCell.get('moveElseBlockBy');
                if (moveElseBlockBy > 0) {
                    adjustIfElseBlocks(eachCell, undefined, moveElseBlockBy + 2);
                }
            } catch (err) {
                console.log(err);
            }
        }
    });

    graphId.resetCells(graphId.getCells());
}

function adjustIfElseBlocks(node, moveIfNodesBy, moveElseNodesBy) {
    var connectorsFromNode = getConnectorsFromNode(node, 'source');
    var ifBlockStartNode, elseBlockStartNode;

    _.each(connectorsFromNode, function(eachConnector) {
        if (moveIfNodesBy) {
            if (eachConnector.get('ifBlockStartLink') || eachConnector.get('ifBlockStartAndEndLink')) {
                ifBlockStartNode = getNextNodeForConnector(eachConnector);
            }
        }

        if (moveElseNodesBy) {
            if (eachConnector.get('elseBlockStartLink') || eachConnector.get('elseBlockStartAndEndLink')) {
                elseBlockStartNode = getNextNodeForConnector(eachConnector);
            }
        }
    });

    console.log("ifBlockStartNode : ", ifBlockStartNode);
    console.log("elseBlockStartNode : ", elseBlockStartNode);

    endIfConditionId = node.get('endIfConditionId');

    var nodeIdsToMove = [];
    var linkIdsToMove = [];

    var eachNode, eachNodePosition;
    var eachLink, linkVertices;

    if (moveIfNodesBy) {
        getNodesToMoveOnXAxis(ifBlockStartNode, moveIfNodesBy, endIfConditionId, true, nodeIdsToMove, linkIdsToMove);

        _.each(nodeIdsToMove, function(nodeId) {
            eachNode = graphId.getCell(nodeId);
            eachNodePosition = eachNode.get('position');
            eachNodePosition.x = eachNodePosition.x - (moveIfNodesBy * ifElseMultiplier * maxNodeWidth);
            //console.log("eachNodePosition.x : " + eachNodePosition.x);
            eachNode.set('position', eachNodePosition);
        });

        _.each(linkIdsToMove, function(linkId) {
            eachLink = graphId.getCell(linkId);
            linkVertices = eachLink.get('vertices');
            _.each(linkVertices, function(eachVertex) {
                eachVertex.x = eachVertex.x - (moveIfNodesBy * ifElseMultiplier * maxNodeWidth);
                console.log("eachVertex.x : " + eachVertex.x);
            });
            eachLink.set('vertices', linkVertices);
        });
    }

    nodeIdsToMove = [];
    linkIdsToMove = [];

    if (moveElseNodesBy) {
        getNodesToMoveOnXAxis(elseBlockStartNode, moveElseNodesBy, endIfConditionId, true, nodeIdsToMove, linkIdsToMove);

        _.each(nodeIdsToMove, function(nodeId) {
            eachNode = graphId.getCell(nodeId);
            eachNodePosition = eachNode.get('position');
            eachNodePosition.x = eachNodePosition.x + (moveElseNodesBy * ifElseMultiplier * maxNodeWidth)
            eachNode.set('position', eachNodePosition);
        });

        _.each(linkIdsToMove, function(linkId) {
            eachLink = graphId.getCell(linkId);
            linkVertices = eachLink.get('vertices');
            _.each(linkVertices, function(eachVertex) {
                eachVertex.x = eachVertex.x + (moveElseNodesBy * ifElseMultiplier * maxNodeWidth)
            });
            eachLink.set('vertices', linkVertices);
        });
    }

    graphId.resetCells(graphId.getCells());
}

function getNodesToMoveOnXAxis(node, moveNodesBy, endNodeId, firstNode, nodeIdsToMove, linkIdsToMove) {
    if (node.id == endNodeId) {
        return
    };

    addIdToIdsList(nodeIdsToMove, node.id);

    if (firstNode) {
        var previousConnectors = getConnectorsFromNode(node, 'target');
        _.each(previousConnectors, function(eachLink) {
            addIdToIdsList(linkIdsToMove, eachLink.id);
        });
    }

    var nextConnectors = getConnectorsFromNode(node, 'source');
    _.each(nextConnectors, function(eachLink) {
        addIdToIdsList(linkIdsToMove, eachLink.id);
        var nextNodeForConnector = getNextNodeForConnector(eachLink);
        if (!eachLink.get('loopConnector')) {
            getNodesToMoveOnXAxis(nextNodeForConnector, moveNodesBy, endNodeId, false, nodeIdsToMove, linkIdsToMove);
        }
    });
}

function addIdToIdsList(idsList, id) {
    if (idsList && !idsList.includes(id)) {
        idsList.push(id);
    }
}

function resizePaper() {
    var maxAxisPosition = getMaxAxisPointsOfModel();
    maxAxisPosition = {
        x: maxAxisPosition.x + graphBuffer,
        y: maxAxisPosition.y + graphBuffer
    };

    if (maxAxisPosition.x < currentCanvasDimension.x) {
        maxAxisPosition.x = currentCanvasDimension.x;
    }
    if (maxAxisPosition.y < currentCanvasDimension.y) {
        maxAxisPosition.y = currentCanvasDimension.y;
    }
    setPaperDimension(maxAxisPosition);
}

function getMaxAxisPointsOfModel() {
    var eachCellPosition, bBox, vertices, eachVertex;
    var maxAxisPosition = { x: 0, y: 0 };
    _.each(graphId.getElements(), function(eachCell) {
        bBox = eachCell.getBBox();
        eachCellPosition = eachCell.get('position');
        if (maxAxisPosition.x < (eachCellPosition.x + bBox.width)) {
            maxAxisPosition.x = (eachCellPosition.x + bBox.width);
        }
        if (maxAxisPosition.y < (eachCellPosition.y + bBox.height)) {
            maxAxisPosition.y = (eachCellPosition.y + bBox.height);
        }
    });

    _.each(graphId.getLinks(), function(eachLink) {
        vertices = eachLink.get('vertices');

        _.each(vertices, function(eachVertex) {
            if (maxAxisPosition.x < eachVertex.x) {
                maxAxisPosition.x = eachVertex.x;
            }
            if (maxAxisPosition.y < eachVertex.y) {
                maxAxisPosition.y = eachVertex.y;
            }
        });
    });

    return maxAxisPosition;
}

function getMinAxisPointsOfModel() {
    var eachCellPosition, vertices, eachVertex;
    var minAxisPosition = { x: 0, y: 0 };
    _.each(graphId.getElements(), function(eachCell) {
        eachCellPosition = eachCell.get('position');

        if (minAxisPosition.x > (eachCellPosition.x)) {
            minAxisPosition.x = (eachCellPosition.x);
        }
        if (minAxisPosition.y > (eachCellPosition.y)) {
            minAxisPosition.y = (eachCellPosition.y);
        }
    });

    _.each(graphId.getLinks(), function(eachLink) {
        vertices = eachLink.get('vertices');

        _.each(vertices, function(eachVertex) {
            if (minAxisPosition.x > eachVertex.x) {
                minAxisPosition.x = eachVertex.x;
            }
            if (minAxisPosition.y > eachVertex.y) {
                minAxisPosition.y = eachVertex.y;
            }
        });
    });

    return minAxisPosition;
}

function setPaperDimension(paperDimension) {
    if (paperDimension.x && paperDimension.y) {
        paperId.setDimensions(paperDimension.x, paperDimension.y);
    }
}

function insert(main_string, ins_string, pos) {

    return [main_string.slice(0, pos), ins_string, main_string.slice(pos)].join("\n");
}

function getBrokenText(text, divideBy) {
    let indexOfLine = text.indexOf(":");
    if (indexOfLine == -1) {

    } else {
        var newStrings = '';
    }


    var text1 = insert(text, newStrings, ++indexOfLine);

    return breakText(textLengthPerNodeInPixels, text1, divideBy);
}

function breakText(width, text, divideBy) {
    if (!divideBy) {
        divideBy = 1;
    }
    var brokenText = joint.util.breakText(text, {
        width: width / divideBy

    });

    return brokenText.replace(":", " ").trim();
}

function getMaxNodeWidth(nodesArr) {
    var brokenNodeText;
    var nodeTextArr;
    var maxLength = 0;
    for (var idx = 0; idx < nodesArr.length; idx++) {
        brokenNodeText = getBrokenText(nodesArr[idx]);
        nodeTextArr = brokenNodeText.split("\n");

        for (var index = 0; index < nodeTextArr.length; index++) {
            maxLength = maxLength < nodeTextArr[index].length ? nodeTextArr[index].length : maxLength;
        }
    }

    return maxLength + 30;
}

function getMaxNodeWidthByNames(nodesArr) {
    var brokenNodeText;
    var nodeTextArr;
    var maxLength = 0;
    var nodeLength;
    for (var idx = 0; idx < nodesArr.length; idx++) {
        brokenNodeText = getBrokenText(nodesArr[idx]);
        nodeTextArr = brokenNodeText.split("\n");

        for (var index = 0; index < nodeTextArr.length; index++) {
            nodeLength = getTextLengthInPixels(nodeTextArr[index]); //nodeTextArr[index].length;
            maxLength = maxLength < nodeLength ? nodeLength : maxLength;
        }
    }

    if (maxLength > textLengthPerNodeInPixels * 1.10) {
        maxLength = textLengthPerNodeInPixels * 1.25;
    }

    return maxLength + 50;
}

function getTextLengthInPixels(nodeName) {
    var nodeLength = 0;
    var strLength = nodeName.length;
    var eachChar;
    var eachCharLength;
    for (var index = 0; index < strLength; index++) {
        eachChar = nodeName.charCodeAt(index);
        if (eachChar >= 65 && eachChar <= 90) // A-Z in caps
        {
            nodeLength += pixelsForCapitalLetters;
        } else {
            nodeLength += pixelsForSmallLetters;
        }
    }

    return nodeLength;
}

function initializePaperBehavior() {
    paperId.on('cell:pointerdown', function(cellView, evt, x, y) {
        var targetNode = cellView.model; // This is one we dragged and dropped.

        clickCount++;
        if (clickCount == 1) {
            singleClickTimer = setTimeout(function() {
                    clickCount = 0;
                },
                gapBetweenTwoClicks);
        } else if (clickCount == 2) {
            clearTimeout(singleClickTimer);
            clickCount = 0;
            handleDoubleClickOnNode(targetNode);
        }
    });
}
var views;

function handleDoubleClickOnNode(targetNode) {
    var externalLink = targetNode.get('externalLink');
    /*   views = externalLink.endsWith("abc");
      externalLink = externalLink.replace(",abc", ""); */
    externalLink.trim();
    if (externalLink) {
        var methodCallLink = flowDiagramFolder + externalLink;
        window.open(methodCallLink, "_blank");
    }
}

function setIfElseMultiplier(multiplier) {
    ifElseMultiplier = multiplier;
}

function hideThisFlowChart(flowChartDivId) {
    $('#' + flowChartDivId).hide();
}
/* 
function switchView()
{
	if(CURRENT_VIEW != JAVA_VIEW)
	{
		view = JAVA_VIEW;
	}
	else
	{
		view = NATURAL_LANGUAGE_VIEW;
	}
	
	CURRENT_VIEW = view;
	
	//alert("view : " + view);
	
	var divIdToShow;
	var divIdToHide;
	
	if(view == JAVA_VIEW)
	{
		divIdToShow = "javaStatementFlowChart";
		divIdToHide = "nlStatementFlowChart";
	}
	else
	{
		divIdToHide = "javaStatementFlowChart";
		divIdToShow = "nlStatementFlowChart";
	}
	
	$('#' + divIdToHide).fadeOut(200);//200 milliseconds
	$('#' + divIdToShow).fadeIn(200);
} */
/* var divIdToShow;
var divIdToHide; */
var languageForButton = 'natural';


function Java() {
    languageForButton = 'java';
    divIdToShow = "javaStatementFlowChart";
    divIdToHide = "nlStatementFlowChart";
    $('#' + divIdToHide).fadeOut(200); //200 millisecondsul.
    $('#' + divIdToShow).fadeIn(200);
}

function NaturalLanguage() {
    languageForButton = 'natural';
    divIdToHide = "javaStatementFlowChart";
    divIdToShow = "nlStatementFlowChart";
    $('#' + divIdToHide).fadeOut(200); //200 milliseconds
    $('#' + divIdToShow).fadeIn(200);
}

function enableFocus() {
    document.getElementById(languageForButton).focus();
    console.log(languageForButton);
}

window.onload = function() {
    const urlParams = new URLSearchParams(location.search);

    for (const [key, value] of urlParams) {
        CURRENT_VIEW = `${value}`;
        console.log(CURRENT_VIEW);
    }


    if (CURRENT_VIEW == NATURAL_LANGUAGE_VIEW) {
        NaturalLanguage();
        divIdToHide = "javaStatementFlowChart";
        divIdToShow = "nlStatementFlowChart";
        enableFocus();
    } else {
        Java();
        divIdToShow = "javaStatementFlowChart";
        divIdToHide = "nlStatementFlowChart";
        languageForButton = 'java';
        enableFocus()
    }
};