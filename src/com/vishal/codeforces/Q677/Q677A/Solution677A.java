package com.vishal.codeforces.Q677.Q677A;

import java.util.*;

public class Solution677A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n      = sc.nextInt();
        int k      = sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            count++;
            if((a/k==1 && a%k!=0)||a/k>1)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}