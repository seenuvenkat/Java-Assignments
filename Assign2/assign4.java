import java.util.Scanner;

public class assign4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows  :");
		int size = sc.nextInt();

		for (int m = size; m > 0; m--) {
			for (int n = 1; n <= m; n++) {
				System.out.print(n);
			}
			System.out.println();
		}

		for (int m = 2; m <= size; m++) {
			for (int n = 1; n <= m; n++) {
				System.out.print(n);
			}
			System.out.println();
		}
	}
}