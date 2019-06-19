- Describe how you could use a single array to implement three stacks.

Solution:
Indexes: 0, 1, 2 can store stack values of stack1, stack2, stack3
Indexes: 3, 4, 5 ...
Indexes: 6, 7, 8 ...

From above, we can deduce the general indexes of three stacks as follows:
stack1 -> number%3
stack2 -> number%3 + 1
stack3 -> number%3 + 2

We will also need pointers for three stack to determine their current index.

 
