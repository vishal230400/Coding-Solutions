package com.vishal.codechef.CHFINVNT;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t      = sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            int p=sc.nextInt();
            int k=sc.nextInt();
            int days= ((n / k) * (p % k)) + Math.min(n % k, p%k) + (p / k) + 1;
            System.out.println(days);
        }
        sc.close();
   }
}