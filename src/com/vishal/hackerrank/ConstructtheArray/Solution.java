package com.vishal.hackerrank.ConstructtheArray;

import java.io.*;

class Result {

    /*
     * Complete the 'countArray' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER x
     */

    public static long countArray(int n, int k, int x) {
        // Return the number of ways to fill in the array.
        long []a=new long[n];
        long []b=new long[n];
        if(x==1)
        {
            a[0]=1;
            b[0]=0;
        }
        else{
            a[0]=0;
            b[0]=1;
        }

        for(int i=1;i<n;i++)
        {
            a[i]=b[i-1]%((long)Math.pow(10,9)+7);
            b[i]=(b[i-1]*(k-2)+a[i-1]*(k-1))%((long)Math.pow(10,9)+7);
        }

        return a[n-1];
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        int x = Integer.parseInt(firstMultipleInput[2]);

        long answer = Result.countArray(n, k, x);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
