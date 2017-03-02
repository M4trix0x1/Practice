package acm;
import java.util.*;

/*
 * 1281: 打折

时间限制: 1 Sec  内存限制: 128 MB
提交: 166  解决: 149
提交状态讨论版
1号程序员:Fan 代码最简:王茹静(113) 效率最高:不努力的小艳(944)
题目描述

一件衣服95元，若消费满300元，则可以打八五折，输入要购买的衣服件数n,输出需要支付的金额（单位:元)，保留两位小数。

输入

输入要购买的衣服件数n

输出

输出需要支付的金额（单位:元)，

样例输入

10

样例输出

807.50

*/
public class P1281 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		double num=scan.nextDouble();
		double temp=num*95;
		if(temp>300){
			System.out.printf("%.2f",temp*0.85);
		}
		else
		System.out.printf("%.2f",temp);
		scan.close();
		
		// TODO Auto-generated method stub

	}

}
