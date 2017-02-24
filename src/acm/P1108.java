package acm;

import java.util.Scanner;

public class P1108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		for (int i = 1; i < 4; i++) {
			
		
		int num=scan.nextInt();
		switch(num/10){
		case 0:
		case 1:
		case 2:	
		case 3:
		case 4:
		case 5:System.out.println("E");break;
		case 6:System.out.println("D");break;
		case 7:System.out.println("C");break;
		case 8:System.out.println("B");break;
		case 9:
		case 10:System.out.println("A");break;
		default:System.out.println("Score is error!");break;
		}
		}scan.close();

	}
	
}
