public class Divisors50 {

	public static void main(String[] args) {
		int lim = 50;
		System.out.print("Divisors of "+lim+" are: ");
		for (int i = 1; i <= lim; i++) {
			if (lim % i == 0) {
				System.out.print(i+" ");
			}
		}

	}

}
