package acm;

import java.util.Scanner;

/*
 * 1285: 最简单的循环

时间限制: 1 Sec  内存限制: 128 MB
提交: 216  解决: 183
提交状态讨论版
1号程序员:Fan 代码最简:恐惊天上人(68) 效率最高:dlongq(944)
题目描述

输入一个正整数n(1000以内），输出1~n

输入

输入一个正整数n

输出

  输出1~n 每一个一行

样例输入

3
样例输出

1
2
3
*/
public class P1285 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=1;i<=n;i++)
		{System.out.println(i);}
		
		scan.close();
		// TODO Auto-generated method stub

	}

}
