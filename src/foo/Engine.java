package foo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Engine {

	public static void main(String[] args) {
				
		System.out.println("Java Persistence Api 2.2");
		System.out.println("EclipseLink 2.5.2");
		System.out.println("MySQL Connector/J 8.0.19");
		
	}
	
	EntityManager init() {
		EntityManagerFactory entityFactory = Persistence
				.createEntityManagerFactory("JavaPersistenceApi");
		EntityManager entityManager = entityFactory.createEntityManager();
		return entityManager;
	}
	
	void create(Model model) {
		EntityManager em = init();
		em.getTransaction().begin();
		em.persist(model);
		em.getTransaction().commit();
		em.close();
		System.out.println("Model successfully created.");
	}
	
	void read(int id) {
		EntityManager em = init();
		Model model = em.find(Model.class, id);
		int i0 = model.getId();
		String s0 = model.getFirstName();
		String s1 = model.getLastName();
		String s2 = model.getCountry();
		System.out.printf("%d %s %s %s\n", i0, s0, s1, s2);
	}
	
	void update(int id0, String firstName, String lastName, String country) {
		EntityManager em = init();
		em.getTransaction().begin();
		Model model = em.find(Model.class, id0);
		model.setFirstName(firstName);
		model.setLastName(lastName);
		model.setCountry(country);
		em.getTransaction().commit();
		em.close();
		System.out.println("Record successfully updated.");
	}
	
	void delete(int id) {
		EntityManager em = init();
		em.getTransaction().begin();
		em.remove(id);
		em.getTransaction().commit();
		em.close();
		System.out.println("Record successfully deleted.");
	}
	
}
