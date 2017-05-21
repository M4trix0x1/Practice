	package com.java_web.test;
	
//	Problem F: 找子串
//
//	Time Limit: 1 Sec  Memory Limit: 128 MB
//	Submit: 51  Solved: 46
//	上一题SubmitStatus下一题
//	Description
//
//	给定原子串和目标子串，要你求得目标子串在原子串当中出现的次数。
//
//	Input
//
//	多组测试数据，每组测试数据第一行是原子串，第二行是目标子串 
//	子串长度不会超过100. 
//	Output
//
//	输出目标子串在原子串当中出现的次数。
//
//	Sample Input
//
//	abc123abc
//	abc
//	aabcCdeAbcAbcdeccde
//	cde
//	Sample Output
//
//	2
//	2
	import java.util.Scanner;
	
	public class Problem_F {
		public static void main(String[] args) {
			Scanner str=new Scanner(System.in);
			while (str.hasNextLine()) {
				String target=str.nextLine();
				String key=str.nextLine();
				if (target.contains(key)) {
					String temp=target.replaceAll(key, "");
					System.out.println((target.length()-temp.length())/key.length());
//					Count(target,key);
				} else {
					System.out.println(0);
				}
			}
			str.close();
		}
	}
	
//		private static void Count(String target, String key) {
//			// TODO 自动生成的方法存根
//			int count=0;  
//			  int d=0;  
//			  while((d=target.indexOf(key,d))!=-1){  
//			      target=target.substring(d+key.length());  
//			      count++;  
//			  }      
//			    System.out.println(count);;  
//			}  
//		}
//	
