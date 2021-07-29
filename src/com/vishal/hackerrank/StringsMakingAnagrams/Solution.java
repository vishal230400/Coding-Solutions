package com.vishal.hackerrank.StringsMakingAnagrams;

import java.io.*;

class Result {

    /*
     * Complete the 'makeAnagram' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING a
     *  2. STRING b
     */

    public static int makeAnagram(String a, String b) {
        // Write your code here
        int []a1=new int[26];
        int []b1=new int[26];
        for(int i=0;i<a.length();i++)
        {
            a1[a.charAt(i)-'a']++;
        }
        for(int i=0;i<b.length();i++)
        {
            b1[b.charAt(i)-'a']++;
        }
        int count=0;
        for(int i=0;i<26;i++)
        {
            if(a1[i]!=b1[i])
            {
                count+=Math.abs(a1[i]-b1[i]);
            }
        }

        return count;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String a = bufferedReader.readLine();

        String b = bufferedReader.readLine();

        int res = Result.makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}