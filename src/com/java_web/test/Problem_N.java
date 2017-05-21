package com.java_web.test;

public class Problem_N {

	public static void main(String[] args) {
		for(int i=1000;i<10000;i++)
			{
			int a=i/100;
			int b=i%100;
			if(Math.pow(a+b, 2)==i)
				System.out.print(i+"  ");
			}
		// TODO 自动生成的方法存根

	}

}
