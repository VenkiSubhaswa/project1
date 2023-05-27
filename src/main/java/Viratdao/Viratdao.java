package Viratdao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Viratdto.Viratdto;

public class Viratdao {
EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
EntityManager em=emf.createEntityManager();
EntityTransaction et=em.getTransaction();

public void create(Viratdto s)
{
	et.begin();
	em.persist(s);
	et.commit();
}

public Viratdto login(String email)
{
	Viratdto d=em.find(Viratdto.class, email);
	return d;
}
}
