package com.del.mvc.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static EntityManager em;

	public static EntityManager getEntityManager() {
		if (em == null || !em.isOpen()) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("weatherentity");
			em = emf.createEntityManager();
		}
		return em;
	}

	public static void closeEntityManager() {
		if(em!=null) {
			em.close();
		}
		
	}

}
