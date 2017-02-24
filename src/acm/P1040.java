package acm;

import java.util.Scanner;

public class P1040 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int sum=0;
		for(int i=1;i<=num;i=i+2){
			sum=sum+i;
		}
		System.out.println(sum);
		// TODO Auto-generated method stub
		scan.close();

	}

}
