package com.payments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.payments.Payment;

@RestController
public class PaymentResource {

	@Autowired
	PaymentRepository paymentrepo;
	
	/*@PostMapping("/payment")
	public void addPayment(Payment payment) {
		paymentrepo.save(payment);
		
	}*/
	
	@GetMapping("payments")
	public List<Payment> getPayments(){
		
		List<Payment> payments = (List<Payment>) paymentrepo.findAll();
		
		return payments;
	}
	
}
