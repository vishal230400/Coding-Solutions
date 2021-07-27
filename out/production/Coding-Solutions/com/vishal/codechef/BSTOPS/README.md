# Question Code : BSTOPS

Write a program to perform insertions and deletions on a Binary Search Tree.

Perform Q operations of the form:

i x : Insert x in the BST.
d x : Delete x from the BST.

Each element is assigned a value based on its position when it was inserted into the BST. The position of an element is calculated as follows:

The position of the root node is 1.
If the position of a node is p, the positions of its left and right children are (2∗p) and (2∗p+1), respectively.
Note that the positions of the elements may change after some operations, but their values don't.

For each of the Q queries, output the value that is associated with that element in the BST. It is guaranteed that there will be no duplicates in the BST, and a delete operation on an element shall only be called if it's present in the BST.
