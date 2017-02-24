package acm;

import java.util.Scanner;

public class P1207 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		for (int i = 1; i < 10; i++) {
		int num = scan.nextInt();
		int a=num/100;
		int b=num/10%10;
		int c=num%10;
		if(num==0){
			System.exit(0);}
			else{
				
			
		if(a*a*a+b*b*b+c*c*c==num){
			System.out.println("Yes");}
			else{
				System.out.println("No");
			}
				
			
		}
		}scan.close();
		}// TODO Auto-generated method stub

	}

