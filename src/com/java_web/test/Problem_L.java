package com.java_web.test;
/*
 * Problem L: 贪吃的大嘴

Time Limit: 1 Sec  Memory Limit: 128 MB
Submit: 17  Solved: 8
上一题SubmitStatus下一题
Description

算法提高  贪吃的大嘴    
时间限制：1.0s     内存限制：256.0MB 
      
问题描述 
　　有一只特别贪吃的大嘴,她很喜欢吃一种小蛋糕,而每一个小蛋糕有一个美味度,而大嘴是很傲娇的,一定要吃美味度和刚好为m的小蛋糕,而且大嘴还特别懒,她希望通过吃数量最少的小蛋糕达到这个目的.所以她希望你能设计一个程序帮她决定要吃哪些小蛋糕. 
输入格式 
　　先输入一行包含2个整数m、n,表示大嘴需要吃美味度和为m的小蛋糕,而小蛋糕一共有n种,下面输入n行,每行2个整数,第一个表示该种小蛋糕的美味度,第二个表示蛋糕店中该种小蛋糕的总数 
输出格式 
　　输出一行包含一个整数表示大嘴最少需要吃的小蛋糕数量,若大嘴无法通过吃小蛋糕达到m的美味度和,则输出" > < “. 
样例输入 
10  2 
4  1 
2  10 
样例输出 
4 
样例输入 
10  2 
4  1 
7  3 
样例输出 
> < 
数据规模和约定 
　　m  ≤  20000,小蛋糕总数量≤50. 
*/

import java.util.Scanner;

public class Problem_L {  
    /**  
     * m:题目中的美味度  
     * n:n钟小蛋糕  
     * num[]:用来记录每种小蛋糕的数量  
     * sat[]:用来记录每种小蛋糕的美味度  
     * min:吃小蛋糕的最少数量  
     */  
    private static int m,n,num[],sat[],min=Integer.MAX_VALUE;  
    /**  
     * i:用来读入所有数据  
     * temp_t:临时存放大嘴吃的蛋糕数目  
     * temp_m:临时存放大嘴拥有的当前美味度  
     * @param args  
     */  
    public static void main(String[] args) {  
        // TODO 自动生成的方法存根  
        int time,i=0,temp_t=0,temp_m=0;  
        Scanner read=new Scanner(System.in);  
        String str,strr[];  
        str=read.nextLine();  
        strr=str.split(" ");  
        m=Integer.valueOf(strr[0]);  
        n=Integer.valueOf(strr[1]);  
        num=new int[n];  
        sat=new int[n];  
        time=n;  
        //读入所有种类的蛋糕  
        while(i<time){  
            str=read.nextLine();  
            strr=str.split(" ");  
            sat[i]=Integer.valueOf(strr[0]);  
            num[i]=Integer.valueOf(strr[1]);  
            i++;  
        }  
        read.close();  
        //从第一种蛋糕开始组合测试，即吃第一种蛋糕0个，1个，2个。。。等情况下，需要再吃多少其他蛋糕可满足条件  
        for(i=0;i<=num[0];i++){  
            temp_m+=i*sat[0];//计算临时美味度  
            if(temp_m<m){  
                if(1<n){  
                    temp_t+=i;//计算临时蛋糕数量  
                    findnext(1,temp_m,temp_t);//测试下一种蛋糕需要吃多少可满足条件  
                    temp_t-=i;//为下一次组合测试，恢复原始状态  
                }  
            }else if(temp_m==m){  
                temp_t+=i;  
                min=Math.min(temp_t, min);//比较得出最小蛋糕数目  
                break;  
            }else{  
                break;  
            }  
            temp_m-=i*sat[0];//为下一次组合测试，恢复原始状态  
        }  
        if(min<Integer.MAX_VALUE){  
            System.out.println(min);  
              
        }else{  
            System.out.println("><");  
        }  
    }  
    private static void findnext(int pos, int temp_m,int time) {  
        // TODO 自动生成的方法存根  
        int i=0,temp=temp_m;  
        for(i=0;i<=num[pos];i++){  
            temp+=i*sat[pos];  
            if(temp<m){  
                if(pos+1<n){  
                    time=time+i;  
                    findnext(pos+1,temp,time);  
                    time-=i;  
                      
                }  
            }else if(temp==m){  
                time+=i;  
                min=Math.min(time, min);  
                return;  
            }else{  
                return;  
            }  
            temp-=i*sat[pos];  
        }  
    }  
  
}