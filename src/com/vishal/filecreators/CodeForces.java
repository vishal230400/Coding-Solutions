package com.vishal.filecreators;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class CodeForces {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int i=0;
        String platform= "codeforces";
        System.out.println("Enter the question number");
        String str= sc.next();
        File file=new File("./src/com/vishal/"+platform+"/Q"+str.substring(0,str.length()-1)+"/Q"+str);
        String javaFileName = "./src/com/vishal/"+platform+"/Q" + str.substring(0, str.length() - 1) + "/Q" + str + "/Solution" + str + ".java";
        File javaFile=new File(javaFileName);
        String readMeName = "./src/com/vishal/"+platform+"/Q" + str.substring(0, str.length() - 1) + "/Q" + str + "/README.md";
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
            myWriter.write("package com.vishal."+platform+".Q"+str.substring(0,str.length()-1)+".Q"+str+";\n\n" +
                    "import java.util.*;\n" +
                    "\n" +
                    "public class Solution"+str+" {\n" +
                    "\n" +
                    "    public static void main(String[] args) {\n" +
                    "        Scanner sc = new Scanner(System.in);\n" +
                    "        int n      = sc.nextInt();\n" +
                    "        sc.close();" +
                    "    }\n" +
                    "}");
            myWriter.close();
        }
        System.out.println("Enter the question data, Enter # in new line at the last");
        if(readMeCreated) {
            StringBuilder s = new StringBuilder();
            String nextLine;

            nextLine = sc.nextLine();
            do {
                if (!nextLine.equals("#")) {
                    if (i == 1) {
                        s.append("#" + " ").append(nextLine).append("\n");
                    } else if (i ==2) {
                        s.append("###" + " ").append(nextLine.substring(0,1).toUpperCase(Locale.ROOT)).append(nextLine, 1, 19).append(":").append(nextLine.substring(19)).append("\n");
                    } else if(i==3)
                    {
                        s.append("###" + " ").append(nextLine.substring(0,1).toUpperCase(Locale.ROOT)).append(nextLine, 1, 21).append(":").append(nextLine.substring(21)).append("\n");
                    }
                    else if(i==4)
                    {
                        s.append("###" + " ").append(nextLine.substring(0,1).toUpperCase(Locale.ROOT)).append(nextLine, 1, 5).append(":").append(nextLine.substring(5)).append("\n");
                    }
                    else if(i==5)
                    {
                        s.append("###" + " ").append(nextLine.substring(0,1).toUpperCase(Locale.ROOT)).append(nextLine, 1, 6).append(":").append(nextLine.substring(6)).append("\n");
                    }
                    else if(i!=0) {
                        s.append(nextLine);
                    }
                    i++;
                    if(i!=0)s.append('\n');
                }
                nextLine = sc.nextLine();
            } while (!nextLine.equals("#"));

            FileWriter myWriter = new FileWriter(readMeFile);
            myWriter.write(String.valueOf(s));
            myWriter.close();
        }
        sc.close();
    }
}
