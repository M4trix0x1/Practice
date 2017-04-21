package acm;

/*
 * 1567: 是不是太胖了

时间限制: 1 Sec  内存限制: 128 MB
提交: 201  解决: 111
上一题提交状态下一题
题目描述

据说一个人的标准体重应该是其身高（单位：厘米）减去100、再乘以0.9所得到的公斤数。已知市斤是公斤的两倍。现给定某人身高，请你计算其标准体重应该是多少？（顺便也悄悄给自己算一下吧……）
输入

多组输入，输入第一行给出一个正整数H（100 < H <= 300），为某人身高。
输出

在一行中输出对应的标准体重，单位为市斤，保留小数点后1位。
样例输入

169
样例输出

124.2
*/
import java.util.*;

public class P1567 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		while(scan.hasNext())
		{
			float temp = scan.nextFloat();
			System.out.printf("%.1f",(temp-100)*0.9*2L);
		}
		scan.close();
		// TODO Auto-generated method stub

	}

}
