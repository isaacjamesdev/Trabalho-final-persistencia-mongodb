package br.ufc.persistencia.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * @author Isaac James
 * @Email isaacjames@alu.ufc.br
 * @Ocupation Graduando de Eng. de Software
 * @University UFC - Campus Quixada - CE
 */
public class JPAUtil {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("companhia_james");
	private static ThreadLocal<EntityManager> ems = new ThreadLocal<>();

	public static EntityManager getEntityManager() {
		EntityManager em = ems.get();
		if (em == null) {
			em = emf.createEntityManager();
			ems.set(em);
		}
		return em;
	}

	public static void closeEntityManager() {
		EntityManager em = ems.get();
		if (em != null) {
			EntityTransaction tx = em.getTransaction();
			if (tx.isActive())
				tx.commit();
			em.close();
			ems.set(null);
		}
	}

	public static void beginTransaction() {
		getEntityManager().getTransaction().begin();
	}

	public static void commit() {
		getEntityManager().getTransaction().commit();
	}

	public static void rollback() {
		getEntityManager().getTransaction().rollback();
	}

}
