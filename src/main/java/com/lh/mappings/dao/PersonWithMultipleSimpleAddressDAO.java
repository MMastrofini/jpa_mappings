/**
 * @author Manuel Mastrofini
 */
package com.lh.mappings.dao;

import javax.persistence.EntityManager;

import com.lh.mappings.JPAInitializer;
import com.lh.mappings.PersonWithMultipleSimpleAddress;

public class PersonWithMultipleSimpleAddressDAO {
	
	public static void salvaPersona(PersonWithMultipleSimpleAddress p) {
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
