package com.del.dao;

import com.del.exception.MobPaymentException;

public interface MobPaymentDao {

	void depositAmount(double Amount);

	double getBalance();

	double getAmount(double amount) throws MobPaymentException;

	boolean authenticate(String login, String password);
	
}
