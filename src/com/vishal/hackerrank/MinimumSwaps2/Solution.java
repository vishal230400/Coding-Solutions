package com.vishal.hackerrank.MinimumSwaps2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Solution {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] a) {
        int swap=0;
        for(int i=0;i<a.length;i++){
            if(i+1!=a[i]){
                int t=i;
                while(a[t]!=i+1){
                    t++;
                }
                int temp=a[t];
                a[t]=a[i];
                a[i]=temp;
                swap++;
            }
        }
        return swap;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = scanner.nextInt();

        int[] arr = new int[n];


        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int res = minimumSwaps(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
