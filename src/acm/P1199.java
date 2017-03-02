package acm;
import java.util.*;
/*
 * 1199: A+B Problem

时间限制: 1 Sec  内存限制: 128 MB
提交: 396  解决: 172
提交状态讨论版
1号程序员:dearvee 代码最简:Fan(68) 效率最高:dlongq(944)
题目描述

A+B Problem 水题水题, 没有最水，只有更水。
输入

连续输入两个整数 a、 b，当a=0且b=0时结束输入

输出

输出a+b的值，并换行。

样例输入

1 2
0 0
样例输出

3
*/

public class P1199 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num2;
		int num1;
		for(;;){
			num1=scan.nextInt();
			num2=scan.nextInt();
			if(num1==0&&num2==0)
				break;
			System.out.println(num1+num2);
		}
		scan.close();
		System.exit(0);
	}
}
