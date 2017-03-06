package acm;


import java.io.PrintWriter;
import java.util.Scanner;
/*
 * 1006: IP判断

时间限制: 1 Sec  内存限制: 128 MB
提交: 150  解决: 108
提交状态讨论版
1号程序员:dearvee 代码最简:年芳九十(519) 效率最高:顾万(944)
题目描述

在基于Internet的程序中，我们常常需要判断一个IP字符串的合法性。 
合法的IP是这样的形式： 
A.B.C.D 
其中A、B、C、D均为位于[0, 255]中的整数。为了简单起见，我们规定这四个整数中不允许有前导零存在，如001这种情况。 
现在，请你来完成这个判断程序吧^_^

输入

输入由多行组成，每行是一个字符串，输入由“End of file”结束。 
字符串长度最大为30，且不含空格和不可见字符

输出

对于每一个输入，单独输出一行 
如果该字符串是合法的IP，输出Y，否则，输出N

样例输入

1.2.3.4
a.b.c.d
267.43.64.12
12.34.56.bb
210.43.64.129
-123.4.5.6
样例输出

Y
N
N
N
Y
N
*/



public class P1006 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNextLine()) {
			String ss[] = cin.nextLine().split("\\.");
			cout.println(check(ss) ? "Y" : "N");
		}
		cin.close();
		cout.close();
	}

	private static boolean check(String[] ss) {
		for (String s : ss)
			if (!check(s))
				return false;
		return true;
	}

	private static boolean check(String s) {
		int n;
		try {
			n = Integer.parseInt(s);
		} catch (Exception e) {
			return false;
		}
		return n >= 0 && n <= 255;
	}
}
