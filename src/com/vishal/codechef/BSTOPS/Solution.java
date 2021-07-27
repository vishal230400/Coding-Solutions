package com.vishal.codechef.BSTOPS;

import java.util.*;

class Node
{
    long data; long pos;
    Node left, right;
    public Node(long item, long posi)
    {
        data = item;
        pos = posi;
        left = right = null;
    }
}
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        Node root= null;
        for(int i =0; i<Q; i++)
        {
            String t = sc.next();
            long data = sc.nextLong();
            if(t.charAt(0)=='i')
            {
                root = insert(root,data,1);
            }
            else
            {
                root = delete(root,data,true);
            }
        }
    }

    public static Node insert(Node root,long data,long pos)
    {
        if(root==null)
        {
            System.out.println(pos);
            return (new Node(data,pos));
        }
        if(data<root.data)
            root.left= insert(root.left,data,(2*pos));
        else if(data> root.data)
            root.right = insert(root.right,data,(2*pos+1));
        return root;
    }

    public static Node delete(Node root, long data, boolean pr)
    {
        if(root == null)
            return root;
        if(data<root.data)
            root.left = delete(root.left,data,pr);
        else if(data> root.data)
            root.right = delete(root.right, data,pr );
        else
        {
            if(pr)
                System.out.println(root.pos);
            if(root.left==null && root.right==null)
                root = null;
            else if(root.left==null)
                root = root.right;
            else if(root.right==null)
                root = root.left;
            else
            {
                Node temp = minValue(root.right);
                root.data = temp.data;
                root.right = delete(root.right,temp.data,false);
            }
        }
        return root;
    }
    public static Node minValue(Node root)
    {
        Node current = root;
        while(current.left!=null)
        {
            current = current.left;
        }
        return current;
    }
}