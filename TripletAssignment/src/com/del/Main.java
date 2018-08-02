package com.del;

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		int a;
		System.out.println("Enter the size of the array:");
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		int[] b = new int[a];
		boolean ans = UserMainCode.checkTripplets(b);
		System.out.println(ans);
	}

}
