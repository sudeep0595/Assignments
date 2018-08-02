package com.del;

public class Division extends Arithmetic{

	public Division(int num1, int num2, int num3) {
		super(num1, num2, num3);
		// TODO Auto-generated constructor stub
	}

	@Override
	void calculate() {
		num3=num1/num2;
		
	}

}
