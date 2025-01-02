package com.wipro.Capstone.entities;

public class Account {
	private long accountno;
	private Account_type acctype;
	private float bal;

	public Account() {

	}

	public Account(long accountno, Account_type acctype, int bal) {
		super();
		this.accountno = accountno;
		this.acctype = acctype;
		this.bal = bal;
	}

	public long getAccountno() {
		return accountno;
	}

	public void setAccountno(long accountno) {
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

}
