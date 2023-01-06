package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SoftwareCompany {
	public static void main(String[] args) {
		String cmpy1="Microsoft";
		String cmpy2="Oracle";
		String cmpy3="Ibm";
		String cmpy4="Salesforce";
		String cmpy5="Sap";
		String cmpy6="Autodesk";
		String cmpy7="Pixels Technical Solution";
		String cmpy8="Quantum comp solutions";
		String cmpy9="Twilio";
		String cmpy10="VMware";
		String cmpy11="Adp";
		String cmpy12="Nebula web delevepment co";
		String cmpy13="Atlassian";
		String cmpy14="Citrix Systems";
		String cmpy15="Kwik Koders";
		String cmpy16="Software Giant";
		String cmpy17="Expressway Ecommerce Ltd";
		String cmpy18="Radient Spark Technology";
		String cmpy19="Priority Soft Ideas";
		String cmpy20="Elemental Web Solutions";

		
		
Collection<String> collection=new ArrayList<String>();
		
		collection.add(cmpy1);
		collection.add(cmpy2);
		collection.add(cmpy3);
		collection.add(cmpy4);
		collection.add(cmpy5);
		collection.add(cmpy6);
		collection.add(cmpy7);
		collection.add(cmpy8);
		collection.add(cmpy9);
		collection.add(cmpy10);
		collection.add(cmpy11);
		collection.add(cmpy12);
		collection.add(cmpy13);
		collection.add(cmpy14);
		
		collection.add(cmpy15);
		collection.add(cmpy16);
		collection.add(cmpy17);
		collection.add(cmpy18);
		collection.add(cmpy19);
		collection.add(cmpy20);
		
		for(String element:collection) {
			System.out.println(element);
			
		}
		
		Iterator<String> ref=collection.iterator();
		while(ref.hasNext())
		{
		String element=ref.next();
		System.out.println(element);
		}
		
	}


}
