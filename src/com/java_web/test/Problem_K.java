package com.java_web.test;

import java.math.BigDecimal;
import java.util.Scanner;

public class Problem_K {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while (scan.hasNextInt()) {
		BigDecimal num1=new BigDecimal(scan.nextInt());
		int num2=scan.nextInt();
		BigDecimal temp=num1.pow(num2);
		String a=temp+"";
		char []arr=a.toCharArray();
		if (temp.compareTo(new BigDecimal("10"))==-1){
			System.out.println("00"+temp);
			}
			else  if (temp.compareTo(new BigDecimal("100"))==-1)
				System.out.println("0"+temp);
				else {
					System.out.println(arr[arr.length-3]+""+arr[arr.length-2]+""+arr[arr.length-1]);
				}
		}
			scan.close();

}

}
