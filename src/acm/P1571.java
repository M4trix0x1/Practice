package acm;

import java.io.PrintWriter;
import java.util.Scanner;
/*1571: 数数小木块

时间限制: 1 Sec  内存限制: 128 MB
提交: 113  解决: 97
提交状态讨论版
1号程序员:周凯 代码最简:方欣(124) 效率最高:段亚飞(944)
题目描述

在墙角堆放着一堆完全相同的正方体小木块，如下图所示： 


因为木块堆得实在是太有规律了，你只要知道它的层数就可以计算所有木块的数量了。 现在请你写个程序 给你任一堆木块的层数，求出这堆木块的数量

输入

第一行是一个整数N(N<=10)表示测试数据的组数） 接下来的n行 每行只有一个整数 ，表示这堆小木块的层数，
输出

对应每个输入的层数有一个输出，表示这堆小木块的总数量，每个输出占一行
样例输入

2 
1
5
样例输出

1
35

*/

public class P1571 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		for (int T = cin.nextInt(); T-- > 0;) {
			int n = cin.nextInt();
			cout.println(1L * n * (n + 1) * (n + 2) / 6);
		}
		cin.close();
		cout.close();
	}
}
