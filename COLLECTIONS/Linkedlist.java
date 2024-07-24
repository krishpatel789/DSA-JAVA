package COLLECTIONS;

import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedlist {
    public static void main(String[] args) 
    {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        System.out.println(ll);
        ll.set(0,100);
        for(int items : ll)
        {
            System.out.println(items);
        }
        System.out.println();
//100 20 30
        ListIterator<Integer> iterator =ll.listIterator();
                /*
         Returns the next element in the list and advances the cursor position. 
         This method may be called repeatedly to iterate through the list, or intermixed with calls to previous to go back and forth. 
         (Note that alternating calls to next and previous will return the same element repeatedly.)
        
         Returns the previous element in the list and moves the cursor position backwards. 
         This method may be called repeatedly to iterate through the list backwards, or intermixed with calls to next to go back and forth. 
         (Note that alternating calls to next and previous will return the same element repeatedly.)

         Returns true if this list iterator has more elements when traversing the list in the forward direction. 
         (In other words, returns true if next would return an element rather than throwing an exception.)


         */ 
        // System.out.println(iterator.next()); //100
        // System.out.println(iterator.previous()); //100
        // System.out.println(iterator.hasNext());//20 true
        // System.out.println(iterator.previous()); //false

        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());//value out
        System.out.println(iterator.hasNext());//checks boolean expression

        // previous() moves cursor back 1st and returns the element
        // next() returns the succeccding element and moves cursor forward


         




        



    }
}
