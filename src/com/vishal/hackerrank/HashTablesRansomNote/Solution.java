package com.vishal.hackerrank.HashTablesRansomNote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'checkMagazine' function below.
     *
     * The function accepts following parameters:
     *  1. STRING_ARRAY magazine
     *  2. STRING_ARRAY note
     */

    public static void checkMagazine(List<String> magazine, List<String> note) {
        // Write your code here
        Collections.sort(magazine);
        Collections.sort(note);
        int j=0;
        int k=0;

        for(int i=0;i<note.size();i++)
        {
            while(j<magazine.size())
            {
                if(note.get(i).equals(magazine.get(j)))
                {
                    j++;
                    break;
                }
                j++;
            }
            if(j==magazine.size() && !note.get(i).equals(magazine.get(j-1)) && k==0)
            {
                System.out.println("No");
                k=1;
                break;
            }
            if(j==magazine.size() && j>=2)
                if(note.get(i).equals(magazine.get(j-1)) && !magazine.get(j-2).equals(magazine.get(j-1)) && note.get(i-1).equals(magazine.get(j-1)))
                {
                    System.out.println("No");
                    k=1;
                    break;
                }
        }
        if(k==0)
            System.out.println("Yes");
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(firstMultipleInput[0]);

        int n = Integer.parseInt(firstMultipleInput[1]);

        List<String> magazine = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .collect(toList());

        List<String> note = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .collect(toList());

        Result.checkMagazine(magazine, note);

        bufferedReader.close();
    }
}
