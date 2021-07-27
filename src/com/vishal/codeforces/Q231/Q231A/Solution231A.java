package com.vishal.codeforces.Q231.Q231A;

import java.util.*;

public class Solution231A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n      = sc.nextInt();
        int count=0;
        while (n--!=0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            count+=(a+b+c)/2;
        }
        System.out.println(count);
        sc.close();
    }
}