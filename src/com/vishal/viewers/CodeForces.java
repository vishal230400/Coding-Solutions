package com.vishal.viewers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class CodeForces {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Scanner sc = new Scanner(System.in);
        String platform="codeforces";
        System.out.println("Enter the " + platform + " Question Number:");
        String str = sc.next();
        BufferedReader br = new BufferedReader(new FileReader("./src/com/vishal/" + platform + "/Q" + str.substring(0, str.length() - 1) + "/Q" + str + "/README.md"));
        String buffer;
        while ((buffer = br.readLine()) != null) {
            System.out.println(buffer);
        }
        br.close();

        br = new BufferedReader(new FileReader("./src/com/vishal/" + platform + "/Q" + str.substring(0, str.length() - 1) + "/Q" + str + "/Solution" + str + ".java"));
        while ((buffer = br.readLine()) != null) {
            System.out.println(buffer);
        }
        br.close();

        System.out.println("Enter the inputs for " + str);
        String className = "com.vishal." + platform + ".Q" + str.substring(0, str.length() - 1) + ".Q" + str + ".Solution" + str;
        Class.forName(className).getMethod("main", String[].class).invoke(null, (Object) null);

    }
}
