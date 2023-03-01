package com.xworkz.bigBasket.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.bigBasket.entity.BigBasketEntity;


@Repository
public class BigBasketRepoImpl implements BigBasketRepo{
	
	
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	
	public BigBasketRepoImpl() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	
	@Override
	public boolean save(BigBasketEntity entity) {
		System.out.println("running save in repository");
		EntityManager em = this.entityManagerFactory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(entity);
		
		et.commit();
		em.close();
		return true;
	}

}
