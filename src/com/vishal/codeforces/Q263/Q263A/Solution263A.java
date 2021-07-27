package com.vishal.codeforces.Q263.Q263A;

import java.util.*;

public class Solution263A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][]arr=new int[5][5];
        int i_index=-1,j_index=-1;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                arr[i][j]=sc.nextInt();
                if(arr[i][j]==1)
                {
                    i_index=i;
                    j_index=j;
                }
            }
        }
        System.out.println(Math.abs(i_index-2)+Math.abs(j_index-2));
    }
}