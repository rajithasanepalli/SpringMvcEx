package com.mouritech.customermanagementsystem.controller;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mouritech.customermanagementsystem.model.Customer;


@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	public List<Customer> customerList() {
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(new Customer(123,LocalDateTime.of(2021, 11, 11, 11, 11).toString(),568.23f));
		customers.add(new Customer(123,LocalDateTime.of(2021, 10, 11, 12, 10).toString(),678.23f));
		customers.add(new Customer(123,LocalDateTime.of(2021, 8, 1, 12, 10).toString(),578.23f));
		return customers;
		
	}

	@RequestMapping(value = "/listcustomer", method = RequestMethod.GET)
	  public String getUsers(Model model) throws Exception{
	    List<Customer> customers = customerList();
	    customerListContainer newcustomerList = new customerListContainer();
	    newcustomerList .setCustomers(customers);
	    model.addAttribute("Customers", newcustomerList);
	    return "customerlist";
	  }

}
