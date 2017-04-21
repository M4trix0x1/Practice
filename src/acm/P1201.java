package acm;
/*
 * 1201: 被3、5整除的数

时间限制: 1 Sec  内存限制: 128 MB
提交: 410  解决: 306
提交状态讨论版
1号程序员:dearvee 代码最简:恐惊天上人(58) 效率最高:微分(944)
题目描述

计算从 m 到 n 能同时被3和5整除的数的个数
输入

输入两个整数 m, n ( 0 < m <= n < 10000 )。
输出

输出从 m 到 n 能同时被3和5整除的数的个数

样例输入

1 1000
样例输出

66
*/

import java.util.Scanner;

public class P1201 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num1= scan.nextInt();
		int num2=scan.nextInt();
		int count=0;
		for (int i = num1; i <= num2; i++) {
			if (i%15==0) {
				count++;
			}
		}
		System.out.println(count);
		scan.close();
		// TODO Auto-generated method stub

	}

}
