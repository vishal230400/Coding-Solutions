package com.vishal.codechef.COVID19;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt(),cnt,min=10,max=1;
            int []a=new int[n];
            cnt=1;
            for(int j=0;j<n;j++)
            {
                a[j]=sc.nextInt();
            }
            for(int k=0;k<n-1;k++)
            {
                if((a[k+1]-a[k])<=2)
                    cnt++;
                else
                {
                    if(min>cnt)
                        min=cnt;
                    if(max<cnt)
                        max=cnt;
                    cnt=1;
                }
            }
            if (min>cnt)
                min=cnt;
            if(max<cnt)
                max=cnt;
            System.out.println(min + " " + max);
        }
    }
}