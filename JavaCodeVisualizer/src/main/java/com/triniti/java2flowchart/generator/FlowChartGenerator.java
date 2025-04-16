package com.triniti.java2flowchart.generator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Stack;
import java.util.stream.Collectors;

import com.triniti.java2flowchart.model.FlowChartLink;
import com.triniti.java2flowchart.model.FlowChartNode;

public class FlowChartGenerator {
	private boolean copiedDependencies;

	boolean addingIfConditionNode;
	boolean addingStopNode;

	boolean addingLoopConnector;

	private String logoPath;
	boolean addingFirstIfBlockNode;
	boolean addingFirstElseBlockNode;
	boolean isBreak;
	boolean isJavaStatment;
	Stack<FlowChartLink> loopNodesStack = new Stack<>();
	
	private int nodeNameIndex = 0;
	private int linkNameIndex = 0;
	private int nodeIndex = 0;
	private int currentIfElseLevel = -1;
	private int ifElseLevelIndicator = 0;

	private double ifElseMultiplier = 1.1;
	// start code By shailendra prasad
	private static Properties configProps;
	// end code by shailendra prasad
	private String projectName;

	private String className;
	private String lastLinkName;

	private String methodName;
	private String sourceFolder;
	private String flowDiagramFolder;

	private String graphId;

	private Integer ifBranchWidthInElsePath;
	private Integer elseBranchWidthInIfPath;

	private Map<String, String> javaClassAndFileMap;
	public static List<String> missedMethods = new ArrayList<>();

	private void readProperties() throws Exception {
		configProps = new Properties();
		try (InputStream inputStream = new FileInputStream("config.properties")) {
			configProps.load(inputStream);
		}
	}

	public FlowChartGenerator() {
		try {
			this.readProperties();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
	}

	public void generateFlowChart(String packageName, String className, String methodName,
			List<Object> javaStatementsForFlowchart, List<Object> naturalStatementsForFlowchart,
			String methodDescription) {
		File flowChartFile = null;
		int noOfFolders = 0;
		StringBuilder fileNameBuilder = null;

		File sampleFolder = null;
		File[] folders = null;

		if (javaStatementsForFlowchart == null) {
			return;
		}

		setClassName(className);
		setMethodName(methodName);

		javaStatementsForFlowchart.add(new FlowChartNode("Stop"));
		naturalStatementsForFlowchart.add(new FlowChartNode("Stop"));

		fileNameBuilder = new StringBuilder(flowDiagramFolder);

		fileNameBuilder.append(projectName).append(File.separator);

		if (packageName != null) {
			fileNameBuilder.append(packageName).append(File.separator);
		}

		fileNameBuilder.append(className).append(File.separator);
		fileNameBuilder.append(methodName).append(".html");

		flowChartFile = new File(fileNameBuilder.toString());

		flowChartFile.getParentFile().mkdirs();

		if (packageName != null && packageName.trim().length() > 0) {
			packageName = packageName.replace(File.separator, "/");
			noOfFolders = packageName.split("/").length;
		}

		noOfFolders++;

		try (FileWriter fw = new FileWriter(flowChartFile);) {
			StringBuilder flowChartBuilder = new StringBuilder();

			String backFolderPath = "";
			for (int folderIndex = 0; folderIndex <= noOfFolders; folderIndex++) {
				backFolderPath += "../";
			}

			flowChartBuilder.append(getHeaderHTMLContent(backFolderPath, methodDescription, packageName));

			nodeNameIndex = 0;
			linkNameIndex = 0;

			StringBuilder nlStmtsFlowChartCode = buildFlowChart(naturalStatementsForFlowchart, noOfFolders, className,
					methodName, false, backFolderPath,packageName);

			flowChartBuilder.append(nlStmtsFlowChartCode);

			StringBuilder javaStmtsFlowChartCode = buildFlowChart(javaStatementsForFlowchart, noOfFolders, className,
					methodName, true, backFolderPath,packageName);
			flowChartBuilder.append(javaStmtsFlowChartCode);

			flowChartBuilder.append(getFooterHTMLContent());

			fw.write(flowChartBuilder.toString());
			fw.flush();

			sampleFolder = new File("generated/sample");
			folders = sampleFolder.listFiles();

			if (!copiedDependencies) {
				for (File file : folders) {
					copyFolder(file, new File(flowDiagramFolder + file.getName()));
				}
				copiedDependencies = true;
			}

		} catch (Exception e) {
			// e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	private StringBuilder buildFlowChart(List<Object> statementsForFlowchart, int noOfFolders, String className,
			String methodName, boolean sourceCodeMode, String backFolderPath,String packageName) {

		loopNodesStack.clear();

		StringBuilder flowChartBuilder = new StringBuilder();

		String divId = null;
		String paperId = null;

		String startNodeName;
		String stopNodeName;

		String nodeName = null;
		String linkName = null;
		String previousNodeName = null;

		StringBuilder nodesBuilder = new StringBuilder();
		StringBuilder linksBuilder = new StringBuilder();

		FlowChartNode flowChartNode = null;
		Object previousNode = null;
		String lastIfBlockNode = null;
		Object node = null;

		List<String> lastNodesInIfAndElseBlocks = null;

		startNodeName = "rect" + nodeNameIndex;

		previousNodeName = startNodeName;

		statementsForFlowchart = statementsForFlowchart.stream().filter(eachNode -> eachNode != null)
				.filter(eachNode -> eachNode instanceof FlowChartNode || eachNode instanceof List)
				.collect(Collectors.toList());

		if (sourceCodeMode) {
			divId = "javaStatementFlowChart";
			paperId = "javaStatementsPaper";
			graphId = "javaStatementsGraph";
			isJavaStatment=true;

		} else {
			divId = "nlStatementFlowChart";
			paperId = "nlStatementsPaper";
			graphId = "nlStatementsGraph";
			isJavaStatment=false;

		}

		int noOfNodes = statementsForFlowchart.size();

		for (int index = 0; index < noOfNodes; index++) {
			if (index == noOfNodes - 1) {
				addingStopNode = true;
			} else {
				addingStopNode = false;
			}

			node = statementsForFlowchart.get(index);
			if (node instanceof FlowChartNode) {
				flowChartNode = (FlowChartNode) node;
				nodeName = "rect" + (++nodeNameIndex);
				linkName = "link" + (++linkNameIndex);

				nodeIndex++;
				addNodeAndLink(flowChartNode, nodesBuilder, linksBuilder, previousNodeName, nodeName, linkName, null,
						null,packageName);

				if (lastIfBlockNode != null) {
					linkName = "link" + (++linkNameIndex);
					addLink(linksBuilder, linkName, lastIfBlockNode, nodeName);
					lastIfBlockNode = null;
				}

				previousNodeName = nodeName;
			} else if (node instanceof List) {
				if (isItAForLoop((List<Object>) node)) {
					previousNodeName = addForLoopNodes((List<Object>) node, nodesBuilder, linksBuilder,
							previousNodeName, false, false,packageName);
				} else if (isItAWhileLoop((List<Object>) node)) {
					previousNodeName = addWhileLoopNodes((List<Object>) node, nodesBuilder, linksBuilder,
							previousNodeName,packageName);
				} else if (isItAnIfBlock((List<Object>) node)) {
					lastNodesInIfAndElseBlocks = addIfNodes((List<Object>) node, nodesBuilder, linksBuilder,
							previousNodeName, lastIfBlockNode, null, 0, 0,packageName );
					lastIfBlockNode = lastNodesInIfAndElseBlocks.get(0);
					lastIfBlockNode = null;
					previousNodeName = lastNodesInIfAndElseBlocks.get(1);
				} else {

					System.err.println("UNKNOWN LIST");
					continue;
				}
			} else {
				System.err.println("ELSE : " + (flowChartNode == null));
				continue;
			}

			if (previousNode != null) {
				handleTailLinksIfPreviousNodeIsIfElseBlock(previousNode, nodesBuilder, linksBuilder, lastLinkName);
			}

			previousNode = node;
		}

		stopNodeName = previousNodeName;
		flowChartBuilder.append("\n        <div id='" + divId + "' style='display:block;'></div>");

		flowChartBuilder.append("\n        <script type='text/javascript'>");
		try {
			flowChartBuilder.append("\n            var " + graphId + " = new joint.dia.Graph;");
			flowChartBuilder.append("\n");
			flowChartBuilder.append("\n            var " + paperId + " = new joint.dia.Paper({");
			flowChartBuilder.append("\n                el: document.getElementById('" + divId + "'),");
			flowChartBuilder.append("\n                interactive: false,");
			flowChartBuilder.append("\n                model: " + graphId + ",");
			flowChartBuilder.append("\n                width: 1000,");// Default width, will be varying based on the
																		// flow chart actual size
			flowChartBuilder.append("\n                height: " + (++nodeNameIndex) * 100 + ",");
			flowChartBuilder.append("\n                gridSize: 1");
			flowChartBuilder.append("\n            });");
			flowChartBuilder.append("\n");
			flowChartBuilder.append("\n            var flowChartNode;");
			flowChartBuilder.append("\n            var resizeWidth;");
			flowChartBuilder.append("\n            var nodesArr = [];");
			flowChartBuilder.append("\n");

			addCodeToFindMaxNodeWidth(statementsForFlowchart, flowChartBuilder);

			flowChartBuilder.append("\n");
			flowChartBuilder.append("\n            var gapBetweenNodes = 40;");
			flowChartBuilder.append("\n            maxNodeWidth = getMaxNodeWidthByNames(nodesArr);");
			flowChartBuilder.append("\n\n");
			flowChartBuilder.append("\n            var " + startNodeName + " = ellipse.clone();");
			flowChartBuilder.append("\n            " + startNodeName + ".addTo(" + graphId + ");");
			flowChartBuilder.append("\n            " + startNodeName + ".attr('text/text', 'Start');");
			flowChartBuilder.append("\n            " + startNodeName + ".attr('circle/stroke', '"
					+ configProps.getProperty("circle-start-color") + "',);");
			flowChartBuilder.append("\n            " + startNodeName + ".attr('circle/fill', 'white',);");
			flowChartBuilder.append("\n            " + startNodeName + ".attr('text/fill', 'black');");
			flowChartBuilder.append("\n");
			flowChartBuilder.append("\n            rootNode = " + startNodeName + ";");
			flowChartBuilder.append(nodesBuilder);
			flowChartBuilder.append("\n");
			flowChartBuilder.append(linksBuilder);

			flowChartBuilder.append("\n");
			flowChartBuilder.append("\n            " + startNodeName + ".set('startNode', 'true');");
			flowChartBuilder.append("\n            " + stopNodeName + ".set('stopNode', 'true');");
			flowChartBuilder.append("\n            " + stopNodeName + ".attr('circle/stroke', '"
					+ configProps.getProperty("circle-start-color") + "',);");
			flowChartBuilder.append("\n            " + stopNodeName + ".attr('circle/fill', 'white',);");
			flowChartBuilder.append("\n            " + stopNodeName + ".attr('text/fill', 'black');");
			flowChartBuilder
					.append("\n            " + stopNodeName + ".translate((maxNodeWidth - 100)/ 2, " + 0 + ");");
			flowChartBuilder.append("\n");

			flowChartBuilder.append("\n            setFlowDiagramFolder('" + backFolderPath + "');");
			flowChartBuilder.append("\n            setIfElseMultiplier(" + ifElseMultiplier + ");");
			flowChartBuilder.append("\n");
			flowChartBuilder.append("\n            setPaperId(" + paperId + ");");
			flowChartBuilder.append("\n            setGraphId(" + graphId + ");");
			flowChartBuilder.append("\n            moveNodesOnYAxis(gapBetweenNodes);");
			flowChartBuilder.append("\n            moveIfElseBlocks();");
			flowChartBuilder.append("\n            moveImproperIfElseBlocks();");
			flowChartBuilder.append("\n            moveImproperWhileBlocks();");
			flowChartBuilder.append("\n            moveInvisibleNodes();");
			flowChartBuilder.append("\n            beautifyLoopConnectors();");
			flowChartBuilder.append("\n            alignStopNode(" + startNodeName + ", " + stopNodeName + ");");
			flowChartBuilder.append("\n            resizePaper();");
			flowChartBuilder.append("\n            initializePaperBehavior();");
			if (!sourceCodeMode) {
				flowChartBuilder.append("\n            hideThisFlowChart('" + divId + "');");
			}
			flowChartBuilder.append("\n        </script>");
		} catch (Throwable t) {
			// missedMethods.add(className + "." + methodName);
			// t.printStackTrace();
			// System.err.println(className + " : " + methodName);
		}

		return flowChartBuilder;
	}

	/**
	 * @param backFolderPath
	 * @param methodDescription
	 * @return
	 */
	private StringBuilder getHeaderHTMLContent(String backFolderPath, String methodDescription, String packageName) {
		StringBuilder headerHtmlContent = new StringBuilder();

		headerHtmlContent.append("<!DOCTYPE html>");
		headerHtmlContent.append("\n<html>");
		headerHtmlContent.append("\n    <head>");
		headerHtmlContent.append("<link rel='icon' href='" + backFolderPath + "dependencies/images/"
				+ configProps.getProperty("favicon") + "' >  ");
		headerHtmlContent.append("\n    <!-- dependencies -->");
		headerHtmlContent.append("\n        <title>").append(className).append(".").append(methodName)
				.append("</title>");
		headerHtmlContent
				.append("\n        <script src='" + backFolderPath + "dependencies/jquery/jquery.js'></script>");
		headerHtmlContent
				.append("\n        <script src='" + backFolderPath + "dependencies/lodash/lodash.js'></script>");
		headerHtmlContent
				.append("\n        <script src='" + backFolderPath + "dependencies/backbone/backbone.js'></script>");
		headerHtmlContent
				.append("\n        <script src='" + backFolderPath + "dependencies/jointjs/joint.js'></script>");
		headerHtmlContent
				.append("\n        <script src='" + backFolderPath + "dependencies/joint_helper.js'></script>");
		headerHtmlContent.append("\n        <link rel='stylesheet' type='text/css' href='" + backFolderPath
				+ "dependencies/jointjs/joint.css' />");
		headerHtmlContent.append("\n        <link rel='stylesheet' type='text/css' href='" + backFolderPath
				+ "dependencies/slider/slider.css' />");

		headerHtmlContent.append("\n		<style type=\"text/css\">");
		headerHtmlContent.append("\n			:root {");
		headerHtmlContent.append("\n			    font: message-box;");
		headerHtmlContent.append("\n			}");

		headerHtmlContent.append("\n        .natural_language{");
		headerHtmlContent
				.append("\n         text-transform: " + configProps.getProperty("btnTextCaseUperOrLower") + ";");
		headerHtmlContent.append("\n         background: #ffffff;");
		headerHtmlContent.append("\n         padding: 10px; ");
		headerHtmlContent.append("\n         border: 2px solid black !important;");
		headerHtmlContent.append("\n         border-radius: 6px;");
		headerHtmlContent.append("\n         display: inline-block;");
		headerHtmlContent.append("\n         transition: all 0.3s ease 0s;}");
		headerHtmlContent.append("\n        .natural_language:hover,.natural_language:focus  {");
		headerHtmlContent.append("\n          color: white !important;");
		headerHtmlContent.append("\n         background-color: blue;}");

		headerHtmlContent.append("\n        .java {");
		headerHtmlContent
				.append("\n         text-transform: " + configProps.getProperty("btnTextCaseUperOrLower") + ";");
		headerHtmlContent.append("\n         background: #ffffff;");
		headerHtmlContent.append("\n         padding: 10px;");
		headerHtmlContent.append("\n         border: 2px solid black !important;");
		headerHtmlContent.append("\n         border-radius: 6px;");
		headerHtmlContent.append("\n         display: inline-block;");
		headerHtmlContent.append("\n         transition: all 0.3s ease 0s;}");
		headerHtmlContent.append("\n        .java:hover,.java:focus {");
		headerHtmlContent.append("\n         color: white !important;");
		headerHtmlContent.append("\n         background-color: blue;}");

		/**
		 * @author shailendrakumar.pras Code added for-IS110103 Provide description for
		 *         colors and boxes in Right top
		 */
		headerHtmlContent.append("\n          .flow-head {");
		headerHtmlContent.append("\n           width: 100%;");
		headerHtmlContent.append("\n 		   margin: auto;");
		headerHtmlContent.append("\n 		   }");
		headerHtmlContent.append("\n 		  .flow-1{");
		headerHtmlContent.append("\n 		   width: 80%;");
		headerHtmlContent.append("\n 		   float: left;");
		headerHtmlContent.append("\n		   height: auto;");
		headerHtmlContent.append("\n 			}");

		headerHtmlContent.append("\n 		  .flow-2{");
		headerHtmlContent.append("\n 		   width: 20%;");
		headerHtmlContent.append("\n 		   float: left;");
		headerHtmlContent.append("\n		   height: auto;");
		headerHtmlContent.append("\n 			}");

		headerHtmlContent.append("\n        .one {");
		headerHtmlContent.append("\n        width: 12%;");
		headerHtmlContent.append("\n        margin-top: 35px;");
		headerHtmlContent.append("\n        float: left;");
		headerHtmlContent.append("\n        height: auto;");
		headerHtmlContent.append("\n        }");
		headerHtmlContent.append("\n        .two {");
		headerHtmlContent.append("\n        width: 88%;");
		headerHtmlContent.append("\n        margin-top: 35px;");
		headerHtmlContent.append("\n        float: left;");
		headerHtmlContent.append("\n        height: auto;");
		headerHtmlContent.append("\n        }");
		headerHtmlContent.append("\n        .circle {");
		headerHtmlContent.append("\n        width: 20px;");
		headerHtmlContent.append("\n        height: 20px;");
		headerHtmlContent.append("\n        border-radius: 50%;");
		headerHtmlContent.append("\n        margin-bottom: 2px;");
		headerHtmlContent.append("\n        }");
		headerHtmlContent.append("\n        .text {");
		headerHtmlContent.append("\n        line-height: 20px;");
		headerHtmlContent.append("\n        margin-bottom: 2px; ");
		headerHtmlContent.append("\n        }");

		headerHtmlContent.append("\n		</style>");

		headerHtmlContent.append("\n");
		headerHtmlContent.append("\n   <script type='text/javascript'>");
		headerHtmlContent.append("\n   var textColor = '" + configProps.getProperty("text_color") + "';");// #EEE
		headerHtmlContent.append("\n   var backGroundColor = '" + configProps.getProperty("backGroundColor") + "';");// #22F
		headerHtmlContent.append("\n    var rhombus = new joint.shapes.basic.Rhombus({");
		headerHtmlContent.append("\n       size: {");
		headerHtmlContent.append("\n       width: 120, height: 60,");
		headerHtmlContent.append("\n       height: 60");
		headerHtmlContent.append("\n             },");
		headerHtmlContent.append("\n      attrs: {");
		headerHtmlContent.append("\n          path: {");
		headerHtmlContent.append("\n          d: 'M 50 0 L 0 49 0 51 50 100 100 51 100 49 z',");
		headerHtmlContent.append("\n          fill: '" + configProps.getProperty("backGroundColor") + "',");
		headerHtmlContent.append("\n          stroke: '" + configProps.getProperty("rhombus_backGroundColor") + "',");
		headerHtmlContent.append("\n          strokeWidth: " + configProps.getProperty("boder_line_Width") + ",");
		headerHtmlContent.append("\n          cursor: 'context-menu'");
		headerHtmlContent.append("\n                 },");
		headerHtmlContent.append("\n       text: {");
		headerHtmlContent.append("\n       text: 'Rhombus',");
		headerHtmlContent.append("\n       fill: textColor,");
		headerHtmlContent.append("\n       cursor: 'context-menu'");
		headerHtmlContent.append("\n              }");
		headerHtmlContent.append("\n            }");
		headerHtmlContent.append("\n      });");
		headerHtmlContent.append("\n      rhombus.position(400, 30);");
		headerHtmlContent.append("\n      rhombus.set('nodeType', 'Rhombus');");

		headerHtmlContent.append("\n");
		headerHtmlContent.append("\n      var ellipse = new joint.shapes.basic.Circle({");
		headerHtmlContent.append("\n      size: { ");
		headerHtmlContent.append("\n         width: 100, height: 40 ");
		headerHtmlContent.append("\n            },");
		headerHtmlContent.append("\n      attrs: { ");
		headerHtmlContent.append("\n            text: { ");
		headerHtmlContent.append("\n            text: 'Ellipse', fill: textColor,");
		headerHtmlContent.append("\n            cursor: 'context-menu'");
		headerHtmlContent.append("\n                  },");
		headerHtmlContent.append("\n          circle: { ");
		headerHtmlContent.append("\n               fill:'blue', ");
		headerHtmlContent.append("\n               strokeWidth:" + configProps.getProperty("boder_line_Width") + ",");
		headerHtmlContent.append("\n               cursor:'context-menu',");
		headerHtmlContent.append("\n                  }");
		headerHtmlContent.append("\n              }");
		headerHtmlContent.append("\n          });");
		headerHtmlContent.append("\n      ellipse.position(400, 30);");

		headerHtmlContent.append("\n");
		headerHtmlContent.append("\n    var rect = new joint.shapes.standard.Rectangle();");
		headerHtmlContent.append("\n    rect.attr({");
		headerHtmlContent.append("\n          body: {");
		headerHtmlContent.append("\n            fill: '" + configProps.getProperty("backGroundColor") + "',");
		headerHtmlContent.append("\n            rx: 10,");
		headerHtmlContent.append("\n            ry: 10,");
		headerHtmlContent.append("\n            strokeWidth: " + configProps.getProperty("boder_line_Width") + ",");
		headerHtmlContent
				.append("\n            stroke:'" + configProps.getProperty("rectangle_backGroundColor") + "',");
		headerHtmlContent.append("\n            cursor: 'context-menu',");
		headerHtmlContent.append("\n                },");
		headerHtmlContent.append("\n          label: {");
		headerHtmlContent.append("\n             text: 'Rectangle',");
		headerHtmlContent.append("\n             cursor:'context-menu'");
		headerHtmlContent.append("\n                 }");
		headerHtmlContent.append("\n            });");
		headerHtmlContent.append("\n     rect.position(400, 30);");
		headerHtmlContent.append("\n     rect.resize(100, 40);");
		headerHtmlContent.append("\n     rect.set('nodeType', 'Rectangle');");

		headerHtmlContent.append("\n");
		headerHtmlContent.append("\n    var link = new joint.shapes.standard.Link({");
		headerHtmlContent.append("\n    attrs: {");
		headerHtmlContent.append("\n      line: { ");
		headerHtmlContent.append("\n      strokeWidth: 1.5");// stroke: backGroundColor
		headerHtmlContent.append("\n             }");
		headerHtmlContent.append("\n           }");
		headerHtmlContent.append("\n                                              });");
		headerHtmlContent.append("\n    link.connector('rounded', { radius: 15 });");
		headerHtmlContent.append("\n    </script>");
		headerHtmlContent.append("\n    </head>");
		headerHtmlContent.append("\n    <body onUnload='unLoadPage()'>");
		if (logoPath == null) {

			logoPath = backFolderPath + "dependencies/images/";
		}
		headerHtmlContent.append("\n <div class='flow-head'>");
		headerHtmlContent.append("\n   <div class='flow-1'>");
		headerHtmlContent.append("\n   <img height='" + configProps.getProperty("logo-icon-height") + "' width='"
				+ configProps.getProperty("logo-icon-width") + "' alt='" + configProps.getProperty("logo-icon-aelrt")
				+ "' src='" + backFolderPath + "dependencies/images/" + configProps.getProperty("logo-icon")
				+ "'  /> ");

		headerHtmlContent.append("\n        <h2 style='text-decoration:none' target='_blank'> Package-Name : "
				+ packageName.replace("/", ".") + "</h2>");
		headerHtmlContent.append("\n        <h3><a style='text-decoration:none' target='_blank' href='index.html'>"
				+ "Class-Name : " + className + "</a>" + "</h3>");
		headerHtmlContent.append(
				"\n        <h4 style='text-decoration:none' target='_blank'> Method-Name : " + methodName + "</h4>");
		headerHtmlContent.append("\n      <p>" + methodDescription + "</p>");

		/**
		 * headerHtmlContent.
		 * append("\n  <button class='java' autofocus onClick='Java();'><b>&nbsp;&nbsp&nbsp;&nbsp; "
		 * + configProps.get("java-text") + "&nbsp;&nbsp&nbsp;&nbsp;</b></button>");
		 */
		headerHtmlContent
				.append("\n  <button class='natural_language' id='natural'  onClick='NaturalLanguage();'><b>&nbsp&nbsp;"
						+ configProps.get("natural-language-text") + "&nbsp&nbsp;</b></button>");
		
		headerHtmlContent.append("\n  <button class='java' id='java'  onClick='Java();'><b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; "
				+ configProps.get("java-text") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</b></button>");
		headerHtmlContent.append("\n            </div>");
		/**
		  @author shailendrakumar.prasad Code added for-IS110103 Provide description
		          for colors and boxes in Right top
		 */
		headerHtmlContent.append("\n</div>");// close "<div class='flow-1'>
		headerHtmlContent.append("<div class='flow-2'>");
		if (configProps.getProperty("isColored").equalsIgnoreCase("Yes")) {
			headerHtmlContent.append("\n         <div class='one'> ");// start <div class="one">
			// headerHtmlContent.append("\n <div class='circle ' style='background-color:
			// "+configProps.getProperty("circle-start-color")+";'></div>");
			headerHtmlContent.append("\n         <div class='circle ' style='background-color: "
					+ configProps.getProperty("drill_backGroundColor") + ";'></div>");
			headerHtmlContent.append("\n         <div class='circle ' style='background-color: "
					+ configProps.getProperty("rhombus_backGroundColor") + ";'></div>");
			headerHtmlContent.append("\n         <div class='circle ' style='background-color: "
					+ configProps.getProperty("loopColor") + ";'></div>");
			headerHtmlContent.append("\n         <div class='circle ' style='background-color: "
					+ configProps.getProperty("rectangle_backGroundColor") + ";'></div>");
			// headerHtmlContent.append("\n <div class='circle ' style='background-color:
			// "+configProps.getProperty("printStatementColore")+";'></div>");
			// headerHtmlContent.append("\n <div class='circle ' style='background-color:
			// "+configProps.getProperty("circle-stop-color")+";'></div>");
			headerHtmlContent.append("\n         </div>");// close </div class="one">
			headerHtmlContent.append("\n         <div class='two'>");// start <div class="two">
			// headerHtmlContent.append("\n <div
			// class='text'>"+configProps.getProperty("Start-color-message")+"</div>");
			headerHtmlContent
					.append("\n         <div class='text'>" + configProps.getProperty("method-color-Call") + "</div>");
			headerHtmlContent.append(
					"\n         <div class='text'>" + configProps.getProperty("rhombus-color-message") + "</div>");
			headerHtmlContent
					.append("\n         <div class='text'>" + configProps.getProperty("loop-color-message") + "</div>");
			headerHtmlContent.append(
					"\n         <div class='text'>" + configProps.getProperty("variable-color-message") + "</div>");
			// headerHtmlContent.append("\n <div
			// class='text'>"+configProps.getProperty("print-color-message")+"</div>");
			// headerHtmlContent.append("\n <div
			// class='text'>"+configProps.getProperty("stop-color-message")+"</div>");
			headerHtmlContent.append("\n         </div>");// close </div class="two>

		} else {
			headerHtmlContent.append("\n         <div class='one'> ");// start <div class="one">
			headerHtmlContent.append("\n         <div class='circle ' style='background-color: "
					+ configProps.getProperty("circle-start-color") + ";'></div>");
			headerHtmlContent.append("\n         <div class='circle ' style='background-color: "
					+ configProps.getProperty("drill_backGroundColor") + ";'></div>");
			headerHtmlContent.append("\n         <div class='circle ' style='background-color: "
					+ configProps.getProperty("rectangle_backGroundColor") + ";'></div>");
			headerHtmlContent.append("\n         <div class='circle ' style='background-color: "
					+ configProps.getProperty("rhombus_backGroundColor") + ";'></div>");
			headerHtmlContent.append("\n         <div class='circle ' style='background-color: "
					+ configProps.getProperty("circle-stop-color") + ";'></div>");
			headerHtmlContent.append("\n         </div>");// close </div class="one">
			headerHtmlContent.append("\n         <div class='two'>");// start <div class="two">
			headerHtmlContent.append(
					"\n         <div class='text'>" + configProps.getProperty("Start-color-message") + "</div>");
			headerHtmlContent
					.append("\n         <div class='text'>" + configProps.getProperty("method-color-Call") + "</div>");
			headerHtmlContent.append(
					"\n         <div class='text'>" + configProps.getProperty("rectrangle-color-Meaasge") + "</div>");
			headerHtmlContent.append(
					"\n         <div class='text'>" + configProps.getProperty("rhombus-color-message") + "</div>");
			headerHtmlContent
					.append("\n         <div class='text'>" + configProps.getProperty("stop-color-message") + "</div>");
			headerHtmlContent.append("\n         </div>");// close </div class="two>
		}
		headerHtmlContent.append("\n              </div>");// close </div class="flow-2">
		headerHtmlContent.append("\n              </div>");// close <div class='flow-head'>
		headerHtmlContent.append("\n              <div style=\"width: 100%; clear: both;\"></div>");
		return headerHtmlContent;
	}

	private StringBuilder getFooterHTMLContent() {
		StringBuilder footerHtmlContent = new StringBuilder();

		footerHtmlContent.append("\n    </body>");
		footerHtmlContent.append("\n</html>");

		return footerHtmlContent;
	}

	private String addWhileLoopNodes(List<Object> node, StringBuilder nodesBuilder, StringBuilder linksBuilder,
			String previousNodeName,String packageName) {

		FlowChartLink forLoopConnector = new FlowChartLink();
		forLoopConnector.setItsAWhileLoop(true);
		loopNodesStack.add(forLoopConnector);

		List<Object> whileBlock = (List<Object>) node;

		whileBlock.remove(0);

		List conditionList = (List) (whileBlock).get(0);

		FlowChartNode flowChartNode = (FlowChartNode) conditionList.get(0);
		String nodeName = "rect" + (++nodeNameIndex);
		String linkName = "link" + (++linkNameIndex);

		nodeIndex++;
		addNodeAndLink(flowChartNode, nodesBuilder, linksBuilder, previousNodeName, nodeName, linkName, null, null,packageName);
		previousNodeName = nodeName;

		List<Object> whileLoopStmts = (List) whileBlock.get(1);

		previousNodeName = addLoopNodes(nodesBuilder, linksBuilder, previousNodeName, whileLoopStmts, null, null,packageName);

		return previousNodeName;
	}

	private String addForLoopNodes(List<Object> node, StringBuilder nodesBuilder, StringBuilder linksBuilder,
			String previousNodeName, Boolean ifBlock, Boolean elseBlock,String packageName) {
		FlowChartLink forLoopConnector = new FlowChartLink();
		forLoopConnector.setItsAForLoop(true);
		loopNodesStack.push(forLoopConnector);

		List<Object> forBlock = (List<Object>) node;

		forBlock.remove(0);

		List conditionList = (List) forBlock.get(0);

		FlowChartNode flowChartNode = (FlowChartNode) conditionList.get(0);

		String nodeName = "rect" + (++nodeNameIndex);
		String linkName = "link" + (++linkNameIndex);
		nodeIndex++;

		addNodeAndLink(flowChartNode, nodesBuilder, linksBuilder, previousNodeName, nodeName, linkName, ifBlock,
				elseBlock,packageName);
		previousNodeName = nodeName;

		List<Object> forLoopStmts = (List) forBlock.get(1);

		previousNodeName = addLoopNodes(nodesBuilder, linksBuilder, previousNodeName, forLoopStmts, ifBlock, elseBlock,packageName);

		return previousNodeName;
	}

	private List<String> addIfNodes(List<Object> node, StringBuilder nodesBuilder, StringBuilder linksBuilder,
			String previousNodeName, String lastIfBlockNode, Boolean ifOrElseBlock, int nodeCounterInIf,
			int nodeCounterInElse,String packageName) {
		boolean hasOnlyIfBlock = false;
		boolean hasOnlyElseBlock = false;

		List<Object> ifBlock = null;
		List<Object> elseBlockNode = null;
		List<FlowChartNode> ifCondition = null;
		List<String> lastNodesInIfAndElseBlocks = new ArrayList<>();

		FlowChartNode ifConditionNode = null;
		FlowChartNode flowChartNode = null;

		String nodeName = null;
		String linkName = null;
		String ifConditionNodeName = null;
		String ifConditionName = null;

		int previousNodeIndex;
		int ifNodeIndex = 0;
		int nodeCounter = 0;
		int noOfElseStatements;

		if (ifOrElseBlock != null) {
			if (ifOrElseBlock.booleanValue()) {
				ifElseLevelIndicator--;
			} else {
				ifElseLevelIndicator++;
			}
		}

		currentIfElseLevel++;

		node.remove(0);

		ifCondition = (List<FlowChartNode>) ((List) node).get(0);

		if (((List) node).size() > 1) {
			ifBlock = (List<Object>) ((List) node).get(1);

			if (((List) node).size() > 2) {
				elseBlockNode = (List<Object>) ((List) node).get(2);
			}
		}

		ifBranchWidthInElsePath = -2;
		elseBranchWidthInIfPath = -2;

		findNoOfLevelsInTheIfElseTree(ifBlock, true, false);

		if (elseBlockNode != null && elseBlockNode.size() > 0) {
			findNoOfLevelsInTheIfElseTree(elseBlockNode, false, true);
		}

		int ifBranchWidthInElsePathLocal = ifBranchWidthInElsePath;
		int elseBranchWidthInIfPathLocal = elseBranchWidthInIfPath;

		if ((ifBlock != null && ifBlock.size() > 0)
				&& ((elseBlockNode != null && elseBlockNode.size() == 0) || elseBlockNode == null)) {
			hasOnlyIfBlock = true;
		}

		if ((elseBlockNode != null && elseBlockNode.size() > 0)
				&& ((ifBlock != null && ifBlock.size() == 0) || ifBlock == null)) {
			hasOnlyElseBlock = true;
		}

		nodeName = "rect" + (++nodeNameIndex);
		linkName = "link" + (++linkNameIndex);

		nodeIndex++;

		ifConditionNode = ifCondition.get(0);
		ifConditionNodeName = nodeName;

		addingIfConditionNode = true;
		addNodeAndLink(ifConditionNode, nodesBuilder, linksBuilder, previousNodeName, nodeName, linkName, null, null,packageName);
		addingIfConditionNode = false;

		previousNodeName = nodeName;
		ifConditionName = nodeName;
		previousNodeIndex = nodeIndex;

		int noOfIfBlockNodes = ifBlock.size();

		Object ifBlockNode;

		for (int index = 0; index < noOfIfBlockNodes; index++) {
			if (index == 0) {
				addingFirstIfBlockNode = true;
			} else {
				addingFirstIfBlockNode = false;
			}

			ifBlockNode = ifBlock.get(index);

			if (ifBlockNode instanceof FlowChartNode) {
				flowChartNode = (FlowChartNode) ifBlockNode;

				nodeName = "rect" + (++nodeNameIndex);
				linkName = "link" + (++linkNameIndex);

				ifNodeIndex++;

				addNodeAndLink(flowChartNode, nodesBuilder, linksBuilder, previousNodeName, nodeName, linkName,
						Boolean.TRUE, null,packageName);
				previousNodeName = nodeName;
			} else if (ifBlockNode instanceof List) {
				if (isItAForLoop((List<Object>) ifBlockNode)) {
					previousNodeName = addForLoopNodes((List<Object>) ifBlockNode, nodesBuilder, linksBuilder,
							previousNodeName, Boolean.TRUE, Boolean.FALSE,packageName);
				}
				if (isItAWhileLoop((List<Object>) ifBlockNode)) {
					previousNodeName = addWhileLoopNodes((List<Object>) ifBlockNode, nodesBuilder, linksBuilder,
							previousNodeName,packageName);
				} else if (isItAnIfBlock((List<Object>) ifBlockNode)) {
					List<String> returnValues = addIfNodes((List<Object>) ifBlockNode, nodesBuilder, linksBuilder,
							previousNodeName, lastIfBlockNode, Boolean.TRUE, nodeCounter, 0,packageName);
					previousNodeName = returnValues.get(1);
				} else {
					for (Object object : (List<Object>) ifBlockNode) {
						if (object instanceof FlowChartNode) {
							flowChartNode = (FlowChartNode) object;

							nodeName = "rect" + (++nodeNameIndex);
							linkName = "link" + (++linkNameIndex);

							ifNodeIndex++;

							addNodeAndLink(flowChartNode, nodesBuilder, linksBuilder, previousNodeName, nodeName,
									linkName, Boolean.TRUE, null,packageName);
							previousNodeName = nodeName;
						}
					}
				}
			} else {
				System.err.println("UNKNOWN OBJECT");
			}
			nodeCounter++;
		}

		lastIfBlockNode = previousNodeName;
		ifNodeIndex = previousNodeIndex;

		if (elseBlockNode != null && elseBlockNode.size() > 0) {
			noOfElseStatements = elseBlockNode.size();
			previousNodeName = ifConditionName;

			for (int index = 0; index < noOfElseStatements; index++) {
				if (index == 0) {
					addingFirstElseBlockNode = true;
				} else {
					addingFirstElseBlockNode = false;
				}
				if (elseBlockNode.get(index) instanceof FlowChartNode) {
					nodeName = "rect" + (++nodeNameIndex);
					linkName = "link" + (++linkNameIndex);

					ifNodeIndex++;

					addNodeAndLink((FlowChartNode) elseBlockNode.get(index), nodesBuilder, linksBuilder,
							previousNodeName, nodeName, linkName, null, Boolean.TRUE,packageName);
					previousNodeName = nodeName;
				} else if (elseBlockNode.get(index) instanceof List) {
					if (isItAForLoop((List<Object>) elseBlockNode.get(index))) {
						previousNodeName = addForLoopNodes((List<Object>) elseBlockNode.get(index), nodesBuilder,
								linksBuilder, previousNodeName, Boolean.FALSE, Boolean.TRUE,packageName);
					}
					if (isItAWhileLoop((List<Object>) elseBlockNode.get(index))) {
						previousNodeName = addWhileLoopNodes((List<Object>) elseBlockNode.get(index), nodesBuilder,
								linksBuilder, previousNodeName,packageName);
					} else if (isItAnIfBlock((List<Object>) elseBlockNode.get(index))) {
						List<String> returnValues = addIfNodes((List<Object>) elseBlockNode.get(index), nodesBuilder,
								linksBuilder, previousNodeName, lastIfBlockNode, Boolean.FALSE, 0, index,packageName);
						previousNodeName = returnValues.get(1);
					} else {
						for (Object object : (List<Object>) elseBlockNode) {
							if (object instanceof FlowChartNode) {
								flowChartNode = (FlowChartNode) object;

								nodeName = "rect" + (++nodeNameIndex);
								linkName = "link" + (++linkNameIndex);

								ifNodeIndex++;

								addNodeAndLink(flowChartNode, nodesBuilder, linksBuilder, previousNodeName, nodeName,
										linkName, null, Boolean.TRUE,packageName);
								previousNodeName = nodeName;
							}
						}
					}
				} else {

					System.err.println("UNKNOWN OBJECT" + elseBlockNode.get(index));
				}
			}
		}

		if (lastIfBlockNode != null && previousNodeName != null)// && !lastIfBlockNode.equals(previousNodeName))
		{
			nodeName = "rect" + (++nodeNameIndex);
			linkName = "link" + (++linkNameIndex);
			ifNodeIndex++;
			flowChartNode = new FlowChartNode("End - If condition");

			addNodeAndLink(flowChartNode, nodesBuilder, linksBuilder, lastIfBlockNode, nodeName, linkName, null, null,packageName);

			linksBuilder.append("\n            " + linkName + ".set('ifBlockEndLink', true);");
			linksBuilder.append("\n            " + linkName + ".label(0, {attrs: {text: {text: 'Yes'}}});");
			linksBuilder.append("\n        " + linkName + ".attr('line/stroke', 'green');");

			if (!lastIfBlockNode.equals(previousNodeName)) {
				linkName = "link" + (++linkNameIndex);
				ifNodeIndex++;
				addLink(linksBuilder, linkName, previousNodeName, nodeName);
				linksBuilder.append("\n            " + linkName + ".set('elseBlockEndLink', true);");
				linksBuilder.append("\n            " + linkName + ".label(0, {attrs: {text: {text: 'No'}}});");
				linksBuilder.append("\n        " + linkName + ".attr('line/stroke', 'red');");
			}

			if (hasOnlyIfBlock) {
				linkName = "link" + (++linkNameIndex);
				addLink(linksBuilder, linkName, ifConditionNodeName, nodeName);
				linksBuilder.append("\n            " + linkName + ".label(0, {attrs: {text: {text: 'No'}}});");
				linksBuilder.append("\n            " + linkName + ".set('elseBlockStartAndEndLink', true);");
				linksBuilder.append("\n        " + linkName + ".attr('line/stroke', 'red');");
			}

			lastIfBlockNode = nodeName;
			previousNodeName = nodeName;
		} else {
			nodeName = "rect" + (++nodeNameIndex);
			linkName = "link" + (++linkNameIndex);
			ifNodeIndex++;
			flowChartNode = new FlowChartNode("End - If");
			addNodeAndLink(flowChartNode, nodesBuilder, linksBuilder, previousNodeName, nodeName, linkName, null, null,packageName);

			linksBuilder.append("\n            " + linkName + ".set('elseBlockEndLink', true);");
			linksBuilder.append("\n            " + linkName + ".label(0, {attrs: {text: {text: 'No'}}});");
			linksBuilder.append("\n        " + linkName + ".attr('line/stroke', 'red');");

			if (hasOnlyElseBlock) {
				linkName = "link" + (++linkNameIndex);
				addLink(linksBuilder, linkName, ifConditionNodeName, nodeName);
				linksBuilder.append("\n            " + linkName + ".label(0, {attrs: {text: {text: 'Yes'}}});");
				linksBuilder.append("\n            " + linkName + ".set('ifBlockStartAndEndLink', true);");
				linksBuilder.append("\n        " + linkName + ".attr('line/stroke', 'green');");
			}
			lastIfBlockNode = nodeName;
			previousNodeName = nodeName;
		}

		linksBuilder.append("\n");
		linksBuilder.append(
				"\n            " + ifConditionNodeName + ".set('endIfConditionId', " + previousNodeName + ".id);");
		linksBuilder
				.append("\n            " + previousNodeName + ".set('ifConditionId', " + ifConditionNodeName + ".id);");

		if (elseBranchWidthInIfPathLocal > 0) {
			linksBuilder.append("\n            " + ifConditionNodeName + ".set('moveElseBlockBy', "
					+ (elseBranchWidthInIfPathLocal + 1) + ");");

		}

		if (ifBranchWidthInElsePathLocal > 0) {
			// changed - 1 to + 1 to fix issue with TestCases.methodWithIfElseElseTree
			linksBuilder.append("\n            " + ifConditionNodeName + ".set('moveIfBlockBy', "
					+ (ifBranchWidthInElsePathLocal + 1) + ");");
		}

		lastNodesInIfAndElseBlocks.add(lastIfBlockNode);
		lastNodesInIfAndElseBlocks.add(previousNodeName);

		if (ifOrElseBlock != null) {
			if (ifOrElseBlock.booleanValue()) {
				ifElseLevelIndicator++;
			} else {
				ifElseLevelIndicator--;
			}
		}

		currentIfElseLevel--;

		return lastNodesInIfAndElseBlocks;
	}

	/**
	 * If ifBlock is true, then its IF. Otherwise, its ELSE.
	 */
	private void findNoOfLevelsInTheIfElseTree(List<Object> node, boolean ifBlock, boolean ifPath) {
		if (ifBlock) {
			if (!ifPath) {
				while (true) {
					ifBranchWidthInElsePath++;
					if (hasNestedIf(node)) {
						node = getNestedIf(node);
						if (node.size() > 3) {
							node = (List<Object>) node.get(3);
						} else {
							break;
						}
					} else {
						break;
					}
				}
			}
		} else {
			if (ifPath) {
				while (true) {
					elseBranchWidthInIfPath++;
					if (hasNestedIf(node)) {
						node = (List<Object>) getNestedIf(node).get(2);
					} else {
						break;
					}
				}
			}
		}
	}

	private boolean hasNestedIf(List<Object> node) {
		for (Object object : node) {
			if (isItAnIfBlock(object)) {
				return true;
			}
		}

		return false;
	}

	private List<Object> getNestedIf(List<Object> node) {
		for (Object object : node) {
			if (isItAnIfBlock(object)) {
				return (List<Object>) object;
			}
		}

		return null;
	}

	private boolean hasNestedElse(List<Object> node) {
		for (Object object : node) {
			if (isItAnIfBlock(object) && ((List<Object>) node).size() > 2)// Length > 2 means, it has Else block
			{
				return true;
			}
		}

		return false;
	}

	private String addLoopNodes(StringBuilder nodesBuilder, StringBuilder linksBuilder, String previousNodeName,
			List<Object> loopNodes, Boolean ifBlock, Boolean elseBlock,String packageName) {
		int noOfNodes = loopNodes.size();
		String firstNodeName = previousNodeName;
		String lastNodeName = null;

		String nodeName = null;
		String linkName = null;

		Object previousNode = null;

		for (int index = 0; index < noOfNodes; index++) {
			if (loopNodes.get(index) instanceof FlowChartNode) {
				nodeName = "rect" + (++nodeNameIndex);
				linkName = "link" + (++linkNameIndex);
				nodeIndex++;
				
				addNodeAndLink((FlowChartNode) loopNodes.get(index), nodesBuilder, linksBuilder, previousNodeName,
						nodeName, linkName, ifBlock, elseBlock,packageName);
				if (index == noOfNodes - 1) {
					lastNodeName = nodeName;
				}

				previousNodeName = nodeName;
			} else if (isItAForLoop((List<Object>) loopNodes.get(index))) {
				previousNodeName = addForLoopNodes((List<Object>) loopNodes.get(index), nodesBuilder, linksBuilder,
						previousNodeName, false, false,packageName);
			} else if (isItAWhileLoop((List<Object>) loopNodes.get(index))) {
				previousNodeName = addWhileLoopNodes((List<Object>) loopNodes.get(index), nodesBuilder, linksBuilder,
						previousNodeName,packageName);
			} else if (isItAnIfBlock((List<Object>) loopNodes.get(index))) {
				List<String> returnDetails = addIfNodes((List<Object>) loopNodes.get(index), nodesBuilder, linksBuilder,
						previousNodeName, null, null, 0, 0,packageName);
				previousNodeName = returnDetails.get(1);
			}

			if (previousNode != null) {
				handleTailLinksIfPreviousNodeIsIfElseBlock(previousNode, nodesBuilder, linksBuilder, lastLinkName);
			}

			previousNode = loopNodes.get(index);
		}

		// Added to fix the issue with Loop back immediately after the for IF Else Block
		lastNodeName = previousNodeName;
		nodeName = previousNodeName;

		linkName = "link" + (++linkNameIndex);
		addingLoopConnector = true;
		addLink(linksBuilder, linkName, lastNodeName, firstNodeName);

		return nodeName;
	}

	private void handleTailLinksIfPreviousNodeIsIfElseBlock(Object previousNode, StringBuilder nodesBuilder,
			StringBuilder linksBuilder, String linkName) {
		/**
		 * TODO
		 */
		if (previousNode != null && previousNode instanceof List && isItAnIfBlock((List<Object>) previousNode)) {
			boolean hasIfBlock = false;
			boolean hasElseBlock = false;
			boolean hasIfAndElseBlock = false;

			if (((List) previousNode).size() > 1) {
				List ifBlockStmts = (List<Object>) ((List) previousNode).get(1);

				if (ifBlockStmts.size() > 0) {
					hasIfBlock = true;
				}

				if (((List) previousNode).size() > 2) {
					List elseBlockStmts = (List<Object>) ((List) previousNode).get(2);
					if (elseBlockStmts.size() > 0) {
						hasElseBlock = true;
					}
				}

				if (hasIfBlock && hasElseBlock) {
					hasIfAndElseBlock = true;
				}
			}

			if (!hasIfAndElseBlock) {
				if (hasIfBlock) {
					linksBuilder.append("\n        " + linkName + ".set('ifBlockEndLink', true);");
					linksBuilder.append("\n        " + linkName + ".label(0, {attrs: {text: {text: 'Yes'}}});");
					linksBuilder.append("\n        " + linkName + ".attr('line/stroke', 'green');");

				} else if (hasElseBlock) {
					linksBuilder.append("\n        " + linkName + ".set('elseBlockEndLink', true);");
					linksBuilder.append("\n        " + linkName + ".label(0, {attrs: {text: {text: 'No'}}});");
					linksBuilder.append("\n        " + linkName + ".attr('line/stroke', 'green');");
				}
			}
		}
	}

	private void addNodeAndLink(FlowChartNode flowChartNode, StringBuilder nodesBuilder, StringBuilder linksBuilder,
			String previousNodeName, String nodeName, String linkName, Boolean ifBlock, Boolean elseBlock,String packageName) {
		double ifMultiplier = 0;
		double elseMultiplier = 0;
		double normalMultiplier = 0;

		String className = null;
		String methodName = null;
		String javaFilePath = null;

		List<String> methodCallDetails = null;
		String nodeConvertToString = flowChartNode.toString().toLowerCase();

		flowChartNode.setNodeName(flowChartNode.getNodeName().replace("\n", ""));
		nodesBuilder.append("\n");
		if (addingIfConditionNode) {

			nodesBuilder.append("\n            flowChartNode = getBrokenText('"
					+ replaceLineBreaks(flowChartNode.getNodeName()) + "');");

			nodesBuilder.append("\n            var " + nodeName + " = rhombus.clone();");
			nodesBuilder.append("\n            resizeWidth = 45 + ((flowChartNode.match(/\\n/g) || []).length) * 15;");
			nodesBuilder.append("\n            " + nodeName + ".resize(maxNodeWidth, resizeWidth);");
			nodesBuilder.append("\n            " + nodeName + ".attr('label/cursor', 'context-menu');");
			nodesBuilder.append("\n            " + nodeName + ".attr('body/cursor', 'context-menu');");

		} else {

			nodesBuilder.append("\n            flowChartNode = getBrokenText('"
					+ replaceLineBreaks(flowChartNode.getNodeName()) + "    ');");

			if (addingStopNode) {
				nodesBuilder.append("\n            var " + nodeName + " = ellipse.clone();");
				nodesBuilder.append("\n            " + nodeName + ".attr('circle/cursor', 'context-menu');");
				nodesBuilder.append("\n            " + nodeName + ".attr('text/cursor', 'context-menu');");

			} else {
				nodesBuilder.append("\n            var " + nodeName + " = rect.clone();");

			}
			nodesBuilder.append("\n            " + nodeName
					+ ".resize(maxNodeWidth, ((flowChartNode.match(/\\n/g) || []).length + 2) * 15);");
		}

		if (ifBlock != null && ifBlock.booleanValue()) {
			ifMultiplier = (ifElseMultiplier) * (ifElseLevelIndicator - 1);
			nodesBuilder.append("\n            " + nodeName + ".translate(" + ifMultiplier + " * maxNodeWidth,"
					+ (nodeIndex * 100) + ");");

		} else if (elseBlock != null && elseBlock.booleanValue()) {
			elseMultiplier = (ifElseMultiplier) * (ifElseLevelIndicator + 1);
			nodesBuilder.append("\n            " + nodeName + ".translate(" + elseMultiplier + " * maxNodeWidth,"
					+ (nodeIndex * 100) + ");");

		} else if (currentIfElseLevel != 0 && ifElseLevelIndicator != 0) {
			normalMultiplier = (ifElseMultiplier) * (ifElseLevelIndicator);
			nodesBuilder.append("\n            " + nodeName + ".translate(" + normalMultiplier + " * maxNodeWidth,"
					+ (nodeIndex * 100) + ");");

		}

		if (addingIfConditionNode || addingStopNode) {
			nodesBuilder.append("\n            " + nodeName + ".attr('text/text', flowChartNode);");

		} else {
			nodesBuilder.append("\n            " + nodeName + ".attr('label/text', flowChartNode);");

		}

		if (flowChartNode.isMethodCall()) {

			methodCallDetails = flowChartNode.getMethodCallDetails();
			className = methodCallDetails.get(0);
			methodName = methodCallDetails.get(1);
            String packageName01=javaClassAndFileMap.get(className);
			
				
				String linkFileName ="";
              if(isJavaStatment) {
				 linkFileName = projectName + File.separator + packageName01 + File.separator + className
						+ File.separator + methodName + ".html?language=JAVA_VIEW";
				
				 System.out.println("packageName: "+packageName+":"+"methodName: "+methodName+" className: "+className);
				 try {
					//Thread.sleep(5000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
              }
              else {
            	  linkFileName = projectName + File.separator + packageName01 + File.separator + className
  						+ File.separator + methodName + ".html?language=NATURAL_LANGUAGE_VIEW";
              }
				linkFileName = linkFileName.replace("\\", "/");

				nodesBuilder.append("\n            " + nodeName + ".set('externalLink', '" + linkFileName + "');");
				nodesBuilder.append("\n            " + nodeName + ".attr('body/stroke', 'blue');");
				/*
				 * nodesBuilder.append("\n            " + nodeName + ".attr('body/fill', '" +
				 * configProps.getProperty("drill_backGroundColor") + "');");
				 */
				nodesBuilder.append("\n            " + nodeName + ".attr('label/cursor', 'pointer');");
				nodesBuilder.append("\n            " + nodeName + ".attr('body/cursor', 'pointer');");

			}
		

		nodesBuilder.append("\n            " + nodeName + ".addTo(" + graphId + ");");
		

			addLink(linksBuilder, linkName, previousNodeName, nodeName);
		
		if (configProps.getProperty("isColored").equalsIgnoreCase("Yes")) {
			/*
			 * if (nodeConvertToString.contains("System.out.println(".toLowerCase()) ||
			 * nodeConvertToString.contains("System.out.print(".toLowerCase()) ||
			 * nodeConvertToString.contains("Print (".toLowerCase())) {
			 * 
			 * if (configProps.getProperty("isColored").equalsIgnoreCase("yes")) {
			 * linksBuilder.append("\n            " + nodeName + ".attr('body/stroke', '" +
			 * configProps.getProperty("loopColor") + "');");
			 * 
			 * }
			 * 
			 * }
			 */

			if (nodeConvertToString.contains("end - if condition".toLowerCase())) {

				nodesBuilder.append("\n            " + nodeName + ".attr('body/stroke', '"
						+ configProps.getProperty("rhombus_backGroundColor") + "');");

			}
			if (nodeConvertToString.contains("End - for".toLowerCase())
					|| nodeConvertToString.contains("End - while".toLowerCase())) {

				nodesBuilder.append("\n            " + nodeName + ".attr('body/stroke', '"
						+ configProps.getProperty("loopColor") + "');");

			}

			nodeConvertToString = "";
		}
	}

	private void addLink(StringBuilder linksBuilder, String linkName, String previousNodeName, String nodeName) {
		if (previousNodeName == null) {
			return;
		}
		
		linksBuilder.append("\n");
		linksBuilder.append("\n            var " + linkName + " = link.clone();");

		linksBuilder.append("\n            " + linkName + ".source(" + previousNodeName + ");");
		linksBuilder.append("\n            " + linkName + ".target(" + nodeName + ");");

		if (addingLoopConnector) {
			FlowChartLink flowChartLink = loopNodesStack.pop();
			String loopNodeText = null;

			if (flowChartLink.isItAForLoop()) {
				loopNodeText = "For Loop";
				if (configProps.getProperty("isColored").equalsIgnoreCase("yes")) {
					linksBuilder.append("\n            " + nodeName + ".attr('body/stroke', '"
							+ configProps.getProperty("loopColor") + "');");

				}

			} else if (flowChartLink.isItAWhileLoop()) {
				linksBuilder.append(
						"\n            " + nodeName + ".set('whileStart', " + previousNodeName + ".get('id'));");
				linksBuilder
						.append("\n            " + previousNodeName + ".set('whileEnd', " + nodeName + ".get('id'));");
				loopNodeText = "While Loop";
				if (configProps.getProperty("isColored").equalsIgnoreCase("yes")) {
					linksBuilder.append("\n            " + nodeName + ".attr('body/stroke', '"
							+ configProps.getProperty("loopColor") + "');");

				}
			}

			linksBuilder.append("\n            " + linkName + ".set('loopConnector', true);");
			if (loopNodeText != null) {
				linksBuilder.append("\n            " + linkName + ".label(0, {attrs: {text: {text: breakText(50, '"
						+ loopNodeText + "')}}});");
				linksBuilder.append("\n        " + linkName + ".attr('line/stroke', '"
						+ configProps.getProperty("loopColor") + "');");
			}

			addingLoopConnector = false;
		} else if (addingFirstIfBlockNode) {
			linksBuilder.append("\n            " + linkName + ".set('ifBlockStartLink', true);");
			linksBuilder.append("\n            " + linkName + ".label(0, {attrs: {text: {text: 'Yes'}}});");
			linksBuilder.append("\n        " + linkName + ".attr('line/stroke', 'green');");
			addingFirstIfBlockNode = false;
		} else if (addingFirstElseBlockNode) {
			linksBuilder.append("\n            " + linkName + ".set('elseBlockStartLink', true);");
			linksBuilder.append("\n            " + linkName + ".label(0, {attrs: {text: {text: 'No'}}});");
			linksBuilder.append("\n        " + linkName + ".attr('line/stroke', 'red');");
			addingFirstElseBlockNode = false;
		}

		linksBuilder.append("\n            " + linkName + ".addTo(" + graphId + ");");

		lastLinkName = linkName;
	}

	private boolean isItALoop(List<Object> node, String nodeType) {
		if (node != null && node.size() > 0 && node.get(0) instanceof String
				&& nodeType.equalsIgnoreCase(node.get(0).toString())) {
			return true;
		}
		return false;
	}

	private boolean isItAnIfBlock(Object node) {
		return node instanceof List && isItALoop((List<Object>) node, "IF");
	}

	public boolean isItAnIfBlock(List<Object> node) {
		return isItALoop(node, "IF");
	}

	public boolean isItAWhileLoop(List<Object> node) {
		return isItALoop(node, "WHILE");
	}

	public boolean isItAForLoop(List<Object> node) {
		return isItALoop(node, "FOR");
	}

	private void addCodeToFindMaxNodeWidth(List<Object> dataPoints, StringBuilder flowChartBuilder) {

		for (Object node : dataPoints) {
			if (node == null)
				continue;

			if (node instanceof FlowChartNode) {

				generateCodeToFindMaxNodeWidth((FlowChartNode) node, flowChartBuilder);
			} else if (node instanceof List) {
				addCodeToFindMaxNodeWidth((List<Object>) node, flowChartBuilder);
			}
		}
	}

	private void generateCodeToFindMaxNodeWidth(FlowChartNode flowChartNode, StringBuilder flowChartBuilder) {

		flowChartBuilder.append("\n            nodesArr.push('" + replaceLineBreaks(flowChartNode.toString()) + "');");
	}

	private String replaceLineBreaks(String contents) {
		contents = contents.replaceAll("(\\r|\\n|\\r\\n)+", "");
		contents = contents.replaceAll("'", "\\\\'");
		contents = contents.replaceAll("\\\\\\\\'", "\\\\'");
		return contents;
	}

	public void copyFolder(File source, File destination) {
		if (source.isDirectory()) {
			String files[] = source.list();
			if (!destination.exists()) {
				destination.mkdirs();
			}

			for (String file : files) {
				copyFolder(new File(source, file), new File(destination, file));
			}
		} else {
			try (InputStream in = new FileInputStream(source); OutputStream out = new FileOutputStream(destination);) {
				byte[] buffer = new byte[1024];

				int length;
				while ((length = in.read(buffer)) > 0) {
					out.write(buffer, 0, length);
				}
			} catch (Exception e) {
				// e.printStackTrace();
			}
		}
	}

	public void setJavaClassAndFileMap(Map<String, String> javaClassAndFileMap) {
		this.javaClassAndFileMap = javaClassAndFileMap;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public void setSourceFolder(String sourceFolder) {
		this.sourceFolder = sourceFolder;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public void setFlowDiagramFolder(String flowDiagramFolder) {
		this.flowDiagramFolder = flowDiagramFolder;
	}

	/**
	 * @return the logoPath
	 */
	public String getLogoPath() {
		return logoPath;
	}

	/**
	 * @param logoPath
	 *            the logoPath to set
	 */
	public void setLogoPath(String logoPath) {
		this.logoPath = logoPath;
	}
}