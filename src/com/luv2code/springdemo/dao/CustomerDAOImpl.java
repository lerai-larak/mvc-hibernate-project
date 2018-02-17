package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.entity.Customer;

@Repository //allow spring to scan, find this repository and handle exception translation
public class CustomerDAOImpl implements CustomerDAO {

	//inject the session factory
	@Autowired
	private SessionFactory sessionFactory; //points to the instance in spring-mvc-crud.xml
		
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		
		//get the current hibernate session
		Session session = sessionFactory.getCurrentSession();
		
		//create a query 
		Query<Customer> theQuery = session.createQuery("from Customer", Customer.class);
		
		//return a list of customers retrieved
		List<Customer> customers = theQuery.getResultList();
		
		return customers;
	}

}
