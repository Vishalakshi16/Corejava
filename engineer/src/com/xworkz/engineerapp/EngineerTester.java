package com.xworkz.engineerapp;

import com.xworkz.engineerapp.cs.CsEnginner;
import com.xworkz.engineerapp.ecengineer.EcEngineer;
import com.xworkz.engineerapp.engineer.Engineer;

public class EngineerTester {

	public static void main(String[] args) {
//		Object object=new EcEngineer();
	
		Engineer Engineer1=new EcEngineer();
		// Engineer1.solveProblems();
		 
//		 Engineer csEngineer1=new CsEnginner();
//		 csEngineer1.solveProblems();
		 
//		 Engineer Engineer2=new EcEngineer();
		 EcEngineer  ef=(EcEngineer)Engineer1
				 ef.buildSoftWare();	}
}

