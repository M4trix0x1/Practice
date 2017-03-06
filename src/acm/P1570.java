package acm;
import java.io.PrintWriter;
import java.util.Scanner;
/*
 * 1570: 茵茵的第一课

时间限制: 1 Sec  内存限制: 128 MB
提交: 167  解决: 116
提交状态讨论版
1号程序员:一只孤独而灿烂的鬼怪 代码最简:方欣(69) 效率最高:dlongq(944)
题目描述

茵茵今年已经六年级了，爸爸给她报了一个学习程序设计的班。

第一节课上，老师讲的就是如何输入一个数，再原样输出出来。

以现在的你看来，挺容易的是不？
那么，就请你也写出一个一样的程序吧

输入

第一行是一个整数N(N<10)表示测试数据的组数）
接下来的n行 每行只有一个数（可能是小数，也可能是整数）
这个数的位数（整数位数+小数位数）不超过19位
输出

原样输出每个数，每输出占一行
样例输入

2
3.5
5
样例输出

3.5
5
*/


public class P1570 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		for (int T = cin.nextInt(); T-- > 0; cout.println(cin.next()))
			;
		cin.close();
		cout.close();
	}

}
