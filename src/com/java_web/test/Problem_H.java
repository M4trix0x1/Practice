/*Problem H: Hanoi问题

Time Limit: 1 Sec  Memory Limit: 128 MB
Submit: 5  Solved: 2
上一题SubmitStatus下一题
Description

算法训练  Hanoi问题    
时间限制：1.0s     内存限制：512.0MB 
      
问题描述 
　　如果将课本上的Hanoi塔问题稍做修改：仍然是给定N只盘子，3根柱子，但是允许每次最多移动相邻的M只盘子（当然移动盘子的数目也可以小于M）,最少需要多少次？ 
　　例如N=5，M=2时，可以分别将最小的2个盘子、中间的2个盘子以及最大的一个盘子分别看作一个整体，这样可以转变为N=3，M=1的情况，共需要移动7次。 
输入格式 
　　输入数据仅有一行，包括两个数N和M（0< =M< =N< =8） 
输出格式 
　　仅输出一个数，表示需要移动的最少次数 
样例输入 
5  2 

样例输出 
7 

*/
package com.java_web.test;

import java.util.Scanner;

public class Problem_H {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		long a=scan.nextInt();
		long b=scan.nextInt();
		long m;
		if(a%b==0)
			m=a/b;
		else 
			m=a/b+1;
		System.out.println(Hanoi(m));
		scan.close();
	}


	private static long Hanoi(long m) {
		long temp =1;
		for(long i=1;i<m;i++)
		temp=2*temp+1;
		return temp;
		// TODO Auto-generated method stub
	}

}
