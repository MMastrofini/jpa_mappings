package com.lh.mappings.dao;

import javax.persistence.EntityManager;

import com.lh.mappings.Cat;
import com.lh.mappings.JPAInitializer;

public class CatDAO {

	public static void salva(Cat c) {
		// 1: get entity manager
		EntityManager em = JPAInitializer.getEntityManager();

		// 2: begin transaction
		em.getTransaction().begin();

		// 3: store
		em.persist(c);

		// 4: commit transaction
		em.getTransaction().commit();
	}
}
