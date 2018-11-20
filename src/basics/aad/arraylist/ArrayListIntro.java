package basics.aad.arraylist;

import java.util.List;
import java.util.ArrayList;
import java.lang.reflect.Field;

class ArrayListIntro {
    public static void main(String[] args) {
        
        //List cannot be created with primitive types as primitive tyeps are stored inside stack.
        //List<int> apples = new ArrayList<int>(); //uncomment to see error
        
        //List can be created with objects in heap
        //Empty Arraylist will have a capacity of 10
        //As the items are added to list, it's capacity grows accordingly.
        //Note: There is a difference between Capacity and Size
        List<String> names = new ArrayList<String>(); 
        System.out.println(names.size()); //size is 0

        List<Integer> states = new ArrayList<Integer>(50);
        System.out.println(states.size());//Size is 0 but capacity is 50

        //nulls can be stored in arraylist
        List<String> cities = new ArrayList<String>(3);
        cities.add(null);
        cities.add(null);
        cities.add(null);
        System.out.println(cities.size()); //output = 3
    }
}