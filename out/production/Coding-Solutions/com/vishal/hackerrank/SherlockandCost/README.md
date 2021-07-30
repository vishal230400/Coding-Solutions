# Question Name : SherlockandCost

In this challenge, you will be given an array B and must determine an array A. There is a special rule: For all i, A[i]<=B[i] . That is, A[i] can be any number you choose such that 1<=A[i]<=B[i]. Your task is to select a series of  given A[i] such B[i] that the sum of the absolute difference of consecutive pairs of A is maximized. This will be the array's cost, and will be represented by the variable S below.

The equation can be written:

S= summation i=2 to N (abs(A[i]-A[i-1]))