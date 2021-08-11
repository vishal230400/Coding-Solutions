package com.vishal.codechef.SPCTRIPS;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t      = sc.nextInt();
        while (t-->0)
        {
            int n      = sc.nextInt();
            int ans=0;
            for(int c=1;c<=n;c++)
            {
                for(int b=c;b<=n;b+=c)
                {
                    for(int a=c;a<=n;a+=b)
                    {
                        if(a%b==c)
                        {
                            ans++;
                        }
                    }
                }
            }
            System.out.println(ans);
        }
        sc.close();
   }
}