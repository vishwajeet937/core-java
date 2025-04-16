package ifelse;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
//18th Dec code
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/*
 * just comment for testing purpose
 */
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.stream.Collectors;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.comments.JavadocComment;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.pi.yms.loader.Integer;
import com.pi.yms.loader.Set;
import com.pi.yms.loader.String;
import com.pi.yms.loader.model.SerialMetaData;
import com.pi.yms.utils.Configurations;
import com.triniti.java2flowchart.model.FlowChartNode;
import com.triniti.scheduler.Job;
import com.triniti.scheduler.Schedule;
import com.triniti.scheduler.jobs.DataHandler;
import com.triniti.scheduler.jobs.Gson;
import com.triniti.scheduler.jobs.JSONObject;
import eDynamo.classes.Lot;
import eDynamo.classes.SG_SCHEDULE_PARAMS;
import eDynamo.classes.scheduler.T_JOBS;
import eDynamo.classes.scheduler.T_SCHEDULER_DETAILS;
import eDynamo.classes.scheduler.T_SCHEDULES;
import gps.implement.GPSNode;
import gps.implement.HierarchyModel;
import tas.client.AuthenticationServerException;
import tas.client.InvalidParameters;
import tas.client.InvalidUser;
import tas.client.SubmitRequest;

public class IfElseStatements implements Runnable {
	private String val;
	private static int count;
	public final String value;

	public int getVal() {
		return null;
	}

	public String getVal(int id) {
		return null;
	}

	public static void main(String[] args) {
		valueObject = getValueInHashMap("T_USERS_T_USER_PASSWORD_INFO_PASSWORD_LENGTH");
		Lot lotObject = (Lot) userObject;
		if (args == null) {
			System.out.println("if block 1st");
			System.out.println("if block 2nd");
		} else if (args != null) {
			System.out.println("else if block 1st");
			System.out.println("else if block 2nd");
		} else {
			System.out.println("else block 1st");
			System.out.println("else block 2nd");
		}
		System.out.println("outside if-else block");
	}

	public int read01(IfElseStatements ifs) {
		ifs.getVal();
		return 100;
	}

	public int newRead01() {
		return 100;
	}

	public int test(String name, int id) {
		return 15;
	}

	public static int set(int val, int val01) {
		System.out.println("yes");
		return 15;
	}

	public int read() {
		WhileLoopStatements.check();
		System.out.println("IfElseStatements.read()");
		return 15;
	}

	public static void check() {
		System.out.println("number value is " + "number" + number);
	}

	public void ifElseWithWhileLoop() {
		int ch = 0;
		ch = read01();
		int number = 10;
		if (number == 10) {
			System.out.println("printing 1 - 10 using while loop");
			int i = 1;
			while (i <= number) {
				System.out.println("i : " + i);
			}
		} else {
			System.out.println("number value is not 10");
		}
		System.out.println("Done");
	}

	public void ifElseWithForLoop() {
		int number = 10;
		int val1000 = 0;
		IfElseStatements ifs = new IfElseStatements();
		val1000 = ifs.set(12, 15);
		if (number == 10) {
			System.out.println("printing 1 - 10 using for loop");
			for (int i = 1; i <= number; i++) {
				System.out.println("i : " + i);
			}
		} else {
			System.out.println("number value is not 10");
		}
		System.out.println("Done");
	}
}