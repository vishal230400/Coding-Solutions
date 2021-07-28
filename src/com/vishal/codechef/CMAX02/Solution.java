package com.vishal.codechef.CMAX02;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int div=n-1;
            ArrayList<Integer> rem = new ArrayList<>();
            int temp;
            while(div!=0)
            {
                temp=div%3;
                div=div/3;
                if(temp==0) {div--;}
                rem.add(temp);
            }
            rem.add(0);
            StringBuilder rem0=new StringBuilder();
            StringBuilder rem1=new StringBuilder();
            for(int i=0;i<rem.size();i++)
            {
                if(rem.get(i).equals(0))
                    rem0.append(i+" ");
                else if(rem.get(i).equals(1))
                {
                    rem1.append(i+" ");
                }
            }
            System.out.println(rem0);
            System.out.println(rem1);
        }
        sc.close();
   }
}