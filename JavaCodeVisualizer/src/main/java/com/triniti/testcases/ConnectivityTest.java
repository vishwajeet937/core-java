package com.triniti.testcases;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import eDynamo.classes.T_STATEMENTS;

public class ConnectivityTest {

	public static void main(String[] args) {
		List list=new LinkedList<>();
		int i=5;
		while(i<=6) {
		T_STATEMENTS tstat=new T_STATEMENTS();
		tstat.setSTATMENT_TYPE("PL");
		
		if(i==1)
			tstat.setSTATMENT("Line No-72: System.out.println(\"before if start\");");
		if(i==2)
			tstat.setSTATMENT("Line No-73: IF");
		if(i==3)
			tstat.setSTATMENT("Line No-74: System.out.println(\"args==null\");");
		if(i==4)
			tstat.setSTATMENT("Line No-75: System.out.println(\"if block\");");
		if(i==5)
			tstat.setSTATMENT("Line No-76: System.out.println(\"\");");
			
			if(i==6)
				tstat.setSTATMENT(" Line No-83: System.out.println(\"yes working\");");
				
			
		list.add(tstat);
		i++;
		}
		//list.add();
		//list.add("");
		//System.out.println(list);
		Iterator itr=list.iterator();
		//while(itr.hasNext())
		//	System.out.println(((T_STATEMENTS)itr.next()).STATMENT);
		//List list01=ConnectFetch.getIfBlockList(itr);
		//System.out.println(list01);
	//	System.out.println(list01);

	}

}
