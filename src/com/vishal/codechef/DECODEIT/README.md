# Question Code : DECODEIT

An encoder encodes the first 16 lowercase English letters using 4 bits each. The first bit (from the left) of the code is 0 if the letter lies among the first 8 letters, else it is 1, signifying that it lies among the last 8 letters. The second bit of the code is 0 if the letter lies among the first 4 letters of those 8 letters found in the previous step, else it's 1, signifying that it lies among the last 4 letters of those 8 letters. Similarly, the third and the fourth bit each signify the half in which the letter lies.

For example, the letter j would be encoded as :

Among (a,b,c,d,e,f,g,h | i,j,k,l,m,n,o,p), j appears in the second half. So the first bit of its encoding is 1.
Now, among (i,j,k,l | m,n,o,p), j appears in the first half. So the second bit of its encoding is 0.
Now, among (i,j | k,l), j appears in the first half. So the third bit of its encoding is 0.
Now, among (i | j), j appears in the second half. So the fourth and last bit of its encoding is 1.
So j's encoding is 1001,

Given a binary encoded string S, of length at most 105, decode the string. That is, the first 4 bits are the encoding of the first letter of the secret message, the next 4 bits encode the second letter, and so on. It is guaranteed that the string's length is a multiple of 4.
