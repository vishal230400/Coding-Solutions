package com.vishal.hackerrank.MinimumAbsoluteDifferenceinanArray;

import java.io.*;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'minimumAbsoluteDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int minimumAbsoluteDifference(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);

        int minimumDifference = Integer.MAX_VALUE;

        for (int i = 0; i < arr.size() - 1; i++) {
            int difference = arr.get(i+1) - arr.get(i);

            if (difference < minimumDifference) {
                minimumDifference = difference;

                if (minimumDifference == 0) {
                    return 0;
                }
            }
        }

        return minimumDifference;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.minimumAbsoluteDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
