package com.vishal.codeforces.Q734.Q734A;

import java.util.*;

public class Solution734A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n      = sc.nextInt();
        String str=sc.next();
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(str.charAt(i)=='A'){
                count++;
            }else {
                count--;
            }
        }
        if(count==0)
        {
            System.out.println("Friendship");
        }else if(count>0){
            System.out.println("Anton");
        }else {
            System.out.println("Danik");
        }
        sc.close();
    }
}