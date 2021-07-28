package com.vishal.codechef.FAIRELCT;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n--!=0){
            int size1=sc.nextInt();
            int size2=sc.nextInt();
            int[] arr1=new int[size1];
            int[] arr2=new int[size2];
            int sum1=0,sum2=0;
            for(int i=0;i<size1;i++){
                arr1[i]=sc.nextInt();
                sum1+=arr1[i];
            }
            for(int i=0;i<size2;i++){
                arr2[i]=sc.nextInt();
                sum2+=arr2[i];
            }
            if(sum1>sum2){
                System.out.println(0);
                continue;
            }
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            int count=0;
            int j=size2-1;
            for(int i=0;i<size1;i++){
                sum1=sum1-arr1[i];
                sum2=sum2-arr2[j];
                sum1=sum1+arr2[j];
                sum2=sum2+arr1[i];
                count++;
                j--;
                if(sum1>sum2 || j<0){
                    break;
                }
            }
            if(sum1>sum2){
                System.out.println(count);
            }else{
                System.out.println(-1);
            }
        }
        sc.close();
    }
}