import java.util.Scanner;

public class ArraySumOfDigits {

	public static void main(String[] args) {
		int size = 0;
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int[] ar = new int[size];
		int[] ar1 = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the " + (i + 1) + " element:");
			ar[i] = sc.nextInt();
		}
		for (int j = 0; j < size; j++) {
			int sum = 0;
			int temp = ar[j];
			while (temp != 0) {
				sum += temp % 10;
				temp /= 10;
			}
			ar1[j] = sum;
		}
		for (int k = 0; k < size; k++) {
			for (int l = k + 1; l < size; l++) {
				if (ar1[k] > ar1[l]) {
					int a = ar1[k];
					ar1[k] = ar1[l];
					ar1[l] = a;
					int b = ar[k];
					ar[k] = ar[l];
					ar[l] = b;
				}
			}
		}
		/*for (int i = 0; i < size; i++) {
			System.out.print(ar1[i] + " ");
		}
		 * System.out.println(); for (int i = 0; i < size; i++) { System.out.print(ar[i]
		 * + " "); } System.out.println();
		 */
		for (int k = 0; k < size - 1; k++) {
			int l = k + 1;
			if (ar1[k] == ar1[l]) {
				if (ar[k] > ar[l]) {
					int a = ar[k];
					ar[k] = ar[l];
					ar[l] = a;
				}
			}
		}
		System.out.print("Sorted List: ");
		for (int i = 0; i < size; i++) {
			System.out.print(ar[i] + " ");
		}
	}

}
