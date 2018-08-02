package com.del;

import java.util.Scanner;

public class UserMainCode {
	public static boolean checkTripplets(int[] a) {
		int b,flag=0;
		Scanner sc = new Scanner(System.in);
		for(int z=0;z<a.length;z++) {
			System.out.println("Enter Value:");
			a[z]=sc.nextInt();
		}
		for (int k = 0; k < a.length; k++) {
			int ch = 0;
			b=a[k];
			for (int i = 0; i < a.length; i++) {
				if (b == a[i]) {
					ch++;
				}
				if(ch==3) {
					flag=1;
					break;
				}
				if(flag==1) {
					break;
				}
			}
		}
		if(flag==1) {
			return true;
		}
		else {
			return false;
		}
	}
}
