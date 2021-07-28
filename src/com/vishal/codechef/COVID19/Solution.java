package com.vishal.codechef.COVID19;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt(),count,min=10,max=1;
            int []a=new int[n];
            count=1;
            for(int j=0;j<n;j++)
            {
                a[j]=sc.nextInt();
            }
            for(int k=0;k<n-1;k++)
            {
                if((a[k+1]-a[k])<=2)
                    count++;
                else
                {
                    if(min>count)
                        min=count;
                    if(max<count)
                        max=count;
                    count=1;
                }
            }
            if (min>count)
                min=count;
            if(max<count)
                max=count;
            System.out.println(min + " " + max);
        }
    }
}