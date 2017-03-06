package acm;

import java.io.PrintWriter;
import java.util.Scanner;
/*1573: 国王的魔镜

时间限制: 1 Sec  内存限制: 128 MB
提交: 127  解决: 87
提交状态讨论版
1号程序员:虔诚的编程者 代码最简:汪志明(189) 效率最高:不想A题、尴尬(944)
题目描述

国王有一个魔镜，可以把任何接触镜面的东西变成原来的两倍——只是，因为是镜子嘛，增加的那部分是反的。 比如一条项链，我们用AB来表示，不同的字母表示不同颜色的珍珠。如果把B端接触镜面的话，魔镜会把这条项链变为ABBA。如果再用一端接触的话，则会变成ABBAABBA（假定国王只用项链的某一端接触魔镜）。 给定最终的项链，请编写程序输出国王没使用魔镜之前，最初的项链可能的最小长度。
输入

第一行是一个整数N(N<=10)表示测试数据的组数） 每组测试数据占一行 只有一个字符串（长度小于100），由大写英文字母组成，表示最终的项链。
输出

每组测试数据的输出只有一个整数，表示国王没使用魔镜前，最初的项链可能的最小长度。
样例输入

2 
ABBAABBA 
A
样例输出

2
1
*/

public class P1573 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		for (int T = cin.nextInt(); T-- > 0;) {
			cout.println(f(cin.next()));
		}
		cin.close();
		cout.close();
	}

	private static int f(String s) {
		if (s.length() <= 1 || s.length() % 2 == 1)
			return s.length();
		String rs = new StringBuffer(s).reverse().toString();
		if (rs.equals(s))
			return f(s.substring(0, s.length() / 2));
		return s.length();
	}
}
