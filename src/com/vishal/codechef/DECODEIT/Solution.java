package com.vishal.codechef.DECODEIT;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            String s = sc.next();
            decode(s);
        }
        sc.close();
    }

    public static void decode(String s){
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length()-4+1;i+=4){
            sb.append(decode4(s.substring(i,i+4)));
        }
        System.out.println(sb.toString());
    }

    public static String decode4(String s){
        int start = 0;
        int end = 15;

        for(int i=0;i<s.length();i++){
            String ch = s.charAt(i)+"";
            int side = Integer.parseInt(ch);
            if(side==0){
                end = (start+end)/2;
            }else{
                start = (start+end)/2+1;
            }
        }
        return (char)('a'+start)+"";
    }
}