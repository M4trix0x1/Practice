package com.java_web.test;
/*
Problem I: 单词个数统计

Time Limit: 1 Sec  Memory Limit: 128 MB
Submit: 27  Solved: 25
上一题SubmitStatus下一题
Description

算法提高  单词个数统计    
时间限制：1.0s     内存限制：512.0MB 
      
问题描述 
　　编写一个程序，输入一个字符串（长度不超过80），然后统计出该字符串当中包含有多少个单词。例如：字符串“this  is  a  book”当中包含有4个单词。 
　　输入格式：输入一个字符串，由若干个单词组成，单词之间用一个空格隔开。 
　　输出格式：输出一个整数，即单词的个数。 
　　输入输出样例 
　　用户输入数据样例： 
　　this  is  a  book 
　　系统输出数据如下： 
　　4 

参考代码： 
*/
import java.util.Scanner;

public class Problem_I {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		String temp=str.replaceAll(" ", "");
		System.out.println(str.length()-temp.length()+1);
		scan.close();
	}

}
