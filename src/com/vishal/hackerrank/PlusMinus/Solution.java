package com.vishal.hackerrank.PlusMinus;

import java.util.*;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        double positive=0.0,negative=0.0,zero=0.0;
        double n=arr.size()*1.0;

        for (Integer integer : arr) {
            if (integer > 0)
                positive += 1.0;
            else if (integer < 0)
                negative += 1.0;
            else zero += 1.0;
        }

        positive/=n;
        negative/=n;
        zero/=n;
        System.out.println(positive);
        System.out.println(negative);
        System.out.println(zero);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}