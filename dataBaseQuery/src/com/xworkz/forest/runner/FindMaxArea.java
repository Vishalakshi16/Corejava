package com.xworkz.forest.runner;

public class FindMaxArea {

	public static void main(String[] args) {
		System.out.println("Runnind in FindByNameRunner ");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.forest");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findMaxArea");
		Object obj = query.getSingleResult();
		Double max=(Double)obj;
		System.out.println(max);
		manager.close();
	}
}
