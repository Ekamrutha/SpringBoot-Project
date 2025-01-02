package com.example.Capstone.phase2.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler", "customer" })
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int accountno;
	private Account_type acctype;
	private float bal;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_id")
	private Customer customer;

	public Account() {

	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Account(int accountno, Account_type acctype, int bal) {
		super();
		this.accountno = accountno;
		this.acctype = acctype;
		this.bal = bal;
	}

	public long getAccountno() {
		return accountno;
	}

	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}

	public Account_type getAcctype() {
		return acctype;
	}

	public void setAcctype(Account_type acctype) {
		this.acctype = acctype;
	}

	public float getBal() {
		return bal;
	}

	public void setBal(float f) {
		this.bal = f;
	}

	@Override
	public String toString() {
		return "Account [accountno=" + accountno + ", acctype=" + acctype + ", bal=" + bal + "]";
	}

}
