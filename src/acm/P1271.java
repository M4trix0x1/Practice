package acm;

import java.util.Scanner;

public class P1271 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double r=scan.nextDouble();
		double h=scan.nextDouble();
		System.out.printf("Area=%.3f",r*r*3.1415926*2+r*2*3.1415926*h);
		// TODO Auto-generated method stub
		scan.close();

	}

}
