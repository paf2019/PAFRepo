package com.payments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PaymentDAO {

	@Autowired
	PaymentRepository paymentrepo;
	
	/*@Transactional(readOnly = false, isolation = Isolation.READ_COMMITTED)
	public Payment save(Payment payment) {
		return paymentrepo.save(payment);
	}*/
}
