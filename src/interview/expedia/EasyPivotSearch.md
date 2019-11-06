Problem: PivotSearch

Question:
Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand

i.e. 0 1 2 3 4 5 6 7 might become 4 5 6 7 0 1 2

You are given a target value to search, return it's index

BruteForceSolution:
O(n) linear search

Preferred Solution:
O(log n) binary search variant.

Detailed Solution:
- Note that other arrays could be rotated other way like 5 6 7 0 1 2 3 4
- Figure out what's the pivot index. The pivot index is also the minimum value and the value left of it will be max.
- Now you have 2 sorted arrays at pivot point.
- If the target value is between first-value and max-value then do binary search in left array otherwise do binary search in right array.