package com.java_web.test;
/*Problem G: 最小乘积(提高型)

Time Limit: 1 Sec  Memory Limit: 128 MB
Submit: 8  Solved: 8
上一题SubmitStatus下一题
Description

   算法提高  最小乘积(提高型)    
时间限制：1.0s     内存限制：512.0MB 
      
问题描述 
　　给两组数，各n个。 
　　请调整每组数的排列顺序，使得两组数据相同下标元素对应相乘，然后相加的和最小。要求程序输出这个最小值。 
　　例如两组数分别为:1  3　　-5和-2  4  1 

　　那么对应乘积取和的最小值应为： 
　　(-5)  *  4  +  3  *  (-2)  +  1  *  1  =  -25 
输入格式 
　　第一个行一个数T表示数据组数。后面每组数据，先读入一个n，接下来两行每行n个数，每个数的绝对值小于等于1000。 
　　n< =1000,T< =10 
输出格式 
　　一个数表示答案。 
样例输入 
2 
3 
1  3  -5 
-2  4  1 
5 
1  2  3  4  5 
1  0  1  0  1 

样例输出 
-25 
6 
*/

import java.util.Arrays;
import java.util.Scanner;

public class Problem_G {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num =scan.nextInt();
		for(int i=1;i<=num;i++)
		{
			int temp=scan.nextInt();
			int []a=new int [temp];
			for(int c=0;c<=temp-1;c++)
				a[c]=scan.nextInt();
			Arrays.sort(a);
			int []b=new int [temp];
			for(int c=0;c<=temp-1;c++)
				b[c]=scan.nextInt();
			Arrays.sort(b);
			int count=0;
			for (int j = 0; j < a.length; j++) {
				count=count+a[j]*b[temp-j-1];
			}
			System.out.println(count);
		}
		scan.close();
	}

}
