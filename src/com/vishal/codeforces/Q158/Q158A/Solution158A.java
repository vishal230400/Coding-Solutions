package com.vishal.codeforces.Q158.Q158A;

import java.util.*;

public class Solution158A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n      = sc.nextInt();
        int k      = sc.nextInt();
        ArrayList<Integer> arrayList=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            arrayList.add(Integer.parseInt(sc.next()));
        }
        arrayList.removeIf(integer -> (integer < arrayList.get(k-1))||integer==0);
        System.out.println(arrayList.size());
        sc.close();
    }
}