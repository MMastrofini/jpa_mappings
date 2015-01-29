package com.lh.mappings;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAInitializer {
	private static EntityManager entityManager;
	private static EntityManagerFactory entityManagerFactory;

	public static void initJPA() {
		entityManagerFactory = Persistence
				.createEntityManagerFactory("ExampleProjectWithJPA");
		entityManager = entityManagerFactory.createEntityManager();
	}

	public static void shutdown() {
		entityManager.close();
		entityManagerFactory.close();
	}

	public static EntityManager getEntityManager() {
		return entityManager;
	}
}
