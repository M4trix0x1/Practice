package acm;

import java.util.Scanner;

public class P1206 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		for (int i = 1; i <=a; i++) {
			int n=scan.nextInt();
			int sum=0;
			for (int j = 1; j <=n; j++) {
				int test=scan.nextInt();
				if(sushu(test)==0){
					sum=sum+1;
				}
				}System.out.println(sum);
				
			}scan.close();
	}
}
			
int class Sushu(int n){
	for(int i=1;i<=n;i++){
		if(n%i==0&&i==n)
			return 0;
		else
			break;
	}
}
			



