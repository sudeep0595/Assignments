import java.util.Scanner;

public class NumberUtil {

	public static void main(String[] args) {
		double a, b, c;
		System.out.println("Input two numbers to find their product");
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Number 1 = ?");
			a = sc.nextDouble();
			System.out.println("Number 2 = ?");
			b = sc.nextDouble();
			Prod(a, b);
		} catch (Exception e) {
			System.out.println("Input Numbers only");
		}
		System.out.println("Input a number to find it's square root");
		try {
			c = sc.nextDouble();
			Squarer(c);
		} catch (Exception e) {
			System.out.println("Input numbers only");
		}
	}

	private static void Squarer(double c) {
		double sqr = Math.sqrt(c);
		System.out.println("Square Root of " + c + " is equal to " + sqr);

	}

	private static void Prod(double a, double b) {
		double pr = a * b;
		System.out.println("Product of " + a + " and " + b + " = " + pr);
	}

}
