package com.vishal.codeforces.Q546.Q546A;

import java.util.*;

public class Solution546A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k      = sc.nextInt();
        int n      = sc.nextInt();
        int w      = sc.nextInt();

        int borrow=w*(w+1)*k/2-n;
        System.out.println(Math.max(borrow,0));
        sc.close();
    }
}