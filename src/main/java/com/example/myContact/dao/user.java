package com.example.myContact.dao;

import com.example.myContact.Entity.Customer;

public interface user {
	Customer getCustomer(int num);
	void addCustomer(Customer customer);
}
