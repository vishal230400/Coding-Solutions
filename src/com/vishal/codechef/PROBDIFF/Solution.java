package com.vishal.codechef.PROBDIFF;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t     = sc.nextInt();
            while (t-->0)
            {
                int []count=new int[10];
                count[sc.nextInt()-1]++;
                count[sc.nextInt()-1]++;
                count[sc.nextInt()-1]++;
                count[sc.nextInt()-1]++;
                count = Arrays.stream(count).filter(x -> x > 0).toArray();
                int n=count.length;
                int ans=0;
                if(n==4||n==3){
                    ans=2;
                }else if(n==2){
                    if(count[0]!=2) {
                        ans=1;
                    }else {
                        ans=2;
                    }
                }

                System.out.println(ans);
            }
            sc.close();
   }
}