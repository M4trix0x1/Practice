package acm;
import java.util.*;

public class P1202 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int number;
		int temp;
		while(scan.hasNext()){
			number=scan.nextInt();
			temp=number%10+number%100/10+number/100;
			if(number%temp==0){
				System.out.println("Lucky Word");
			}else
			{
				System.out.println("No Answer");
			}
			
		}
		scan.close();
	}

}
