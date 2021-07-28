package com.vishal.hackerrank.MiniMaxSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        int i, key, j,n=arr.size();
        for (i = 1; i < n; i++)
        {
            key = arr.get(i);
            j = i - 1;

            while (j >= 0 && arr.get(j) > key)
            {
                arr.set(j+1,arr.get(j));
                j = j - 1;
            }
            arr.set(j+1, key);
        }

        long maxsum=0,minsum=0;

        for(i=0;i<4;i++)
        {
            minsum+=arr.get(i);
            maxsum+=arr.get(n-1-i);
        }
        
        System.out.println(minsum+" "+maxsum);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
