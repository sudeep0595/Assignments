package com.del.dao;

import com.del.exception.MobPaymentException;
import com.del.util.Message;

public class MobPaymentDaoImpl implements MobPaymentDao {
	private double walletBalance;
	private double minBalance = 500; //Choice of Pending Amount
	private String login = "9618260510";
	private String password = "123";

	@Override
	public void depositAmount(double amount) {
		walletBalance += amount;
		System.out.println("Wallet Balance Credited with Rs.: "+ amount);
	}

	@Override
	public double getBalance() {
		return walletBalance;
	}

	@Override
	public double getAmount(double amount) throws MobPaymentException {
		double bal = walletBalance - amount;
		if (bal < minBalance) {
			throw new MobPaymentException(Message.LOW_BALANCE + " by "+ (minBalance-bal));
		} else {
			walletBalance = bal;
		}
		return amount;
	}

	@Override
	public boolean authenticate(String login, String password) {
		return this.login.equals(login) && this.password.equals(password);
	}

}

