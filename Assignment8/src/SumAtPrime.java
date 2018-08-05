import java.util.Scanner;

public class SumAtPrime {

	public static void main(String[] args) {
		int a;
		System.out.println("Enter the amount of numbers to be put in array");
		Scanner sc = new Scanner(System.in);
		try {
			a = sc.nextInt();
			System.out.println("Enter " + a + " numbers in sequence");
			int[] ar = new int[a];
			for (int c = 0; c < a; c++) {
				System.out.print("No. " + (c + 1) + " = ?");
				ar[c] = sc.nextInt();
			}
			GetSumAtPrime(ar);
		} catch (Exception e) {
			System.err.println("Enter Whole Number only");
		}

	}

	private static void GetSumAtPrime(int[] ar) {
		int sum = 0;
		for (int i = 2; i < ar.length; i++) {
			int flag = 0;
			for (int z = 2; z <= i / 2; z++) {
				if (i % z == 0) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				sum += ar[i];
			}
		}
		System.out.println("The sum of the Prime indexes is: " + sum);
	}
}
