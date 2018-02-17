package com.luv2code.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luv2code.springdemo.dao.CustomerDAO;
import com.luv2code.springdemo.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	
	//inject DAO into the customer controller
	
	@Autowired //spring will scan for a component that implements CustomerDAO interface
	private CustomerDAO customerDAO;
	
	@RequestMapping("/list")
	public String listCustomers(Model model) {
		
		//get the customer from the dao
		List<Customer> theCustomers = customerDAO.getCustomers();
		
		//add the customers to the model
		model.addAttribute("customers", theCustomers);
		return "list-customers";
	}
	

}
