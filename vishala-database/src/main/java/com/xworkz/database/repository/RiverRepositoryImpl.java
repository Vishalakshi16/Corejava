package com.xworkz.database.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.database.entity.RiverEntity;

@Repository
public class RiverRepositoryImpl implements RiverRepository {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public RiverRepositoryImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(RiverEntity entity) {
		System.out.println("running save in repository");
		EntityManager em = this.entityManagerFactory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(entity);
		et.commit();
		em.close();
		return true;
	}

	@Override
	public RiverEntity findBy(int id) {
		// TODO Auto-generated method stub
		System.out.println("Running the Find by id:" + id);
		EntityManager entity = this.entityManagerFactory.createEntityManager();
		RiverEntity fromDB = entity.find(RiverEntity.class, id);

		return fromDB;
	}

	@Override
	public List<RiverEntity> findByName(String name) {
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByName");
			query.setParameter("nm", name);
			List<RiverEntity> list = query.getResultList();
			System.out.println("total List foun in repo" + list.size());

			return list;
		} finally {
			manager.close();
		}
	}

}
