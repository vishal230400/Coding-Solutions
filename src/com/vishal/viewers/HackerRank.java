package com.vishal.viewers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class HackerRank {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Scanner sc = new Scanner(System.in);
        String platform="hackerrank";
        System.out.println("Enter the " + platform + " Question Name:");
        String str= sc.nextLine().replaceAll("[^A-Za-z0-9 -]","");
        BufferedReader br = new BufferedReader(new FileReader("./src/com/vishal/" + platform + "/" +str + "/README.md"));
        String buffer;
        while ((buffer = br.readLine()) != null) {
            System.out.println(buffer);
        }
        br.close();

        br = new BufferedReader(new FileReader("./src/com/vishal/" + platform + "/" +str + "/Solution.java"));
        while ((buffer = br.readLine()) != null) {
            System.out.println(buffer);
        }
        br.close();

        System.out.println("Enter the inputs for " + str);
        String className = "com.vishal." + platform  + "."+str+ ".Solution";
        Class.forName(className).getMethod("main", String[].class).invoke(null, (Object) null);
        sc.close();
    }
}
