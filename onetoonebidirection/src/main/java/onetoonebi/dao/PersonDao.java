package onetoonebi.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoonebi.dto.Person;

public class PersonDao {

	public EntityManager getenEntityManager() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager;
	}

	public void savePerson(Person person) {
		EntityManager entityManager = getenEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
	}
	
	public void updatePerson(int id , Person person)
	{
		EntityManager entityManager = getenEntityManager();
		Person dbPerson = entityManager.find(Person.class, id);
	//	AadharCard dbAadharCard = dbPerson.getAadharCard();
		if (dbPerson != null) {
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			person.setId(id); 		// if not set then it take default val for id
			person.setAadharCard(dbPerson.getAadharCard());
			entityManager.merge(person);
			entityTransaction.commit();
		} else {
			System.out.println("Sorry Id not present ");
		}
	}
	
	public void findperson(int id) {
		EntityManager entityManager = getenEntityManager();
		Person dbPerson = entityManager.find(Person.class, id);
		if(dbPerson != null)
		{
			System.out.println(dbPerson);
		}
		else 
		{
			System.out.println("ID not present");
		}
	}
	
	public void deleteperson(int id)
	{
		EntityManager entityManager = getenEntityManager();
		Person dbPerson = entityManager.find(Person.class, id);
		if (dbPerson != null) {
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(dbPerson);
			entityTransaction.commit();
		} else {
			System.out.println("Sorry Id not present ");
		}
	}
}
