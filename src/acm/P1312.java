package acm;

import java.util.Scanner;

public class P1312 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num1= scan.nextInt();
		int num2=scan.nextInt();
		int count=0;
		for (int i = num1; i <= num2; i++) {
			if (i%15==0) {
				count++;
			}
		}
		System.out.println(count);
		scan.close();
		// TODO Auto-generated method stub

	}

}
