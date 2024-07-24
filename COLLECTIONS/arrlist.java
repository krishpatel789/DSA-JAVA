package COLLECTIONS;

import java.util.ArrayList;
import java.util.List;

public class arrlist {
    public static void main(String[] args) {
        List<Integer> lis=new ArrayList<Integer>(1);
        lis.add(1);
        lis.add(1);
        lis.add(3); //add elments to the list
        for(int items:lis)
        {
            System.out.print(items+",");
        }


      /*   Replaces the element at the specified position in this list 
        with the specified element (optional operation).
        */
        System.out.println();
        System.out.println("Replacing element at index 1 using set method");
        lis.set(1,149);


        for(int elements : lis)
        {
            System.out.println(elements);
        }



        System.out.println(lis); //by default toString is implemeted

        List<Integer> list2=new ArrayList<>(lis);
        list2.add(500);
        list2.set(0,5000);
        System.out.println(list2);

        //addall Methods takes parameter as collection it adds the entire collection elements
        List<Integer> list3=new ArrayList<>();
        list3.addAll(list2);
        list3.add(0);
        list3.add(01);
        list3.add(02);
       // list3.addAll(list2);
        System.out.println("Printing all elements of list2 including3");
        System.out.println(list3);
        /*
         List<Integer> listname=new ArrayList<>(CAN PASS ANY COLLECTION IN THIS)
         () ->This is constructor
         <> ->This is a reference type,it should be only an Wrapper Class

         The above constructor can be used to give intial capacity size
         or we can pass other list or even a entire collection
         */

         /*
          when list is created using sublist.if we change the list the
          original list gets changed
          sublist is copy of reference of a list,if we change elments inside
          it the original list elements get changed
          */
         List<Integer> list4=list3.subList(0,3);
         //subList(startindex,endindex) always returns endindex-1
         System.out.println(list4);
         list4.set(0,100);
         list4.add(149);
         System.out.println(list4);
         System.out.println(list3);

//indexOf() method is used to find the index of given element(1st occurence)
         System.out.println(list4.indexOf(149));
         System.out.println(list4.lastIndexOf(149));






    }
    
}
