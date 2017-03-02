package acm;

import java.util.Scanner;
/*
1034: 素数问题

时间限制: 1 Sec  内存限制: 128 MB
提交: 241  解决: 196
提交状态讨论版
1号程序员:宗亢 代码最简:恐惊天上人(100) 效率最高:张莹俐(940)
题目描述

编写一个程序判断一个数是否为素数

输入

正整数N 不超过2000

输出

1或0(其中1表示此数为素数,0为表示为不是素数)

样例输入

5
样例输出

1
*/

public class P1034 {
	 
    public static void main(String[] args) {
    	Scanner scan =new Scanner(System.in);
    	int num=scan.nextInt();
    	int i;
    	if(num<2){
    		System.out.println(0);
    	}
    	else{
        for (i = 2; i < num; i++) // 1不是素数，所以直接从2开始循环
        {
        	if(num%i==0){
        	System.out.println(0);
        	break;
        	}

        }
        if(i==num){
        	System.out.println(1);
        }
        scan.close();
    }
 
}
}