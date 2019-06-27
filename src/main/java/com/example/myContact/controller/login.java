package com.example.myContact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.myContact.Entity.Customer;
import com.example.myContact.dao.userImpl;

@Controller
public class login {

	@Autowired
    private userImpl impl;
 
    @SuppressWarnings("unchecked")
	@RequestMapping(value = "/", method = RequestMethod.GET)
    public String showBankAccounts(Model model) {
		 Customer customer= new Customer();
		 customer=impl.getCustomer(124); 
		 if(customer==null) {
			 System.out.println("null");
		 }
		 else {
			 System.out.println(customer.getCustomerName());
		 }
        return "hello";
    }
}
