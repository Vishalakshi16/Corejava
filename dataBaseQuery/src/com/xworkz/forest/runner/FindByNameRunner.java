package com.xworkz.forest.runner;

public class FindByNameRunner {
	
	public static void main(String[] args) {
		System.out.println("Runnind in FindByNameRunner ");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.forest");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByName");
		Object obj = query.getSingleResult();
		ForestEntity name=(ForestEntity)obj;
		System.out.println(name);
		manager.close();
	}


}
