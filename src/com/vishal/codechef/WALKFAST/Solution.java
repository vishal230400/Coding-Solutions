package com.vishal.codechef.WALKFAST;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int k = 0; k < t; k++) {

            int n = sc.nextInt();
            int aa = sc.nextInt();
            int bb = sc.nextInt();
            int cc = sc.nextInt();
            int dd = sc.nextInt();
            int p = sc.nextInt();
            int q = sc.nextInt();
            int y = sc.nextInt();


            int []arr = new int[n + 1];
            arr[0] = 0;
            for (int i = 0; i < n; i++) {

                arr[i + 1] = sc.nextInt();
            }

            int a = arr[aa];
            int b = arr[bb];
            int c = arr[cc];
            int d = arr[dd];

            int diff = Math.abs(a - b);

            int time = diff * p;

            int train = Math.abs(a - c);
            int train2 = Math.abs(d - b);
            int traintime = Math.abs(c - d);

            if (train * p > y) {
                System.out.println(time);
            } else {

                int time2 = y + traintime * q + train2 * p;

                int ans = Math.min(time, time2);

                System.out.println(ans);

            }
        }
        sc.close();
    }
}