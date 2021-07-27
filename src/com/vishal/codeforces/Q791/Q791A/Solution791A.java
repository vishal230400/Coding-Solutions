package com.vishal.codeforces.Q791.Q791A;

import java.util.*;

public class Solution791A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a      = sc.nextInt();
        int b      = sc.nextInt();
        int i=1;
        while(a*3<=b*2)
        {
            a*=3;
            b*=2;
            i++;
        }
        System.out.println(i);
        sc.close();
    }
}