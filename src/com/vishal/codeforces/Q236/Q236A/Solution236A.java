package com.vishal.codeforces.Q236.Q236A;

import java.util.*;

public class Solution236A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str      = sc.next();
        ArrayList<String> strList = new ArrayList<>(
                Arrays.asList(str.split("")));
        Set<String> set = new HashSet<>(strList);
        if(set.size()%2==0)
        {
            System.out.println("CHAT WITH HER!");
        }
        else {
            System.out.println("IGNORE HIM!");
        }
    }
}