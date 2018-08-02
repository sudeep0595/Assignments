package com.del;

import java.util.Scanner;

public abstract class Arithmetic {

	int num1, num2, num3;
	Scanner sc = new Scanner(System.in);

	public Arithmetic(int num1, int num2, int num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = 0;
	}
	public void read() {
		System.out.println("Enter number 1");
		System.out.println("Enter number 2");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
	}
	abstract void calculate();
	public void display() {
		System.out.println("Result:"+num3);
	}

}
