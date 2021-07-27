package com.vishal.codeforces.Q282.Q282A;

import java.util.*;

public class Solution282A {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n      = sc.nextInt();
        int result=0;
        for(int i=0;i<n;i++)
        {
            String exp=sc.next();
            if(exp.charAt(0)=='+')
            {
                ++result;
            }
            if (exp.charAt(0)=='-')
            {
                --result;
            }
            if (exp.charAt(2)=='+')
            {
                result++;
            }
            if (exp.charAt(2)=='-')
            {
                result--;
            }
        }
        System.out.println(result);
    }
}