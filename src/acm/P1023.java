package acm;
import java.util.*;
/*1023: 最大数问题

时间限制: 1 Sec  内存限制: 128 MB
提交: 174  解决: 143
提交状态讨论版
1号程序员:dearvee 代码最简:张泰岳(95) 效率最高:zym(944)
题目描述

输入若干个整数,以-1标记输入结束。输出其中的最大数

输入

若干个整数。（以-1标记输入结束）

输出

其中的最大数

样例输入

1 2 5 7 8 6 1 -6 -1
样例输出

8

*/

public class P1023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int temp=scan.nextInt();
		int max=temp;
		for(;;){
			int temp2=scan.nextInt();
			if(temp2==-1){
				System.out.println(max);
				break;
			}
			else
			{
				if(temp2>max){
					max=temp2;
				}
			}
		}
		scan.close();

	}

}
