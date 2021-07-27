package com.vishal.codeforces.Q281.Q281A;

import java.util.*;

public class Solution281A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str     = sc.next();
        System.out.println( str.substring(0, 1).toUpperCase() + str.substring(1));
        sc.close();
    }
}