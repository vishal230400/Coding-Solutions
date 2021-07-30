package com.vishal.hackerrank.SherlockandCost;

import java.io.*;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'cost' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY B as parameter.
     */

    public static int cost(List<Integer> B) {
        // Write your code here
        int n=B.size();
        int [][]dp=new int[n][2];
        int i=1;
        dp[0][0]=0;
        dp[0][1]=0;
        while (i<n)
        {
            dp[i][0]=Math.max(dp[i-1][0], dp[i-1][1]+B.get(i-1)-1);
            dp[i][1]=Math.max(dp[i-1][0]+B.get(i)-1, dp[i-1][1]+Math.abs(B.get(i)-B.get(i-1)));
            i++;
        }
        return Math.max(dp[n-1][0],dp[n-1][1]);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> B = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList());

                int result = Result.cost(B);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
