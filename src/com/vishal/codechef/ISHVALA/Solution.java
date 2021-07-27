package com.vishal.codechef.ISHVALA;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();

            int x=sc.nextInt();
            int y=sc.nextInt();
            int s=sc.nextInt();

            int ver = 0;
            int hor = 0;

            int tempVer = 0;
            for (int i = 1; i <= x; i++) {
                int xi = sc.nextInt();
                ver += (xi - tempVer - 1)/s;
                tempVer = xi;
            }
            ver += (n - tempVer)/s;

            int tempHor = 0;
            for (int i = 1; i <= y; i++) {
                int yi = sc.nextInt();
                hor += (yi - tempHor - 1)/s;
                tempHor = yi;
            }
            hor += (m - tempHor)/s;
            System.out.println(ver*hor);
        }
        sc.close();
    }

}