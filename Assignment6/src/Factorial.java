import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int a;
		System.out.println("Enter a number to get its Factorial");
		Scanner sc = new Scanner(System.in);
		try{
			a = sc.nextInt();
			fact(a);
		} catch (Exception e) {
			System.err.println("Input Whole number only");
		}
	}

	private static void fact(int a) {
		int f=1;
		for(int i=1;i<=a;i++) {
			f*=i;
		}
		System.out.println("Factorial of "+a+" = "+f);
	}

}
