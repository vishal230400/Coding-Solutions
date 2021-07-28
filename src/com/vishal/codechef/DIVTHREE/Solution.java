package com.vishal.codechef.DIVTHREE;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt(),k= sc.nextInt(), d= sc.nextInt();
            int a;
            int sum=0;
            for(int i=0;i<n;i++)
            {
                a=sc.nextInt();
                sum+=a;
            }
            int days=sum/k;
            if(days>=d)
                System.out.println(d);
            else System.out.println(days);
        }
        sc.close();
   }
}