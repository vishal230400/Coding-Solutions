package com.vishal.codeforces.Q41.Q41A;

import java.util.*;

public class Solution41A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a     = sc.next();
        String b     = sc.next();
        StringBuilder a_rev=new StringBuilder(a).reverse();
        if(a_rev.toString().equals(b))
        {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}