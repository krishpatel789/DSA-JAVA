import java.net.SocketImpl;
import java.util.*;
class basiccoll 
{
    public static void main(String args[])
    {
        ArrayList <Integer> listName1=new ArrayList<>();
        listName1.add(0);
        listName1.add(0);
/*
    add(E element): Adds an element to the end of the list.
    add(int index, E element): Adds an element to the list at the specified index.

    get(int index): Returns the element at the specified index in the list.

    set(int index, E element): Sets the element at the specified index in the list to the new element.

    remove(int index): Removes the element at the specified index from the list.
    

    size(): Returns the number of elements in the list.

    isEmpty(): Returns true if the list is empty, false otherwise.

    contains(Object element): Returns true if the list contains the specified element, false otherwise.

    indexOf(Object element): Returns the index of the first occurrence of the specified element in the list, or -1 if the element is not found.
    lastIndexOf(Object element): Returns the index of the last occurrence of the specified element in the list, or -1 if the element is not found.
    
    toArray(): Returns an array containing all of the elements in the list.
    sort(Comparator<? super E> comparator): Sorts the list using the specified comparator.
    subList(start,end-1) it gives sublist of list but when operation applied on sublist it impacts the main list

 */

        List <Integer> listName=new ArrayList<>(listName1);
        //Adding list elements into the ArrayList
        listName.add(1);
        listName.add(500);
        listName.add(2);
        listName.add(3);
        listName.add(4);
      
        listName.add(500);
        listName.add(500);
        listName.add(1,50);

        listName.add(5,10); //adds at the specified index position
       
        //listName.remove(1);
        //.removeall is used to remove the collection inside the ArrayList implementation
        listName.removeAll(listName1);


        System.out.println(listName.get(0));
        listName.set(0,0);
        //indexOf returns the index of the first occurance of an elment or object
        System.out.println("The first Occurance of 500 is at: "+listName.indexOf(500));
        System.out.println("SIZE OF THE LISTNAME IS :" + listName.size());
        
        //indexOf returns the index of the first occurance of an elment or object
        System.out.println("The last Occurance of 500 is at: "+listName.lastIndexOf(500));
       
       
      //removing the firstOccurance by searching the element
      int index=listName.indexOf(500); //returns -1 if the element is not found
      System.out.println(listName);
      
      listName.remove(index);
      System.out.println("LIST AFTER REMOVING THE FIRST OCCURANCE OF 500 :");
      System.out.println(listName);
      System.out.println("SIZE OF THE LISTNAME IS :" + listName.size());
      System.out.println("Is our list empty :"+listName.isEmpty());
      System.out.println("checking element contain or not eg: 5000 :  "+listName.contains(5000));
      System.out.println("checking containsAll : " + listName.containsAll(listName1));

     //toArray() Method in Java
     listName.toArray();
     System.out.println(listName);

     List <Integer> sublist=listName.subList(0,3);
     System.out.println(sublist);
     System.out.println("After making changes to sublist");
     sublist.set(0,100);
     System.out.println(sublist);
     System.out.println(listName);
      
        System.out.println("Working with the ListIterator   :   ");
    //listName.remove(5);
    ListIterator <Integer> li=sublist.listIterator();
    while(li.hasNext())
    {
        System.out.println(li.next());
    }
    
    // System.out.println(li.next());
    // System.out.println(li.next());
    // System.out.println(li.hasNext());
    // System.out.println(li.previous());
    
       

    }
    
}
