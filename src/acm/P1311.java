package acm;

import java.util.*;
/*1311: 区间质数统计

时间限制: 1 Sec  内存限制: 128 MB
提交: 111  解决: 95
提交状态讨论版
1号程序员:dearvee 代码最简:黄辉腾(228) 效率最高:hy(944)
题目描述

你的任务是找出［ａ，ｂ］区间的所有质数个数
输入

两个整数 a b
输出

区间[a,b]的所有质数个数
样例输入

1 10
样例输出

4
*/

public class P1311 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int count = 0;
		int test;
		for (int i = num1; i <= num2; i++) {
			for (test = 2; test < i; test++) {
				if (i % test == 0)
					break;
			}
			if (test == i)
				count++;
		}
		System.out.println(count);
		scan.close();
		// TODO Auto-generated method stub

	}

}
