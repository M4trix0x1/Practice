package acm;
import java.util.*;
/*
 * 
输入三角形三边长度a,b,c(均为正整数)

输出

 
判断能否为直角三角形的三个边长。如果可以则输出"yes",如果不能则输出"no",如果根本无法组成三角形则输出 "not a triangle"

样例输入

3 5 4
样例输出

yes

*/

public class P1283 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();
		if(num1+num2<num3||num1+num3<num2||num2+num3<num1)
		System.out.println("not a triangle");
		else{
			if(num1*num1+num2*num2==num3*num3||num2*num2+num3*num3==num1*num1||num1*num1+num3*num3==num2*num2){
				System.out.println("yes");
			}
			else
				System.out.println("no");
		}
		scan.close();
	}

}
