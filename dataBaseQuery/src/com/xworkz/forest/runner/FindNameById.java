package com.xworkz.forest.runner;

public class FindNameById {
	
	public static void main(String[] args) {
		System.out.println("Runnind in FindByNameRunner ");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.forest");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findNameById");
		Object obj = query.getSingleResult();
		String name=(String)obj;
		System.out.println(name);
		manager.close();
	}

}
