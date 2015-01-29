package com.lh.mappings.dao;

import javax.persistence.EntityManager;

import com.lh.mappings.JPAInitializer;
import com.lh.mappings.PersonWithReferencingAddress;

public class PersonWithReferencingAddressDAO {
	
	public static void salvaPersona(PersonWithReferencingAddress p) {
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
