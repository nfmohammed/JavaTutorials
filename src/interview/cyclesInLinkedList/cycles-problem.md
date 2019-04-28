
- https://www.youtube.com/watch?v=MFOAbpfrJ8g&list=PLI1t_8YX-Apv-UiRlnZwqqrRT8D1RhriX&index=4

- Detect a cycle in a linked list. Note that the head pointer may be null if the list is empty. 

- Solution: 
    1: If the node is modifiable then each node can be marked as visited. This is simple solution.
    2: If the node is not-modifiable then we can have 2 pointers that iterate through the linked-list at different speeds. If there is a cycle, then the two pointers will collide at some point. Different speed is achieved by moving one pointer by 1 step and other pointer by 2 steps. 