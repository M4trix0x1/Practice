package acm;

import java.util.Scanner;

public class void main() P1206 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		for (int i = 1; i <= a; i++) {
			int n = scan.nextInt();
			int sum = 0;
			 for (int j = 1; j <= n; j++) {
				int test = scan.nextInt();
				if (Sushu(test) == 1) {
					sum = sum + test;
				}
			}
			System.out.println(sum);

		}
		scan.close();
	}

	private static int Sushu(int n) {
		int i;
		for (i = 1; i < n; i++)
			if (n % i == 0)
				return 0;
		return ;
	}

}
