package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Service 
public class CustomerDAO {
	
	@Autowired
	 CustomerRepo2 customerRepository; 
	
	
	 @Transactional(readOnly = false,isolation = Isolation.READ_COMMITTED)
	 public CustomerDetails save(CustomerDetails emp) {
	 return customerRepository.save(emp);
	 } 
	 
	 
	 public List<CustomerDetails> findAll(){
	 return customerRepository.findAll();
	 }

	 
	 public CustomerDetails findOne(int id) {
	 Optional<CustomerDetails> op = customerRepository.findById(id);
	 if(op.isPresent()) {
	 return op.get();
	 }
	 else {
	 return null;
	 }
	 }

	 @Transactional(readOnly = false,isolation = Isolation.READ_COMMITTED)
	 public void delete(CustomerDetails customer) {
	 customerRepository.delete(customer);
	 } 



}
