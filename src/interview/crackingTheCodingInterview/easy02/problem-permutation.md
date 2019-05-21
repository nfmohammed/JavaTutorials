### Question

* Given two strings, write a method to decide if one is a permutation of the other.

#### Tips
- Should ask interviewer if String is ASCII or Unicode (We assume ASCII)
- Algorithm: Count the different characters using an array (as shown below) or a HashMap. For each String, we can save the count of each character in an array, then compare these 2 arrays. However, instead of using 2 arrays, we can do it with 1, as shown below

