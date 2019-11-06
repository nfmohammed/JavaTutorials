Question:
From an array, find an index in which sum of left elements and sum of right elements are same

example: A[] = { -7, 1, 5, 2, -4, 3, 0}
output = 3
A[0] + A[1] + A[2] = A[4] + A[5] + A[6]

BruteForceSolution:
- O(n^2)
- Implement 2 for loops.
    - Loop1: iterates over all elements of array
    - Loop2 Iterates over leftElements and RightElements to calculate their sum and compare.

- Preferred Solution:
- O(n)
- Iterate over the array to calculate sum of array as `Sum`.
- Then Iterate over the array second time, for each iteration, do the following:
    - Calculate LeftSum: Sum of all elements left of current index.
    - Calculate NewSum = Sum - LeftSum. If NewSum is same as LeftSum then return the index.


