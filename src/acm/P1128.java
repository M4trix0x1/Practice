package acm;

import java.util.Scanner;
/*1128: 检查一个数是否为质数

时间限制: 1 Sec  内存限制: 128 MB
提交: 273  解决: 193
提交状态讨论版
1号程序员:Tencent 代码最简:王茹静(125) 效率最高:zylin(944)
题目描述

输入一个正整数，检查该数是否为质数

输入

输入一个正整数

输出

输出Y或者N

样例输入

34
样例输出

N
*/

public class P1128 {
	 
    public static void main(String[] args) {
    	Scanner scan =new Scanner(System.in);
    	int num=scan.nextInt();
    	int i;
    	if(num<2){
    		System.out.println("N");
    	}
    	else{
        for (i = 2; i < num; i++) // 1不是素数，所以直接从2开始循环
        {
        	if(num%i==0){
        	System.out.println("N");
        	break;
        	}

        }
        if(i==num){
        	System.out.println("Y");
        }
        scan.close();
    }
 
}
}