package com.vishal.codechef.CHEFINSQ;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt(), k = sc.nextInt();
            int []arr = new int[n];
            for(int i = 0 ; i <n; i++)
                arr[i] = sc.nextInt();
            Arrays.sort(arr);
            int inSub = 0, inArr = 0, max = arr[k-1];
            for(int i = 0 ; i < k; i++)
                if(arr[i] == max)inSub++;
            inArr = inSub;
            for(int i = k; i < n; i++)
                if(arr[i] == max)
                    inArr++;
            System.out.println(nCr(inArr,inSub));
        }
    }

    private static long nCr(int n, int r)
    {
        long res = 1;
        for(int i = 0 ; i < r; i++)
            res = res * (n-i)/(i+1);
        return res;
    }
}
