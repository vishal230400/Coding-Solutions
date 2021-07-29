package com.vishal.hackerrank.MaxArraySum;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Solution {

    // Complete the maxSubsetSum function below.
    static int maxSubsetSum(int[] arr) {
        int []dp=new int[arr.length];
        dp[0]=arr[0];
        if(arr.length>1)
            dp[1]=Math.max(arr[0],arr[1]);
        for(int i=2;i<arr.length;i++)
        {
            dp[i]=Math.max(arr[i]+dp[i-2],dp[i-1]);
            dp[i]=Math.max(dp[i-2],dp[i]);
            dp[i]=Math.max(arr[i],dp[i]);
        }
        return dp[arr.length-1];
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = scanner.nextInt();

        int[] arr = new int[n];


        for (int i = 0; i < n; i++) {
            int arrItem = scanner.nextInt();
            arr[i] = arrItem;
        }

        int res = maxSubsetSum(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
