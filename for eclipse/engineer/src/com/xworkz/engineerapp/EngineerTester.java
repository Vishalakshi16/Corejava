package com.xworkz.engineerapp;

import com.xworkz.engineerapp.cs.CsEnginner;
import com.xworkz.engineerapp.ecengineer.EcEngineer;
import com.xworkz.engineerapp.engineer.Engineer;

public class EngineerTester {

	public static void main(String[] args) {
//		Object object=new EcEngineer();
	
		Engineer ecEngineer1=new EcEngineer();
		 ecEngineer1.solveProblems();
		 
		 Engineer csEngineer1=new CsEnginner();
		 csEngineer1.solveProblems();
	}
}

