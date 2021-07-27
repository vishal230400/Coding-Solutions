package com.vishal.codeforces.Q59.Q59A;

import java.util.*;

public class Solution59A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str      = sc.next();
        int count=0;
        for (char ch:str.toCharArray()
             ) {
            if(Character.isUpperCase(ch))
            {
                count++;
            }
            else {
                count--;
            }
        }

        if(count<=0)
        {
            System.out.println(str.toLowerCase(Locale.ROOT));
        }
        else {
            System.out.println(str.toUpperCase(Locale.ROOT));
        }
    }
}