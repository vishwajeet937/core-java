package com.triniti.testcases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.triniti.utils.ObjectPool;

import eDynamo.classes.T_CLASS_DECLARATIONS;
import eDynamo.classes.T_IMPORTS;
import eDynamo.classes.T_MODULES;
import eDynamo.classes.T_PROJECTS;
import eDynamo.classes.T_STATEMENTS;
import eDynamo.classes.T_SUBROUTINES;
import triniti.data.DataHandler;
import triniti.service.connector.TrinitiConnector;

public class ConnectFetch {

	private static String projectName;
	private static String projectId;
	private static int currentVersion;
	private static boolean haveToGenerateRuntimeDataAndDBContainDataBasedFlowChart;
	
	public static boolean isHaveToGenerateRuntimeDataAndDBContainDataBasedFlowChart() {
		return haveToGenerateRuntimeDataAndDBContainDataBasedFlowChart;
	}
	public static void setHaveToGenerateRuntimeDataAndDBContainDataBasedFlowChart(
			boolean haveToGenerateRuntimeDataAndDBContainDataBasedFlowChart) {
		ConnectFetch.haveToGenerateRuntimeDataAndDBContainDataBasedFlowChart = haveToGenerateRuntimeDataAndDBContainDataBasedFlowChart;
	}
	public static int getCurrentVersion() {
		return currentVersion;
	}
	public static void setCurrentVersion(int currentVersion) {
		ConnectFetch.currentVersion = currentVersion;
	}
	public static String getProjectId() {
		return projectId;
	}
	public static void setProjectId(String projectId) {
		ConnectFetch.projectId = projectId;
	}
	public static String getProjectName() {
		return projectName;
	}
	public static void setProjectName(String projectName) {
		ConnectFetch.projectName = projectName;
	}
	public static int getVersion() {
		return version;
	}
	public static void setVersion(int version) {
		ConnectFetch.version = version;
	}
	private static int version;
	public static void check(List<?> list) {
		
	}
	public static void main(String[] args) {
		System.out.println(getLatestVersion("TestCases"));
		//
//		List<String> list01=new ArrayList<>();
//		List<?> list=list01;
//		check(list01);

	}
	
	public static int getLatestVersion(String projectName) {
		TrinitiConnector 	etkConnector            = 	null;
		DataHandler 		dataHandler				= 	null;
		String whereClause=null;
		String             etkInstanceRunnerURL  = "https://devtri2.triniti.com/etk/jsp/InstanceRunnerServlet";
	    System.out.println("etkInstanceRunnerURL->"+etkInstanceRunnerURL);
	    boolean isXMLConversionRequired = true;
	    
	    if(etkInstanceRunnerURL != null && etkInstanceRunnerURL.trim().length() > 0)
		{
	    	etkConnector 	= new TrinitiConnector();
			etkConnector.setUrl(etkInstanceRunnerURL);
			etkConnector.connect();
			dataHandler     = new DataHandler(etkInstanceRunnerURL);
		}
	    
        dataHandler.connectToETKService(etkInstanceRunnerURL);
        Vector valueVector=ObjectPool.getVector();
        whereClause="T_PROJECTS.NAME=?";
        valueVector.add(projectName);
        valueVector.add("java.lang.String");
      
        ArrayList<T_PROJECTS> objectList=null;
        ArrayList<Integer> versionList=new ArrayList<>();
		if( dataHandler != null)
		{
		   objectList = dataHandler.getObjectListFromEdapterR2O("code.AUTO_DOCUMENATION.TrinitiJavaCode_AUTO_DOCUMENTATION_R2O", whereClause, valueVector); 
		}
		LinkedHashMap mainMap=new LinkedHashMap();
		for(T_PROJECTS proj:objectList) {
			double ver=proj.VERSION;
			int version=(int)ver;
			versionList.add(version);
		}
		int greaterNum=versionList.get(0);
		for(int val:versionList) {
			if(val>greaterNum)
				greaterNum=val;
		}
		currentVersion=greaterNum;
		return currentVersion;
	}
	public static LinkedHashMap getData() {
		TrinitiConnector 	etkConnector            = 	null;
		DataHandler 		dataHandler				= 	null;
		String whereClause=null;
		String             etkInstanceRunnerURL  = "https://devtri2.triniti.com/etk/jsp/InstanceRunnerServlet";
	    System.out.println("etkInstanceRunnerURL->"+etkInstanceRunnerURL);
	    boolean isXMLConversionRequired = true;
	    
	    if(etkInstanceRunnerURL != null && etkInstanceRunnerURL.trim().length() > 0)
		{
	    	etkConnector 	= new TrinitiConnector();
			etkConnector.setUrl(etkInstanceRunnerURL);
			etkConnector.connect();
			dataHandler     = new DataHandler(etkInstanceRunnerURL);
		}
	    
        dataHandler.connectToETKService(etkInstanceRunnerURL);
        Vector valueVector=ObjectPool.getVector();
       // whereClause="T_PROJECTS.ID= ?";
       
        //valueVector.add(tProj);
       // valueVector.add(Integer.valueOf(projectId));
        //valueVector.add(64);
       // valueVector.add("java.lang.Double");
        if(haveToGenerateRuntimeDataAndDBContainDataBasedFlowChart) {
        whereClause="T_PROJECTS.NAME=? AND T_PROJECTS.VERSION=?";
     valueVector.add(projectName);
        valueVector.add("java.lang.String");
         valueVector.add(currentVersion);
        valueVector.add("java.lang.Double");
        }
        else {
        	  whereClause="T_PROJECTS.ID= ?";
            
          //  valueVector.add(tProj);
            valueVector.add(Integer.valueOf(projectId));
            //valueVector.add(64);
            valueVector.add("java.lang.Double");
        }
      //  valueVector.add(44);
        ArrayList<T_PROJECTS> objectList=null;
		if( dataHandler != null)
		{
		   objectList = dataHandler.getObjectListFromEdapterR2O("code.AUTO_DOCUMENATION.TrinitiJavaCode_AUTO_DOCUMENTATION_R2O", whereClause, valueVector); 
		}
		//System.out.println("------------"+objectList);
		LinkedHashMap mainMap=new LinkedHashMap();
		for(T_PROJECTS proj:objectList) {
			//System.out.println("project Name: "+proj.NAME);
			LinkedList projMod=new LinkedList<>();
			
//			System.out.println("project MainClass: "+proj.MAIN_CLASS);
//			System.out.println("project Version: "+proj.VERSION);
//			System.out.println("project language: "+proj.PROG_LANG);
//			System.out.println("project status: "+proj.STATUS_CODE);
			T_MODULES[] mod=proj.getT_MODULES();
			for(T_MODULES module:mod) {
				LinkedHashMap<String, Object> modSub=new LinkedHashMap<>();
				LinkedHashMap<String, String> importStat=new LinkedHashMap<>();
				LinkedHashMap<String,Object> classDec=new LinkedHashMap<>();
				T_CLASS_DECLARATIONS[] classDecArr= module.getT_CLASS_DECLARATIONS();
				LinkedList classDecList=new LinkedList();
				if(classDecArr!=null)
				for(T_CLASS_DECLARATIONS cDec:classDecArr) {
					LinkedHashMap<String, Object> cDecMap=new LinkedHashMap<>();
					cDecMap.put("refVar",cDec.getACTUAL_CODE());
					classDecList.add(cDecMap);
				}
				else
					System.out.println(module.NAME+proj.VERSION);
				if(module.getT_IMPORTS()!=null)
				for(T_IMPORTS imp:module.getT_IMPORTS()) {
					//System.out.println("just checking:: "+imp);
					if(imp.ACTUAL_CODE!=null && imp.ACTUAL_CODE.length()>0)
					importStat.put(imp.ACTUAL_CODE.substring(imp.getACTUAL_CODE().lastIndexOf(".")+1), imp.getACTUAL_CODE());
				}
				//System.out.println("imp: "+importStat);
				LinkedList<Object> modList=new LinkedList<>();
				//System.out.println("Class Name: "+module.getNAME());
				//System.out.println("actual code: "+module.getACTUAL_CODE());
				T_SUBROUTINES[] sub=module.getT_SUBROUTINES();
				for(T_SUBROUTINES subRout:sub) {
					LinkedHashMap<String,Object> methodMap=new LinkedHashMap<>();
					LinkedList<T_STATEMENTS> statList=new LinkedList<>();
					//System.out.println("Method Name: "+subRout.getNAME());
					//System.out.println("Actual Code: "+subRout.getACTUAL_CODE());
					T_STATEMENTS[] stats=subRout.getT_STATEMENTS();
					List statList01=Arrays.asList(stats);
					for(T_STATEMENTS stat:stats) {
					
						//System.out.println((stat));
						if(stat.getACTUAL_CODE()!=null && stat.getSTATMENT_TYPE().equalsIgnoreCase("PL") ) {
						statList.add(stat);
						}
					}
					/*statList01.forEach(stat01->{
						
					T_STATEMENTS stat=(T_STATEMENTS)stat01;
					if(stat.ACTUAL_CODE==null)
						try {
							System.out.println(subRout.getNAME()+" : "+module.getNAME()+" : "+(stat.LINE_NUMBER==null)+" : "+stat.STATMENT);
							Thread.sleep(10000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					if(stat.ACTUAL_CODE!=null && stat.getSTATMENT_TYPE()!=null) {
						if(!stat.ACTUAL_CODE.equals("null") && stat.getSTATMENT_TYPE().equalsIgnoreCase("PL") ) {
							statList.add(stat);
						}
					}
					});*/
							//System.out.println("statement: "+stat.getACTUAL_CODE());
					
					System.out.println();
					//methodMap.put(key, value);
					//methodMap.put(key, value);
					//methodMap.put(key, value);
					if(subRout.ACTUAL_CODE!=null && !subRout.ACTUAL_CODE.equals("null"))
					methodMap.put("actualCode",subRout.getACTUAL_CODE());
					methodMap.put("statement", statList);
					methodMap.put("name", subRout.getNAME());
					methodMap.put("description", subRout.getDESCRIPTION());
					methodMap.put("lineNum", subRout.LINE_NUM);
					methodMap.put("lineNumList",subRout.LINE_NUMBERS_LIST);
					methodMap.put("colNumList", subRout.COLUMN_NUMBERS_LIST);
					modList.add(methodMap);
				}
				modSub.put("className", module.getNAME());
				modSub.put("classDescrip",module.getDESCRIPTION());
				modSub.put("classDec", module.getACTUAL_CODE());
				modSub.put("package", module.getPACKAGE());
				modSub.put("methodList", modList);
				modSub.put("importStat", importStat);
				modSub.put("classDecList", classDecList);
				//modSub.put("mainClass",module.get)
				projMod.add(modSub);
				
				
				//System.out.println();
			}
			mainMap.put("mainClass", proj.getMAIN_CLASS());
			mainMap.put("classList", projMod);
			mainMap.put("projectName", proj.NAME);
			mainMap.put("projVersion", proj.VERSION);
			//projMod.
			
		}
		
       //System.out.println(Arrays.toString(objectList.get(0).getT_MODULES()));
		if (dataHandler.getGeneratedException() != null) {
			Exception exception = dataHandler.getGeneratedException();
			System.out.println(exception);
			//outMessage = exception.getMessage();
		} else {
			System.out.println("completed");
		}
		return mainMap;
	}
}
