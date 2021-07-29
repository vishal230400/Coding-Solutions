package com.vishal.hackerrank.Equal;

import java.util.*;


public class Solution {
    public static long find_min_actions(int[] cookies) {
        Arrays.sort(cookies);
        long sum = Long.MAX_VALUE;
        for(int base = 0; base < 3; base++) {
            int current_sum = 0;
            for (int cookie : cookies) {
                int delta = cookie - cookies[0] + base;
                current_sum += delta / 5 + delta % 5 / 2 + delta % 5 % 2;
            }
            sum = Math.min(current_sum,sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0) {
            int m = sc.nextInt();
            int[] cookies = new int[m];
            for(int cookie_i=0; cookie_i < m; cookie_i++){
                cookies[cookie_i] = sc.nextInt();
            }
            System.out.println(find_min_actions(cookies));
        }
    }
}
