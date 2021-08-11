package com.vishal.codechef.OLYRANK;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int g1 = sc.nextInt();
            int s1 = sc.nextInt();
            int b1 = sc.nextInt();

            int g2 = sc.nextInt();
            int s2 = sc.nextInt();
            int b2 = sc.nextInt();

            if (g1 + s1 + b1 > g2 + s2 + b2) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }
        sc.close();
   }
}