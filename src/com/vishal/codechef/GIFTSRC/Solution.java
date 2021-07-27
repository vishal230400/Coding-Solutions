package com.vishal.codechef.GIFTSRC;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String st = sc.next();
            char  tmp;
            boolean lastChX = true , lastChY = true;
            int posX = 0, posY = 0;
            for(int i  = 0; i < n; i++)
            {
                tmp = st.charAt(i);
                switch (tmp) {
                    case 'L':
                        if (lastChY) {
                            posX -= 1;
                            lastChX = true;
                            lastChY = false;
                        }
                        break;
                    case 'R':
                        if (lastChY) {
                            posX += 1;
                            lastChX = true;
                            lastChY = false;
                        }
                        break;
                    case 'D':
                        if (lastChX) {
                            posY -= 1;
                            lastChX = false;
                            lastChY = true;
                        }
                        break;
                    case 'U':
                        if (lastChX) {
                            posY += 1;
                            lastChX = false;
                            lastChY = true;
                        }
                        break;
                }
            }
            System.out.println(posX+" "+posY);

            sc.close();
        }
    }
}