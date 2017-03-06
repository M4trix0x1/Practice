package acm;

import java.util.Arrays;
import java.util.Scanner;

/*1220: 删除重复

时间限制: 1 Sec  内存限制: 128 MB
提交: 251  解决: 179
提交状态讨论版
1号程序员:dearvee 代码最简:孙孟强(294) 效率最高:段亚飞(944)
题目描述

在一无符号整型数组中，存在着一些重复的数字，请将重复的数字去掉，再按升序进行输出。
输入

输入数据由两行组成，第一行为数字的数量，第二行则是由空格分隔的数据。
输出

由回车分隔的若干数据。
样例输入

5
1 1 6 3 3
样例输出

1
3
6
提示

（注：待处理的数据不超过200个，且所有数据都为[0,10000]之间的自然数。）
*/

public class P1220 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n=cin.nextInt();
		int[] a=new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i]=cin.nextInt();
		}
		Arrays.sort(a);
		System.out.println(a[0]);
		int visited=a[0];
		for (int i = 1; i < a.length; i++) {
			if(a[i]==visited)
				continue;
			System.out.println(a[i]);
			visited=a[i];			
		}
		cin.close();
	}
}
