package com.example.Capstone.phase2.entities;

public class FundTransfer {
	private int fromaccno;
	private int toaccno;
	private float amt;

	public FundTransfer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FundTransfer(int fromaccno, int toaccno, float amt) {
		super();
		this.fromaccno = fromaccno;
		this.toaccno = toaccno;
		this.amt = amt;
	}

	public int getFromaccno() {
		return fromaccno;
	}

	public void setFromaccno(int fromaccno) {
		this.fromaccno = fromaccno;
	}

	public int getToaccno() {
		return toaccno;
	}

	public void setToaccno(int toaccno) {
		this.toaccno = toaccno;
	}

	public float getAmt() {
		return amt;
	}

	public void setAmt(float amt) {
		this.amt = amt;
	}

	@Override
	public String toString() {
		return "FundTransfer [fromaccno=" + fromaccno + ", toaccno=" + toaccno + ", amt=" + amt + "]";
	}

}
