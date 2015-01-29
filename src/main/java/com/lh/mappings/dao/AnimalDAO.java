package com.lh.mappings.dao;

import javax.persistence.EntityManager;

import com.lh.mappings.Animal;
import com.lh.mappings.JPAInitializer;

public class AnimalDAO {

	public static void salva(Animal a) {
		// 1: get entity manager
		EntityManager em = JPAInitializer.getEntityManager();

		// 2: begin transaction
		em.getTransaction().begin();

		// 3: store
		em.persist(a);

		// 4: commit transaction
		em.getTransaction().commit();
	}
}
