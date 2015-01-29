package com.lh.mappings.dao;

import javax.persistence.EntityManager;

import com.lh.mappings.JPAInitializer;
import com.lh.mappings.PersonWithMultipleReferencingAddress;
import com.lh.mappings.PersonWithMultipleReferencingAddressU;

public class PersonWithMultipleReferencingAddressDAO {

	public static void salvaPersona(PersonWithMultipleReferencingAddressU p) {
		// 1: get entity manager
		EntityManager em = JPAInitializer.getEntityManager();

		// 2: begin transaction
		em.getTransaction().begin();

		// 3: store
		em.persist(p);

		// 4: commit transaction
		em.getTransaction().commit();
	}

	public static void salvaPersona(PersonWithMultipleReferencingAddress p) {
		// 1: get entity manager
		EntityManager em = JPAInitializer.getEntityManager();

		// 2: begin transaction
		em.getTransaction().begin();

		// 3: store
		em.persist(p);

		// 4: commit transaction
		em.getTransaction().commit();
	}

}
