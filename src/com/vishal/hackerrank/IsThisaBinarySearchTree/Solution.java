package com.vishal.hackerrank.IsThisaBinarySearchTree;

import java.util.*;

class Node {
    int data;
    Node left;
    Node right;
}

public class Solution {
    boolean check(Node root, int min, int max) {
        if (root != null) {
            if (root.data >= max || root.data <= min) {
                return false;
            }
            else {
                return check(root.left, min, root.data) & check(root.right, root.data, max);
            }
        }
        else {
            return true;
        }
    }

    boolean checkBST(Node root) {
        return check(root, 0, Integer.MAX_VALUE);
    }

    public static void main(String [] args)
    {
        System.out.println("Internal Function trigger so no output check");
    }
}
