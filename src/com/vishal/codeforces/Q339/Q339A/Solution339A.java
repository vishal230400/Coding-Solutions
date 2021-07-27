package com.vishal.codeforces.Q339.Q339A;

import java.util.*;

import static java.lang.String.valueOf;

public class Solution339A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str      = sc.next();
        char[]a=str.replace("+","").toCharArray();
        Arrays.sort(a);
        String b=valueOf(a).replaceAll("(?i)([0-9])","$1+");
        System.out.println(b.substring(0,b.length()-1));
    }
}