package com.project.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.project.model.Student;
import com.project.model.Class;

public class Test {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnit");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction transacton = entityManager.getTransaction();
		
		Student student1 = new Student("Ali", "KORKMAZ");
		Student student2 = new Student("Gökçe", "HANEDAN");
		
		Class class1 = new Class("Physics");
		Class class2 = new Class("Math");
		Class class3 = new Class("Chemistry");
		
		student1.addClass(class1);
		student1.addClass(class2);
		student2.addClass(class1);
		student2.addClass(class3);

		transacton.begin();
		
		entityManager.persist(class1);
		entityManager.persist(class2);
		entityManager.persist(class3);
		entityManager.persist(student1);
		entityManager.persist(student2);
		
		transacton.commit();
	}

}
