public class RomanNumerals {

	public static void main(String[] args) {
		int i = 1, v = 5, x = 10, l = 50, c = 100, d = 500, m = 1000;
		System.out.println("Roman Numeral conversion upto 3000");
		for (int a = 1; a <= 3000; a++) {
			int b = a;
			System.out.print(b + ": ");
			do {
				if ((b / m) >= 1) {
					System.out.print("M");
					b -= m;
				} else if ((b % m) >= 900 && (b % m) < 1000) {
					System.out.print("CM");
					b -= 900;
				} else if ((b % m) >= 400 && (b % m) < 500) {
					System.out.print("CD");
					b -= 400;
				} else if ((b / d) >= 1) {
					System.out.print("D");
					b -= d;
				} else if ((b / c) >= 1) {
					System.out.print("C");
					b -= c;
				} else if ((b % c) >= 90 && (b % c) < 100) {
					System.out.print("XC");
					b -= 90;
				} else if ((b % c) >= 40 && (b % c) < 50) {
					System.out.print("XL");
					b -= 40;
				} else if ((b / l) >= 1) {
					System.out.print("L");
					b -= l;
				} else if ((b / x) >= 1) {
					System.out.print("X");
					b -= x;
				} else if ((b % x) >= 9 && (b % x) < 10) {
					System.out.print("IX");
					b -= 9;
				} else if ((b % x) >= 4 && (b % x) < 5) {
					System.out.print("IV");
					b -= 4;
				} else if ((b / v) >= 1) {
					System.out.print("V");
					b -= v;
				} else if ((b / i) >= 1) {
					do {
						System.out.print("I");
						b -= i;
					} while (b != 0);
				}
			} while (b != 0);
			System.out.println();
		}
	}
}
