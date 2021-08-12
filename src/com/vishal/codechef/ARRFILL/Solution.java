package com.vishal.codechef.ARRFILL;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Solution {

    static class Pair {
        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public int getX() {
            return this.x;
        }
        public int getY() {
            return this.y;
        }
    }

    static class Compare {
        static void compare(ArrayList<Pair> list) {
            list.sort(new Comparator<Pair>() {
                @Override
                public int compare(Pair p1, Pair p2) {
                    return p1.x - p2.x;
                }
            });
        }
    }
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    static long gcd(long a, long b) {
        if (a == 0) return b;
        return gcd(b % a, a);
    }

    public static void main (String[] args) throws java.lang.Exception {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while(t-- > 0) {
            long n = sc.nextLong();
            long m = sc.nextLong();
            long temp = 1, ans = 0, cnt = n;
            ArrayList<Pair> list = new ArrayList<>();
            for(long i = 1; i <= m; i++) {
                list.add(new Pair((int)sc.nextLong(), (int)sc.nextLong()));
            }
            Compare obj = new Compare();
            obj.compare(list);
            for(int i = (int)m-1; i > -1 && cnt > 0; i--) {
                long x = list.get(i).getX();
                long y = list.get(i).getY();
                temp = (temp * y) / gcd(temp, y);
                ans += (cnt - (n / temp)) * x;
                cnt = n / temp;
            }
            System.out.println(ans);
        }
    }
}