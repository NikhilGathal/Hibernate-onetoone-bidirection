package onetoonebi.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoonebi.dao.AadharCardDao;
import onetoonebi.dao.PersonDao;
import onetoonebi.dto.AadharCard;
import onetoonebi.dto.Person;

public class PersonAadharController {

	public static void main(String[] args) {

//		Person person = new Person();
//		person.setId(2);
//		person.setName("Aniket");
//		person.setAddress("Parbhani");
//
//		AadharCard aadharCard = new AadharCard();
//		aadharCard.setId(200);
//		aadharCard.setName("Aniket");
//		aadharCard.setAge(25);

//		aadharCard.setPerson(person);
//		person.setAadharCard(aadharCard);

//		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
//		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		EntityTransaction entityTransaction = entityManager.getTransaction();
//		entityTransaction.begin();
//		entityManager.persist(aadharCard);
//		entityManager.persist(person);
//		entityTransaction.commit();

		// below this individual started

		// insert

//		PersonDao personDao = new PersonDao();
//		personDao.savePerson(person);
//		
//		AadharCardDao aadharCardDao = new AadharCardDao();
//		aadharCardDao.saveAadharCard(2, aadharCard);

		// update

//		PersonDao personDao = new PersonDao();
//
//		Person person = new Person();
//		person.setName("Rohan");
//		person.setAddress("Nagar");
//
//		AadharCardDao aadharCardDao = new AadharCardDao();
//		AadharCard aadharCard = new AadharCard();
//		aadharCard.setName("Rohan");
//		aadharCard.setAge(25);
//
//		personDao.updatePerson(2, person);
//		aadharCardDao.updateAadharCard(200, aadharCard);

		// find

		PersonDao personDao = new PersonDao();

		AadharCardDao aadharCardDao = new AadharCardDao();

		// aadharCardDao.findAadharCard(200);

		// delete

		// aadharCardDao.deleteAadharCard(200);

		personDao.deleteperson(1);
	}
}
