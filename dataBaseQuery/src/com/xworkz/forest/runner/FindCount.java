package com.xworkz.forest.runner;

public class FindCount {

	
	public static void main(String[] args) {
		System.out.println("Runnind in FindByNameRunner ");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.forest");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findCount");
		Object obj = query.getSingleResult();
		Long count=(Long)obj;
		System.out.println(count);
		manager.close();
	}
}
