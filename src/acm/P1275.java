package acm;

import java.util.Scanner;

/*1275: 计算平均数

时间限制: 1 Sec  内存限制: 128 MB
提交: 561  解决: 315
提交状态讨论版
1号程序员:dearvee 代码最简:Fan(90) 效率最高:dongjie(944)
题目描述

输入三个整数，输出他们的平均数（保留三位小数）

输入

输入三个整数

输出

输出他们的平均数（保留三位小数）

样例输入

1 2 3
样例输出

2.000
*/
public class P1275 {
	public static void main(String[] args) {
		Scanner num=new Scanner(System.in);
		int shu1=num.nextInt();
		int shu2=num.nextInt();
		int shu3=num.nextInt();
		double avg=(shu1+shu2+shu3)/3;
		System.out.printf("%.3f",avg);
		num.close();
	}

}
