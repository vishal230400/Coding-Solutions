package com.vishal.codeforces.Q271.Q271A;

import java.util.*;

public class Solution271A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n      = sc.nextInt();
        while (true)
        {
            n++;
            int []hashCount={ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
            String str=Integer.toString(n);
            for(int i=0;i<str.length();i++)
            {
                hashCount[str.charAt(i)-'0']++;
            }
            boolean number=true;
            for(int i=0;i<10;i++)
            {
                if(hashCount[i]>1)
                {
                    number=false;
                    break;
                }
            }
            if(number)
            {
                break;
            }
        }
        System.out.println(n);
    }
}