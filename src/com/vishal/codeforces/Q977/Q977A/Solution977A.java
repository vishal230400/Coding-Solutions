package com.vishal.codeforces.Q977.Q977A;

import java.util.*;

public class Solution977A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n      = sc.nextInt();
        int k=sc.nextInt();
        while (k!=0)
        {
            int i=n%10;
            if(i==0)
            {
                n/=10;
                k--;
            }
            if(k-i>=0) {
                n-=i;
                k=k-i;
            }
            else {
                n-=k;
                k=0;
            }
        }
        System.out.println(n);
    }
}