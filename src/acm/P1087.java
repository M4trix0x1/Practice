package acm;
import java.io.PrintWriter;
import java.util.*;
/*
 * 1087: 去掉空格

Time Limit: 1 Sec  Memory Limit: 128 MB
Submit: 128  Solved: 85
SubmitStatusWeb Board
1号程序员:dearvee 代码最简:郑碧峰(109) 效率最高:VaeJerry(944)
Description

读入一些字符串，将其中的空格去掉。

Input

输入为多行，每行为一个字符串，字符串只由字母、数字和空格组成，长度不超过80。请处理到文件末尾。

Output

对于每行输入，输出转换后的字符串。

Sample Input

Hello World
1 2 3
Nice to meet you
abc
Sample Output

HelloWorld
123
Nicetomeetyou
abc

HINT


用scanf是不能读入一行有空格的字符串的，用gets吧。 用“gets(str) != NULL”可以判断输入是否结束，如果此条件为假（即gets(str) == NULL），则表示输入结束（对于本题）。

*/

public class P1087 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		PrintWriter cout=new PrintWriter(System.out);
		while(scan.hasNextLine())
		cout.println(scan.nextLine().replaceAll("\\s+", ""));
		scan.close();
		cout.close();
		// TODO Auto-generated method stub

	}

}
