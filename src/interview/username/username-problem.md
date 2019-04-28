- Create the username portion of a registration system that requires all usernames are unique.  If a new user requests a name that is already used, an integer should be added to the end of the username to make it unique.  The numbering begins with 1 and is incremented by 1 for each new instance per username. 

- As an example, if username requests were for [bob, alice, bob, alice, bob, alice], the system should assign usernames [bob, alice, bob1, alice1, bob2, alice2].

- Given a list of username requests in the order given, process all requests and return an array of the usernames as assigned by the function.

- Sample Input:
    4
    alex
    xylos
    alex
    alan
- Sample Output: 
    alex
    xylos
    alex1
    alan
