package acm;

import java.util.Scanner;

public class P1042 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int jc=1;
		for(int i=1;i<=num;i++){
			jc=jc*i;
		}
		System.out.println(jc);
		scan.close();
		// TODO Auto-generated method stub

	}

}
