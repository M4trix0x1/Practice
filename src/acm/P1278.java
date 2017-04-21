package acm;

/*1278: 正弦和余弦

时间限制: 1 Sec  内存限制: 128 MB
提交: 255  解决: 164
提交状态讨论版
1号程序员:coderstory 代码最简:coderstory(141) 效率最高:虔诚的编程者(980)
题目描述

输入一个正整数n(n不超过360)输出n度的正弦余弦函数值(保留三位小数）

输入

 
输入一个正整数n

输出

输出n度的正弦余弦函数值(保留三位小数）

样例输入

30
样例输出

0.500 0.866
*/
import java.util.*;

public class P1278 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int a=scan.nextInt();
		System.out.printf("%.3f %.3f",Math.sin(a*Math.PI/180),Math.cos(a*Math.PI/180));
		scan.close();
		

	}

}
