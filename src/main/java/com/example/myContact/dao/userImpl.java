package com.example.myContact.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.myContact.Entity.Customer;

@Repository
@Transactional
public class userImpl implements user {

	@Autowired
    private SessionFactory sessionFactory;
	
	@Override
	public Customer getCustomer(int num) {
		 Session session = this.sessionFactory.getCurrentSession();
		 if(session==null) {
			 System.out.println("null");
		 }
	     return session.get(Customer.class, num);
	}

	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	public userImpl() {
	}
	
	
}
