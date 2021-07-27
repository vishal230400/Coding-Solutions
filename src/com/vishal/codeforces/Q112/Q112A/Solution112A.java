package com.vishal.codeforces.Q112.Q112A;

import java.util.*;

public class Solution112A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a      = sc.next();
        String b=sc.next();
        int result=a.compareToIgnoreCase(b);
        if(result<0)
            result=-1;
        if (result>0)
            result=1;
        System.out.println(result);
    }
}