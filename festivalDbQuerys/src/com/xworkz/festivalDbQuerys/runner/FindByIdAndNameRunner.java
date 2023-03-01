package com.xworkz.festivalDbQuerys.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.festivalDbQuerys.entity.FestivalEntity;



public class FindByIdAndNameRunner {

	public static void main(String[] args) {
		System.out.println("Running in FindByIdAndNameRunner ");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.festival");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByIdAndName");
		Object obj = query.getSingleResult();
		FestivalEntity entity = (FestivalEntity)obj;
		System.out.println(entity);
		manager.close();

	}

}