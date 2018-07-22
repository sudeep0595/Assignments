package com.del.client;

import java.util.Scanner;
import java.util.InputMismatchException;

import com.del.exception.MobPaymentException;
import com.del.service.MobService;
import com.del.service.MobServiceImpl;

public class MobileClient {

	private MobService mService;//INTERFACE with client as service
	public MobileClient() {
		mService = new MobServiceImpl();
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		System.out.println("Enter Mobile Number as login ID");
		String login=scan.nextLine();
		System.out.println("Enter Password");
		String password=scan.nextLine();
		boolean loginSuccess = mService.authenticate(login,password);
		if(loginSuccess) {
		while(true) {
			choice = getChoice(scan);
			switch (choice) {
				case 1://RECHARGE AMMOUNT
					System.out.println("Enter desired recharge Ammount");
					System.out.println("Enter the ammount to be deposited:");
					double amount=0;
				try {
					amount = scan.nextDouble();
					mService.depositAmount(amount);
				} catch (MobPaymentException e) {
					System.err.println(e.getMessage());
				}
				catch (InputMismatchException e) {
					System.err.println("Enter number only");
					scan.nextLine();//consume the keyboard input
				}
					break;
					
				case 2:
					System.out.println("Recharge Package Amount: ");
					//System.out.println("Enter the ammount to be : ");
					double rechargeAmount=0;
				try {
					amount = scan.nextDouble();
					rechargeAmount = mService.getAmount(amount);
					System.out.println("Mobile Recharged with Debited with Rs: "+ rechargeAmount);
				} catch (MobPaymentException e) {
					System.err.println(e.getMessage());
				}
				catch (InputMismatchException e) {
					System.err.println("Enter number only");
					scan.nextLine();//consume the keyboard input
				}
					break;
					
				case 3:
					System.out.println("Check Balance");
					double balance = mService.getBalance();
					System.out.println("Your Mobile Number :"+login+" Balance: "+ balance);
					break;
					
				case 4:
					System.out.println("Exiting the Program");
					System.exit(0);
					break;
					
				default:
					System.out.println("Enter the correct choice");
					break;
			}
		}
	}
		else {
			System.out.println("Mobile Number OR password incorrect");
		}
	}
	
	private int getChoice(Scanner scan) {
		int choice = 0;
		System.out.println("\t MOBILE PAYMENT SYSTEM ");
		System.out.println("1. Update Phone Wallet");
		System.out.println("2. Recharge Amount");
		System.out.println("3. Check Balance");
		System.out.println("4. Quit Program");
		System.out.println(" Enter Choice: ");
		try {
			choice = scan.nextInt();
		}
		catch (InputMismatchException e) {
			System.err.println("Input not a number");
			scan.nextLine();
		}
		
		return choice;
	}

	public static void main(String[] args) {
		new MobileClient();
	}
}
