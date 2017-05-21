/*
 * Problem A: 兔子繁衍问题

Time Limit: 1 Sec  Memory Limit: 128 MB
Submit: 57  Solved: 43
上一题SubmitStatus下一题
Description

一对兔子，从出生后第3个月起每个月都生一对兔子。小兔子长到第3个月后每个月又生一对兔子。假如兔子都不死，请问第1个月出生的一对兔子，至少需要繁衍到第几个月时兔子总数才可以达到N对？
Input

输入在一行中给出一个不超过10000的正整数N。
Output

多组输入，在一行中输出兔子总数达到N最少需要的月数。
Sample Input

1
2
30
Sample Output

1
3
9
*/
package com.java_web.test;

import java.util.Scanner;

public class Problem_A {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while (scan.hasNextInt()) {
			int num=scan.nextInt();
			for (int i = 1; ; i++) {
				if(Fiber(i)<num)
					continue;
				else
					System.out.println(i);
					break;
			}
			
		} 
		scan.close();
	}

	private static int Fiber(int i) {
        if(i <= 2){  
            return 1;  
        }else{  
            return Fiber(i-1) + Fiber(i-2);  
        }  
		// TODO Auto-generated method stub
	}

}
