package com.xworkz.forest.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindAreaByNameRunner {
	
	public static void main(String[] args) {
		System.out.println("running in FindAreaByNameRunner");
		
		System.out.println("Runnind in FindByNameRunner ");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.forest");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findAreaByName");
		Object obj = query.getSingleResult();
		Double Area=(Double)obj;
		System.out.println(Area);
		manager.close();
		
	}

}
