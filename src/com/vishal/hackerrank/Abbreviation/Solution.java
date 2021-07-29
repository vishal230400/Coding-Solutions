package com.vishal.hackerrank.Abbreviation;

import java.io.*;
import java.util.stream.IntStream;

class Result {

    /*
     * Complete the 'abbreviation' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING a
     *  2. STRING b
     */

    public static String abbreviation(String s, String t) {
        // Write your code here
        int ssize = s.length()+1, tsize = t.length()+1;
        boolean [][]mat=new boolean[ssize][tsize];
        mat[0][0] = true;
        for(int i = 1; i < ssize; i++){
            if(Character.isLowerCase(s.charAt(i-1)))
            {
                mat[i][0] = true;
            }
            else break;

        }
        for(int i = 1; i < ssize; i++)
            for(int j = 1; j <tsize; j++){
                if(Character.isUpperCase(s.charAt(i-1))){
                    mat[i][j] = s.charAt(i - 1) == t.charAt(j - 1) && mat[i - 1][j - 1];
                }
                else{
                    if(Character.toUpperCase(s.charAt(i-1)) == t.charAt(j-1) && mat[i-1][j-1]) {mat[i][j] = true;
                    }
                    else mat[i][j] = mat[i-1][j];
                }
            }

        return mat[ssize-1][tsize-1]?"YES":"NO";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String a = bufferedReader.readLine();

                String b = bufferedReader.readLine();

                String result = Result.abbreviation(a, b);

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
