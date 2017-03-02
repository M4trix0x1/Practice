package acm;
import java.util.*;
/*1277: 连续和

时间限制: 1 Sec  内存限制: 128 MB
提交: 239  解决: 202
提交状态讨论版
1号程序员:dearvee 代码最简:恐惊天上人(57) 效率最高:段亚飞(944)
题目描述

输入正整数n(n不超过1000000)输出1+2+3+...+n的值
输入

一个正整数n

输出

输出1+2+3+...+n的值。

样例输入

100
样例输出

5050
*/

public class P1277 {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		int n=scan.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++){
			sum=sum+i;
		}
		System.out.println(sum);
		scan.close();
		// TODO Auto-generated method stub

	}

}
