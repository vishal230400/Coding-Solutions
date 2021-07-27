package com.vishal.filecreators;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CodeChef {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int i=0;
        String platform= "codechef";
        System.out.println("Enter the question number");
        String str= sc.next();
        File file=new File("./src/com/vishal/"+platform+"/"+str);
        String javaFileName = "./src/com/vishal/"+platform+"/"+str+ "/Solution.java";
        File javaFile=new File(javaFileName);
        String readMeName = "./src/com/vishal/"+platform+"/"+str+ "/README.md";
        File readMeFile=new File(readMeName);
        boolean dir=file.mkdirs();
        boolean javaCreated=javaFile.createNewFile();
        boolean readMeCreated=readMeFile.createNewFile();
        System.out.println("Directory created:"+dir);
        System.out.println("Solution File created:"+javaCreated);
        System.out.println("Readme File created:"+readMeCreated);
        if(javaCreated)
        {
            FileWriter myWriter = new FileWriter(javaFileName);
            myWriter.write("package com.vishal."+platform+"."+str+";\n\n" +
                    "import java.util.*;\n" +
                    "\n" +
                    "public class Solution"+" {\n" +
                    "\n" +
                    "    public static void main(String[] args) {\n" +
                    "        Scanner sc = new Scanner(System.in);\n" +
                    "        int n      = sc.nextInt();\n" +
                    "        sc.close();\n" +
                    "   }\n" +
                    "}");
            myWriter.close();
        }
        System.out.println("Enter the question data, Enter # in new line at the last");
        if(readMeCreated) {
            StringBuilder s = new StringBuilder();
            String nextLine;
            s.append("# Question Code : ").append(str).append("\n");
            nextLine = sc.nextLine();
            do {
                s.append(nextLine).append('\n');
                nextLine = sc.nextLine();
            } while (!nextLine.equals("#"));

            FileWriter myWriter = new FileWriter(readMeFile);
            myWriter.write(String.valueOf(s));
            myWriter.close();
        }
        sc.close();
    }
}
