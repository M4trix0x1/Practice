package com.java_web.test;

/*
 * Problem O: 破解简单密码

Time Limit: 1 Sec  Memory Limit: 128 MB
Submit: 101  Solved: 30
上一题SubmitStatus下一题
Description

密码是我们生活中非常重要的东东，我们的那么一点不能说的秘密就全靠它了。哇哈哈. 
接下来渊子要在密码之上再加一套密码，虽然简单但也安全。 
假设老王原来一个BBS上的密码为zvbo941987,为了方便记忆，他通过一种算法把这个密码变换成YUANzi1987，这个密码是他的名字和出生年份，怎么忘都忘不了，而且可以明目张胆地放在显眼的地方而不被别人知道真正的密码。 
他是这么变换的，大家都知道手机上的字母： 1--1， abc--2, def--3, ghi--4, jkl--5, mno--6, pqrs--7, tuv--8 wxyz--9, 0--0,就这么简单，老王把密码中出现的小写字母都变成对应的数字，数字和其他的符号都不做变换，声明：密码中没有空格，而密码中出现的大写字母则边成小写之后往后移一位，如：X，先边成小写，再往后移一位，不就是y了嘛，简单吧。记住，z往后移是a哦。

Input

输入包括多个测试数据。输入是一个明文，密码长度不超过100个字符，输入直到文件结尾。 

Output

输出渊子真正的密文。

Sample Input

YUANzi1987
Sample Output

zvbo941987
*/

import java.util.Scanner;

public class Problem_O {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while (scan.hasNextLine()) {
			String str=scan.nextLine();
			System.out.println(str.replaceAll("a|b|c", "2").replaceAll("d|e|f", "3").replaceAll("g|h|i", "4").replaceAll("j|k|l", "5").replaceAll("m|n|o", "6").replaceAll("p|q|r|s", "7").replaceAll("t|u|v", "8").replaceAll("w|x|y|z", "9").replaceAll("A", "b").replaceAll("B", "c").replaceAll("C", "d").replaceAll("D", "e").replaceAll("E", "f").replaceAll("F", "g").replaceAll("G", "h").replaceAll("H", "i").replaceAll("I", "j").replaceAll("J", "k").replaceAll("K", "l").replaceAll("L", "m").replaceAll("M", "n").replaceAll("N", "o").replaceAll("O", "p").replaceAll("P", "q").replaceAll("Q", "r").replaceAll("R", "s").replaceAll("S", "t").replaceAll("T", "u").replaceAll("U", "v").replaceAll("V", "w").replaceAll("W", "x").replaceAll("X", "y").replaceAll("Y", "z").replaceAll("Z", "a"));
		}
		scan.close();
	}

}
