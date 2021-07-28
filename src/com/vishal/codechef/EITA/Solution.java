package com.vishal.codechef.EITA;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int d=sc.nextInt(),x= sc.nextInt(), y=sc.nextInt(),z=sc.nextInt();
            System.out.println(Math.max(7*x,d*(y-z)+7*z));
        }
        sc.close();
   }
}