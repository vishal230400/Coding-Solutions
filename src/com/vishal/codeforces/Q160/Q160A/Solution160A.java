package com.vishal.codeforces.Q160.Q160A;

import java.util.*;

public class Solution160A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n      = sc.nextInt();
        Integer [] array=new Integer[n];
        int forwardSum=0,endSum=0,i;
        for(i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
            endSum+=array[i];
        }
        Arrays.sort(array,Collections.reverseOrder());
        for (i=0;i<n;i++) {
            forwardSum += array[i];
            endSum -= array[i];
            if (forwardSum > endSum)
            {
                break;
            }
        }
        System.out.println(i+1);
    }
}