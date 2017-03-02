package acm;

import java.util.Scanner;

public class TestSu {
	 
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