package acm;

import java.util.Scanner;
/*1273: 变量交换

时间限制: 1 Sec  内存限制: 128 MB
提交: 260  解决: 205
提交状态讨论版
1号程序员:cat*pig*duck 代码最简:恐惊天上人(55) 效率最高:VaeJerry(944)
题目描述

输入两个整数a,b,交换二者的值然后输出

输入

输入两个整数a,b

输出


	输出交换值后的a,b


样例输入

824 16
样例输出

16 824
*/


public class P1273 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int temp;
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println(num1+" "+num2);
		scan.close();

		// TODO Auto-generated method stub

	}

}
