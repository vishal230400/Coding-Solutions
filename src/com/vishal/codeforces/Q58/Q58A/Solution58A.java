package com.vishal.codeforces.Q58.Q58A;

import java.util.*;

public class Solution58A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str      = sc.next();
        String a="hello";
        int i=0;
        for (char ch:str.toCharArray()
             ) {
            if(ch==a.charAt(i))
            {
                i++;
            }
            if(i==a.length())
            {
                break;
            }
        }
        if(i==a.length())
        {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
        sc.close();
    }
}