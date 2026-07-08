import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/*
======================== HASHSET (Java) ========================

Definition:
- HashSet is a collection that stores UNIQUE elements.
- It is part of the Java Collections Framework.
- It is implemented using a HashMap internally.

Properties:
- Does NOT allow duplicate values.
- Does NOT maintain insertion order.
- Allows one null element.
- Provides fast insertion, deletion, and searching.
- Average Time Complexity:
    add()       -> O(1)
    remove()    -> O(1)
    contains()  -> O(1)

Common Methods:
set.add(value);          // Add element
set.remove(value);       // Remove element
set.contains(value);     // Check if element exists
set.size();              // Number of elements
set.isEmpty();           // Check if set is empty
set.clear();             // Remove all elements

*/

public class HashSetExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();

        System.out.println("Enter  elements:");
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);// wont allow as only unique is allowed
        set.add(7);
        System.out.println("After adding duplicate 1: " + set);
        if(set.contains(4)){
            System.out.println("set contains 4");
        }
        if (!set.contains(6)){
            System.out.println("set does not contain 6");
        }

//        Remove elements
        System.out.println("Remove element 7 if exists");
        if(set.contains(7)){
            set.remove(7);
            System.out.println("Set after element removed: "+set);
        }

//        Iterator
        Iterator<Integer> it = set.iterator();

//        iterator has two methods .next-> gives next element initially pointing towards null
//         .hasNext give True or false
        System.out.println("Through Iterator Class: ");
        while (it.hasNext()){
            System.out.print(it.next()+"\t");
        }
        System.out.println();


//    To traverse the set
        System.out.println("Through the loop: ");
        for (int n:set){
            System.out.print(n+"\t");
        }

        System.out.println("\nSize of the set: "+set.size());

        System.out.println("To check set is empty or not: "+set.isEmpty());

//        Clear
        set.clear();
        System.out.println("After clear(): " + set);
        System.out.println("Is Empty: " + set.isEmpty());


//        Set order is unpredictable
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        System.out.println("Order should be [10,20,30,40]: "+set);
    }
}