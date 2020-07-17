import java.util.Scanner;

public class assign2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Rows : ");
		int size = sc.nextInt();

		for (int m = 1; m <= size; m++) {
			for (int n = 1; n <= i; n++) {
				System.out.print(n);
			}
			System.out.println();
		}
		for (int m = size - 1; m >= 0; m--) {
			for (int n = 1; n <= m; n++) {
				System.out.print(n);
			}
			System.out.println();
		}

	}
}