package com.vishal.hackerrank.TwoStrings;

import java.io.*;
import java.util.stream.IntStream;

class Result {

    /*
     * Complete the 'twoStrings' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s1
     *  2. STRING s2
     */

    public static String twoStrings(String s1, String s2) {
        // Write your code here
        int []a=new int[26];
        int []b=new int[26];

        for(int i=0;i<26;i++)
            a[i]=b[i]=0;

        for(int i=0;i<s1.length();i++)
            a[s1.charAt(i)-'a']++;

        for(int i=0;i<s2.length();i++)
            b[s2.charAt(i)-'a']++;

        for(int i=0;i<26;i++)
        {
            if(b[i]!=0 && a[i]!=0)
            {
                return "YES";
            }
        }

        return "NO";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s1 = bufferedReader.readLine();

                String s2 = bufferedReader.readLine();

                String result = Result.twoStrings(s1, s2);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
