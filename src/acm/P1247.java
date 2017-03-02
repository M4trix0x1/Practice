package acm;
import java.util.*;
/*
 * 1247: Sum Problem

时间限制: 1 Sec  内存限制: 128 MB
提交: 203  解决: 147
提交状态讨论版
1号程序员:cat*pig*duck 代码最简:Fan(73) 效率最高:不努力的小艳(944)
题目描述

Hey, welcome to ahstu oj. 
In this problem, your task is to calculate SUM(n) = 1 + 2 + 3 + ... + n.
输入

The input will consist of a series of integers n, one integer per line.
输出

For each case, output SUM(n) in one line. You may assume the result will be in the range of 32-bit signed integer.
样例输入

1
100
样例输出

1
5050
*/


public class P1247 {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		int s=scan.nextInt();
		int n=scan.nextInt();
		int sum=0;
		for(int i=s;i<=n;i++){
			sum=sum+i;
		}
		System.out.println(s);
		System.out.println(sum);
		scan.close();
		// TODO Auto-generated method stub

	}

}
