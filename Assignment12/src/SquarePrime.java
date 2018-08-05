
public class SquarePrime {

	public static void main(String[] args) {
		int i = 2, k = 1;
		System.out.println("1");
		while (k <= 900) {
			int flag = 0;
			for (int a = 2; a <= i / 2; a++) {
				if ((i % a) == 0) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				k = i * i;
				if (k <= 900) {
					System.out.println(k + " ");
				}
			}
			i++;
		}
	}
}
