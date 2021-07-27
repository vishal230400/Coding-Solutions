package com.vishal.codechef.HS08TEST;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        if(x %5!=0)
        {
            System.out.println(y);
        }
        else if(y-(x+0.50)<0)
        {
            System.out.println(y);
        }
        else{
            System.out.println(y-(x+0.50));
        }
        sc.close();
    }
}