package acm;

import java.util.Scanner;

public class P1272 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int a=num/100;
		int b=num/10%10;
		int c=num%10;
		if(c==0){
			System.out.println(b*10+a);
		}
			else{
				System.out.println(c*100+b*10+a);
		}
		// TODO Auto-generated method stub
		scan.close();
	}

}
