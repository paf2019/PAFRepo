package com.payments;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paymentin")
public class PaymentController {

	@Autowired
	PaymentDAO paymentdao;
	
	/*@PostMapping("/payment")
	public Payment addPayment(@Valid @RequestBody Payment payment) {
		
		return paymentdao.save(payment);
	}*/
}
