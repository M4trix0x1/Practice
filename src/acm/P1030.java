package acm;

import java.util.Scanner;
/*1030: 求素数问题

时间限制: 1 Sec  内存限制: 128 MB
提交: 246  解决: 150
提交状态讨论版
1号程序员:dearvee 代码最简:打死一楼装逼狗(166) 效率最高:不努力的小艳(944)
题目描述

求出1-N中的所有素数 


输入

大于1的正整数N

输出

1-N中的所有素数,(以从小到大的格式输出)

样例输入

9
样例输出

2 3 5 7 */

public class P1030 {
	 
    public static void main(String[] args) {
    	Scanner scan =new Scanner(System.in);
    	int num=scan.nextInt();
        int j;
        for (int i = 2; i <= num; i++) // 1不是素数，所以直接从2开始循环
        {
            j = 2;
            while (i % j != 0) {
                j++; // 测试2至i的数字是否能被i整除，如不能就自加
            }
            if (j == i) // 当有被整除的数字时，判断它是不是自身
            {
                System.out.print(i+""); // 如果是就打印出数字
            }
        }
        scan.close();
    }
 
}

