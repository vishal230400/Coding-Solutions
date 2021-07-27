package com.vishal.codeforces.Q116.Q116A;

import java.util.*;

public class Solution116A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n      = sc.nextInt();
        int max=0,count=0;
        while(n--!=0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            count=count+b-a;
            max=Math.max(max,count);
        }
        System.out.println(max);
        sc.close();
    }
}