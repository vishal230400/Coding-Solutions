package com.vishal.codechef.XXOORR;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n, k;
            n = sc.nextInt();
            k = sc.nextInt();
            int []arr = new int[n];
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                arr[i] = x;
            }
            int []sum = new int[33];
            for (int i = 0; i < n; i++) {
                int x = arr[i];
                int j = 32;
                while (x > 0) {
                    sum[j] += x % 2;
                    j--;
                    x = x / 2;
                }
            }
            int c = 0;
            for (int i = 0; i < 33; i++) {
                if (sum[i] % k == 0) {
                    c += sum[i] / k;
                } else {
                    c += sum[i] / k;
                    c += 1;
                }
            }
            System.out.println(c);
        }
        sc.close();
   }
}