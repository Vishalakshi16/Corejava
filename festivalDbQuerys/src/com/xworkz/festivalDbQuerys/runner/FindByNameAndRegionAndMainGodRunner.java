package com.xworkz.festivalDbQuerys.runner;

import javax.persistence.EntityManagerFactory;

import com.xworkz.festivalDbQuerys.entity.FestivalEntity;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.EntityManager;



public class FindByNameAndRegionAndMainGodRunner {

	public static void main(String[] args) {
		System.out.println("Running in FindByNameAndRegionAndMainGod");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.festival");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByNameAndRegionAndMainGod");
		Object obj = query.getSingleResult();
		FestivalEntity entity = (FestivalEntity) obj;
		System.out.println(entity);
		manager.close();
	}

}