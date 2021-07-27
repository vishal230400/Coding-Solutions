package com.vishal.codeforces.Q110.Q110A;

import java.util.*;

public class Solution110A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n      = sc.nextLong();
        String str=Long.toString(n);
        int i=0;
        for (char ch:str.toCharArray()
             ) {
            if(ch=='4'||ch=='7')
            {
                i++;
            }
        }
        String str1=Integer.toString(i);
        boolean isNearLucky=true;
        for (char ch:str1.toCharArray()
        ) {
            if(!(ch=='4'||ch=='7'))
            {
                isNearLucky=false;
                break;
            }
        }
        if(isNearLucky)
        {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
        sc.close();
    }
}