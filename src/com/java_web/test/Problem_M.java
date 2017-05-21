package com.java_web.test;

import java.util.Arrays;
import java.util.Scanner;

public class Problem_M {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int m=scan.nextInt();
		while(m>0)
		{
			int rec=scan.nextInt();
			int []a =new int [32];
			int i=0;
			while (rec>0) {
				a[31-i]=rec%2;
				rec=rec/2;
				i++;
			}
                String c=Arrays.toString(a);
                System.out.println(c.replaceAll(",", "").replaceAll(" ", "").replaceAll("]", "").replaceAll("\\[", ""));
                m--;
 		}
		scan.close();
	}

}
