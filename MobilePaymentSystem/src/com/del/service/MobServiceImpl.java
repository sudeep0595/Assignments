package com.del.service;

import com.del.dao.MobPaymentDao;
import com.del.dao.MobPaymentDaoImpl;
import com.del.exception.MobPaymentException;
import com.del.util.Message;

public class MobServiceImpl implements MobService {
	
	private MobPaymentDao mpDao;

	public MobServiceImpl() {
		mpDao = new MobPaymentDaoImpl();
	}

	@Override
	public void depositAmount(double amount) throws MobPaymentException {
		if (amount < 0) {
			throw new MobPaymentException(Message.NEGATIVE_VALUE);// final variables are in upper case
		}
		mpDao.depositAmount(amount);
	}

	@Override
	public double getBalance() {
		double balance = mpDao.getBalance();
		return balance;
	}

	@Override
	public double getAmount(double amount) throws MobPaymentException {
		if(isAmountNegative(amount)) {
			throw new MobPaymentException(Message.NEGATIVE_VALUE);// final variables are in upper case
		}
		return mpDao.getAmount(amount);
	}

	private boolean isAmountNegative(double amount) throws MobPaymentException {
		if(amount<0) {
			throw new MobPaymentException(Message.NEGATIVE_VALUE);
		}
		return false;
	}

	@Override
	public boolean authenticate(String login, String password) {
		return mpDao.authenticate(login, password);
	}

}
