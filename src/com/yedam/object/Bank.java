package com.yedam.object;

public class Bank {
	private String accountNo; //unique
	private String owner; // 계좌주
	private int balance; //잔고.
	
	void setAccountNo(String acNo) {
		this.accountNo = acNo;
	}
	String getAccountNo() {
		return accountNo;
	}
	void setOwner(String owner) {
		this.owner = owner;
	}
	String getOwner() {
		return this.owner;
	}
	void setBalance(int balance) {
		this.balance = balance;
	}
	int getBalance() {
		return this.balance;
	}
}
