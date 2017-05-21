/*
 * Problem C: 核桃的数量

Time Limit: 1 Sec  Memory Limit: 128 MB
Submit: 11  Solved: 10
上一题SubmitStatus下一题
Description

历届试题  核桃的数量    
时间限制：1.0s     内存限制：256.0MB 
      
问题描述 
小张是软件项目经理，他带领3个开发组。工期紧，今天都在加班呢。为鼓舞士气，小张打算给每个组发一袋核桃（据传言能补脑）。他的要求是： 
1.  各组的核桃数量必须相同 
2.  各组内必须能平分核桃（当然是不能打碎的） 
3.  尽量提供满足1,2条件的最小数量（节约闹革命嘛） 
输入格式 
输入包含三个正整数a,  b,  c，表示每个组正在加班的人数，用空格分开（a,b,c< 30）  
输出格式 
输出一个正整数，表示每袋核桃的数量。  
样例输入1 
2  4  5  
样例输出1 
20  
样例输入2 
3  1  1  
样例输出2 
3  

*/
package com.java_web.test;

import java.util.Scanner;

public class Problem_C {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		for(int i=Max(a,b,c);;i=i*2)
		{
			if(i%a==0&&i%b==0&&i%c==0)
				{System.out.println(i);
				break;
				}
		}
		scan.close();
	}

	private static int Max(int a, int b, int c) {
		// TODO Auto-generated method stub
		int temp=a;
		if (temp<b)
			temp=b;;
		if(temp<c)
			temp=c;
		return temp;
	}

}
