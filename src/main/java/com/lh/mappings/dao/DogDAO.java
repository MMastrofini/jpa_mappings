package com.lh.mappings.dao;

import javax.persistence.EntityManager;

import com.lh.mappings.Dog;
import com.lh.mappings.JPAInitializer;

public class DogDAO {

	public static void salva(Dog d) {
		// 1: get entity manager
		EntityManager em = JPAInitializer.getEntityManager();

		// 2: begin transaction
		em.getTransaction().begin();

		// 3: store
		em.persist(d);

		// 4: commit transaction
		em.getTransaction().commit();
	}
}
