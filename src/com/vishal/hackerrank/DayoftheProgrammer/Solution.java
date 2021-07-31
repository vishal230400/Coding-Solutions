package com.vishal.hackerrank.DayoftheProgrammer;

import java.io.*;

class Result {

    /*
     * Complete the 'dayOfProgrammer' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER year as parameter.
     */

    public static String dayOfProgrammer(int year) {
        // Write your code here
        int []month=new int[12];
        month[0]=31;
        month[2]=31;
        month[3]=30;
        month[4]=31;
        month[5]=30;
        month[6]=31;
        month[7]=31;
        month[8]=30;
        month[9]=31;
        month[10]=30;
        month[11]=31;
        if(year>1918)
        {
            if(year%400==0 || (year%4==0 && year%100!=0))
                month[1]=29;
            else {
                month[1]=28;
            }
        }

        if(year==1918)
        {
            month[1]=15;
        }

        if(year<1918)
        {
            if(year%4==0)
                month[1]=29;
            else {
                month[1]=28;
            }
        }
        int days,months,k=256;
        int i;
        for(i=0;i<12;i++)
        {
            if(month[i]<k)
            {
                k-=month[i];
            }
            else {
                break;
            }
        }
        days=k;
        months=i+1;

        char[] a=new char[10];
        a[0]= (char) (days/10+'0');
        a[1]= (char) (days%10+'0');
        a[2]='.';
        a[3]= (char) (months/10+'0');
        a[4]= (char) (months%10+'0');
        a[5]='.';
        a[6]= (char) (year/1000+'0');
        a[7]= (char) ((year%1000)/100+'0');
        a[8]= (char) ((year%100)/10+'0');
        a[9]= (char) (year%10+'0');
        return String.valueOf(a);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
