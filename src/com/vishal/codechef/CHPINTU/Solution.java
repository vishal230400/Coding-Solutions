package com.vishal.codechef.CHPINTU;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i =0;i<t;i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] a= new int[n];
            int[] b= new int[n];
            for(int j=0;j<n;j++){
                a[j] = sc.nextInt();
            }
            for(int j=0;j<n;j++){
                b[j] = sc.nextInt();
            }
            int sum = 10000;
            for(int j=1 ; j<=m;j++){
                boolean chk =false;
                int ans = 0;
                for(int k=0;k<n;k++){

                    if(a[k]==j){
                        ans+=b[k];
                        chk =true;
                    }
                }
                if(chk){
                    sum = Math.min(sum,ans);
                }
            }

            System.out.println(sum);
            sc.close();
        }
    }
}
