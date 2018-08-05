import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		int a;
		System.out.println("Enter a whole number to find if its prime");
		Scanner sc = new Scanner(System.in);
		try {
			a = sc.nextInt();
			PrimeOrNot(a);
		} catch (Exception e) {
			System.err.println("Input Whole Numbers only");
		}
	}

	private static void PrimeOrNot(int a) {
		int flag = 0;
		for (int i = 2; i <= a / 2; i++) {
			if (a % i == 0) {
				System.out.println("The number " + a + " is NOT a Prime Number");
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println("The number " + a + " is a Prime Number");
		}
	}

}
