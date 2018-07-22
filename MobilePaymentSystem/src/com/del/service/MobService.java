package com.del.service;

import com.del.exception.MobPaymentException;

public interface MobService {

	void depositAmount(double amount) throws MobPaymentException;

	double getBalance();

	double getAmount(double amount) throws MobPaymentException;

	boolean authenticate(String login, String password);

}
