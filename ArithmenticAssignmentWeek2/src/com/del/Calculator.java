package com.del;

import java.util.Scanner;

public class Calculator {
	public Calculator() {
		Scanner sc = new Scanner(System.in);
		int num1,num2,num3=0;
		System.out.println("Enter option:");
		System.out.println("1. addition");
		System.out.println("2. subtraction");
		System.out.println("3. multiplication");
		System.out.println("4. division");
		int op = sc.nextInt();
		
		Arithmetic[] arr = { new Addition(0,0,0),new Subtraction(0,0,0),
				new Multiplication(0,0,0),new Division(0,0,0)};
		arr[op-1].read();
		try{arr[op-1].calculate();
		arr[op-1].display();
		} catch(ArithmeticException e) {
			System.out.println("Divsion by 0 not possible");
		} finally {
			sc.close();
		}
	}
	public static void main(String[] args) {
		new Calculator();
	}
}
