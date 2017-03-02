package acm;
import java.util.*;
/*1282: 绝对值

时间限制: 1 Sec  内存限制: 128 MB
提交: 233  解决: 185
提交状态讨论版
1号程序员:dearvee 代码最简:恐惊天上人(58) 效率最高:张莹俐(944)
题目描述

输入一个浮点数f,输出它的绝对值 保留2位小数

输入

输入一个浮点数f

输出

输出它的绝对值

样例输入

-2.55
样例输出

2.55
*/


public class P1282 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double num =scan.nextDouble();
		if(num<0){
			System.out.printf("%.2f",-num);
		}
		else
			System.out.printf("%.2f",num);
			
		scan.close();
		}
		// TODO Auto-generated method stub

	}


