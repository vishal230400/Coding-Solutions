package com.vishal.codeforces.Q1.Q1A;

import java.util.*;

public class Solution1A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n      = sc.nextInt();
        long m     = sc.nextInt();
        long a      = sc.nextInt();
        long n_a = 0,m_a=0;
        if(n%a>0)
        {
            n_a=1;
        }
        if (m%a>0)
        {
            m_a=1;
        }
        System.out.println(((n/a)+n_a)*((m/a)+m_a));

        sc.close();
    }
}