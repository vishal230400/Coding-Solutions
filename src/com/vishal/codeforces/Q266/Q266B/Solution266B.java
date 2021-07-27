package com.vishal.codeforces.Q266.Q266B;

import java.util.*;

public class Solution266B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n      = sc.nextInt();
        int t=sc.nextInt();
        String str=sc.next();
        StringBuilder stringBuilder=new StringBuilder(str);
        while(t--!=0) {
            for (int i = 0; i < n; i++) {
                if (i!=n-1 && stringBuilder.charAt(i) == 'B' && stringBuilder.charAt(i + 1) == 'G') {
                    stringBuilder.replace(i,i+2,"GB");
                    i++;
                } else {
                    stringBuilder.replace(i,n,stringBuilder.substring(i));
                }
            }
        }
        System.out.println(stringBuilder);
        sc.close();
    }
}