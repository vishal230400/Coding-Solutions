package com.vishal;

import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Platform");
        String platform=sc.next();
        if(platform.equals("codeforces"))
        {
            String className = "com.vishal.viewers.CodeForces";
            Class.forName(className).getMethod("main", String[].class).invoke(null, (Object) null);
        }
        sc.close();
    }
}
