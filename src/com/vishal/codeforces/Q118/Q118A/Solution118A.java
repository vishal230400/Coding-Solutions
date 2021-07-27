package com.vishal.codeforces.Q118.Q118A;

import java.util.*;

public class Solution118A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.next();
        System.out.println(str.toLowerCase(Locale.ROOT).replaceAll("[aeiouy]","").replaceAll("(?i)([(?![aeiouy])[a-z]])",".$1"));
        sc.close();
    }
}