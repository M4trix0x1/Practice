package com.java_web.test;

import java.util.Scanner;
import java.util.Stack;

public class Problem_D {  
	  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
          
        int n= sc.nextInt();//3条测试数据数据  
          
        Stack<Character> stack = null;  
          
        while(n!=0){  
              
            //从控制台读入一个测试字符串[]() [(])  
            String str = sc.next();  
            //如果该输入字符串为奇数，说明不匹配  
            if(str.length() % 2 == 1){  
                System.out.println("No");  
            }else{  
                //说明字符是偶数  
                stack = new Stack<Character>();  
                  
                //遍历第一条测试字符串[]() [(])  
                for(int i=0;i<str.length();i++){  
                    if(stack.isEmpty()){  
                        //如果栈是空的  
                        stack.push(str.charAt(i));  
                    }else if(stack.peek() == '[' && str.charAt(i) == ']' || stack.peek() == '(' && str.charAt(i) == ')'){  
                        //说明此时栈中字符不是空的,并且符合，  
                        stack.pop();  
                    }else{  
                          
                        stack.push(str.charAt(i));  
                    }  
                }  
                  
                if(stack.isEmpty()){  
                    //如果栈是空的，说明括号匹配  
                    System.out.println("Yes");  
                }else{  
                    //说明栈不为空，括号不匹配  
                    System.out.println("No");  
                }  
            }  
              
            n--;  
        }  
          sc.close();
    }  
}  