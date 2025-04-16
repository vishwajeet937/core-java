package com.triniti.testcases;

import java.util.ArrayList;

import eDynamo.classes.T_CLASS_DECLARATIONS;
import eDynamo.classes.T_MODULES;
import eDynamo.classes.T_PROJECTS;
import eDynamo.classes.T_SUBROUTINES;
import triniti.data.DataHandler;
import triniti.service.connector.TrinitiConnector;


public class Connect {

	public static String insertIntoDB(T_PROJECTS tProj) {
		TrinitiConnector 	etkConnector            = 	null;
		DataHandler 		dataHandler				= 	null;
		
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
		ArrayList<T_PROJECTS> objectList = new ArrayList<T_PROJECTS>();
		objectList.add(tProj);
		System.out.println("t_projects - "+tProj);
		System.out.println("objectList - "+objectList);

		if(objectList != null && !objectList.isEmpty() && dataHandler != null)
		{
		    int commitCount = dataHandler.putObjectListToEdapterO2R(objectList, "code.AUTO_DOCUMENATION.TrinitiJavaCode_AUTO_DOCUMENATION_O2R",isXMLConversionRequired);
		    System.out.println("count:" + commitCount); 
		    return commitCount+" records successfully inserted.";
		}

		System.out.println("dataHandler.getGeneratedException()"+dataHandler.getGeneratedException());
		if (dataHandler.getGeneratedException() != null) {
			Exception exception = dataHandler.getGeneratedException();
			System.out.println(exception);
			//outMessage = exception.getMessage();
		} else {
			System.out.println("completed");
		}
		 return " records insertion fail";
	}
	public static void main(String[] args) {
		
		TrinitiConnector 	etkConnector            = 	null;
		DataHandler 		dataHandler				= 	null;
		
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
		ArrayList<T_PROJECTS> objectList = new ArrayList<T_PROJECTS>();
		
		T_PROJECTS t_projects = new T_PROJECTS();
		t_projects.setNAME("javacodevisu");
		
		t_projects.setMAIN_CLASS("Projects.main");
		t_projects.setVERSION(Double.valueOf(4.0));
		t_projects.setPROG_LANG("JAVA");
		t_projects.setSTATUS_CODE(Double.valueOf(1.0));
		t_projects.setTRINITIACDFLAG("A");
		
		
		
		T_MODULES t_modules=new T_MODULES();
		t_modules.setNAME("FlowChartGenerator");
		t_modules.setPACKAGE("com.app");
		t_modules.setLINE_NUMBER(Double.valueOf(100.0));
		t_modules.setCOMMENTS("//sasa");
		t_modules.setTRINITIACDFLAG("A");
		
		T_MODULES t_modules01=new T_MODULES();
		t_modules01.setNAME("FlowChar01");
		t_modules01.setNAME("FlowChar02");
		t_modules01.setPACKAGE("com.triniti");
		t_modules01.setLINE_NUMBER(Double.valueOf(1.0));
		t_modules01.setCOMMENTS("//saa");
		t_modules01.setTRINITIACDFLAG("A");
		
		T_SUBROUTINES t_subroutines=new T_SUBROUTINES();
		//t_subroutines.setNAME(NAME);
		t_subroutines.setDESCRIPTION("yes testing");
		t_subroutines.setTRINITIACDFLAG("A");
		
		T_CLASS_DECLARATIONS classDec=new T_CLASS_DECLARATIONS();
		classDec.setLINE_NUMBER(Integer.valueOf(12));
		classDec.setTRINITIACDFLAG("A");
		classDec.setACTUAL_CODE("actual");
		t_projects.setT_MODULES(new T_MODULES[] {t_modules});
		t_modules.setT_SUBROUTINES(new T_SUBROUTINES[] {t_subroutines});
		t_modules.setT_CLASS_DECLARATIONS(new T_CLASS_DECLARATIONS[] {classDec});
		//objectList.add(classDec);
		objectList.add(t_projects);
		System.out.println("t_projects - "+t_projects);
		System.out.println("objectList - "+objectList);

		if(objectList != null && !objectList.isEmpty() && dataHandler != null)
		{
		    int commitCount = dataHandler.putObjectListToEdapterO2R(objectList, "code.AUTO_DOCUMENATION.TrinitiJavaCode_AUTO_DOCUMENATION_O2R",isXMLConversionRequired);
		    System.out.println("count:" + commitCount);                                                  
		}

		System.out.println("dataHandler.getGeneratedException()"+dataHandler.getGeneratedException());
		if (dataHandler.getGeneratedException() != null) {
			Exception exception = dataHandler.getGeneratedException();
			System.out.println(exception);
			//outMessage = exception.getMessage();
		} else {
			System.out.println("completed");
		}
		//return returnFlag;
	}
}

