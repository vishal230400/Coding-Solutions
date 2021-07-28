package com.vishal.codechef.RELATIVE;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0)
        {
            int g= sc.nextInt(), c= sc.nextInt();
            long h=(long)c*c;
            h/=(long)2*g;
            System.out.println(h);
        }
        sc.close();
   }
}