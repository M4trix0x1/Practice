package acm;
import java.util.*;
/*
 * 1123: 最小公倍数

时间限制: 1 Sec  内存限制: 128 MB
提交: 164  解决: 128
提交状态讨论版
1号程序员:葛文静 代码最简:Fan(128) 效率最高:段亚飞(944)
题目描述

两个正整数，计算这两个数的最小公倍数

输入

输入数据只有一行，包括两个不大于1000的正整数.

输出

输出数据也只有一行，给出这两个数的最小公倍数。

样例输入

10 14
样例输出

70
*/

public class P1123 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num1 =scan.nextInt();
		int num2=scan.nextInt();
		for(int i=num1;;i=i+num1){
			if(i%num2==0){
				System.out.println(i);
				break;
			}
				else
					continue;
			}
		scan.close();
		}
		// TODO Auto-generated method stub

	}


