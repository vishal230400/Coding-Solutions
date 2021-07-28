package com.vishal.codechef.CHEFWARS;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t      = sc.nextInt();
        while(t-->0)
        {
            int h=sc.nextInt();
            int p=sc.nextInt();
            int p_won=0;
            while(p!=0)
            {
                h-=p;
                p/=2;
                if(h<=0)
                {
                    p_won=1;
                    break;
                }
            }
            System.out.println(p_won);
        }
        sc.close();
   }
}