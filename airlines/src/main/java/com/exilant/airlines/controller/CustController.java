package com.exilant.airlines.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.exilant.airlines.dao.ILocationDAO;
import com.exilant.airlines.model.Customer;
import com.exilant.airlines.model.Flight;
import com.exilant.airlines.model.Form;
import com.exilant.airlines.services.ICustService;
import com.exilant.airlines.services.IFlightServices;
import com.exilant.airlines.services.ILocationServices;

@EnableAutoConfiguration
@RestController
public class CustController {
	
@Autowired
private ICustService service;
@Autowired
private IFlightServices fservice;
@Autowired
private ILocationServices lservice;



@GetMapping("/welcome")
public String hello(){
	return service.hello();
}
@GetMapping("/cust")
public List<Customer> getAll(){
	List<Customer> custList=new ArrayList<>();
	custList=service.getAll();
	System.out.println(custList);
	return custList;
}


@PostMapping("/cust/save")
public void saveCustomer( @RequestBody Customer customer) {
	service.saveCustomer(customer);
}

@GetMapping("/cust/get/{custId}")
public Customer getCustomer(@PathVariable int custId) {
	Customer customer=service.getCustById(custId);
	System.out.println(customer);
return customer;
}
@GetMapping("/flight/get/{fid}")
public Flight getFlightById(@PathVariable int fid) {
Flight flight=fservice.getFlightbyId(fid);
return flight;
}

@GetMapping("/search")
public @ResponseBody
List<Flight> searchResults(@RequestParam String leavingFrom,
		@RequestParam String goingTo, @RequestParam String startDate,
		@RequestParam String endDate) {
	Form form = new Form();

	form.setOrigin(leavingFrom);
	form.setDestination(goingTo);
	form.setStartDate(startDate);
	form.setReturnDate(endDate);
	
	return fservice.getAllFlights(form);
}

@PostMapping("/booking/{fid}")
public void booking(@PathVariable int fid,@RequestBody Customer customer) {
	Flight flight=fservice.getFlightbyId(fid);
	if(flight.getCount()!=0) {
	int count=flight.getCount()-1;
	flight.setCount(count);	
	System.out.println("ticket booked in "+flight.getAirline()+"on name "+customer.getCustName());
	}
}

}
