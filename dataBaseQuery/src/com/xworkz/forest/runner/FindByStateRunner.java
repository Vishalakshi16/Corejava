package com.xworkz.forest.runner;

public class FindByStateRunner {

	public static void main(String[] args) {
		System.out.println("Runnind in FindByStateRunner ");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.forest");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByState");
		Object obj = query.getSingleResult();
		ForestEntity name=(ForestEntity)obj;
		System.out.println(name);
		manager.close();
	}
}
