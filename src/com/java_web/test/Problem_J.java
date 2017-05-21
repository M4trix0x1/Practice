package com.java_web.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem_J{
    static int n;
    static int h;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        //
        String[] b = a.split(" |, |\\. |\\.");
        Map<String, Integer> m = new LinkedHashMap();
        for(int i=0;i<b.length;i++){
            b[i] = b[i].toLowerCase();
        }
        for(int i=0;i<b.length;i++){
            if(m.containsKey(b[i])){
                m.put(b[i], m.get(b[i])+1);
            }else{
                m.put(b[i], 1);
            }
        }
        for(String s: m.keySet()){
            System.out.print(s.toUpperCase()+":");
            for(int i=0;i<m.get(s);i++){
                System.out.print("*");
            }
            System.out.println(m.get(s));
        }
        input.close();
    }
    

}
