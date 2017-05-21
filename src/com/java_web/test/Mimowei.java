package com.java_web.test;

import java.util.*;

public class Mimowei {
public static void main(String[]args){
Scanner sc=new Scanner(System.in);	
   long num ;
    int a,b;
  while(true){
	  a=sc.nextInt();
	    b=sc.nextInt();
	    num=Jiesheng(a,b);
     if(num>10&&num<100)
     {
    	 System.out.println("0"+num/10+num%10);
//    	System.out.println(num/10);
//    	System.out.println(num%10);
     }
     else if(num<10){
    	 System.out.println("0"+"0"+num);
//    	 System.out.println("0");
//    	 System.out.println(num);
     }
     else if(num>100&&num<1000){
    	// System.out.println(num/100%10+num/10%10+num%10);
//    	 System.out.println(num/10%10);
    	 System.out.println(num);
     }
     else{
    	 System.out.println(num/100%10+""+num/10%10+""+num%10);
     }
  }
}
private static long Jiesheng( int a, int b){
	 long sum=1;
	for(int i=0;i<b;i++){
		sum=sum*a;
	}
if(sum>1000)
sum=sum%100;
return sum;
}
}
