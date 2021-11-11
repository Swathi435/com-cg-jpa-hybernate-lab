package com.cg.jpa.demo;


	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.EntityTransaction;
	import javax.persistence.Persistence;

	import com.cg.jpa.hybernate.entities.Author;


	public interface AuthorDemo {
	public static void main(String[] args) {
			
			System.out.println("Start");
			
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("abcd");
			EntityManager em = emf.createEntityManager();
			EntityTransaction tr = em.getTransaction();
			
			tr.begin();
			Author aut1 = new Author(101,"sonu","kumar","kar",98480123);
			Author aut2 = new Author(102,"konu","null","jar",94562186l);
			Author aut3 = new Author(103,"banu",null,"sing",23697413l);
			
			// Inserting record  ---> After insertion we cannot again insert that record
			em.persist(aut1);  //insert
			em.persist(aut2);
			em.persist(aut3);
			
//			em.remove(emp2);		
			
		
			Author aut = em.find(Author.class, 101);   //Select
			System.out.println(aut.toString());
			
			tr.commit();
			System.out.println("End");
	}
	}


