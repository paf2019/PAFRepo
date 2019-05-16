package com.payments;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="payment")
public class Payment {

	@Id
	private int paymentid;
	private Date paymentdate;
	private float amount;
	private float shippingcost;
	private String paymentmethod;
	private int orderid;
	private int bankid;
	public int getPaymentid() {
		return paymentid;
	}
	public void setPaymentid(int paymentid) {
		this.paymentid = paymentid;
	}
	public Date getPaymentdate() {
		return paymentdate;
	}
	public void setPaymentdate(Date paymentdate) {
		this.paymentdate = paymentdate;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public float getShippingcost() {
		return shippingcost;
	}
	public void setShippingcost(float shippingcost) {
		this.shippingcost = shippingcost;
	}
	public String getPaymentmethod() {
		return paymentmethod;
	}
	public void setPaymentmethod(String paymentmethod) {
		this.paymentmethod = paymentmethod;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getBankid() {
		return bankid;
	}
	public void setBankid(int bankid) {
		this.bankid = bankid;
	}
	@Override
	public String toString() {
		return "Payment [paymentid=" + paymentid + ", paymentdate=" + paymentdate + ", amount=" + amount
				+ ", shippingcost=" + shippingcost + ", paymentmethod=" + paymentmethod + ", orderid=" + orderid
				+ ", bankid=" + bankid + "]";
	}
	
	
}
