package Strings;
import java.util.*;

public class  intro
{
    public static void main(String[] args) 
    {
        String s="My name is Hari Krishna";

        //To find the elment at a desired index
        System.out.println(s.charAt(0));

        //To find the length of the string use length() method.length starts from 1
        System.out.println(s.length());
        String name="Krishna";
        System.out.println(name.length());

        //substring in java
        System.out.println(name.substring(0));
        System.out.println("Hari ".substring(0,2));

        //REFERENCES OR CHANGES 
        String name1="Hari ";  //name1------>Hari
        System.out.println("Name 1 is : "+name1); 
        String name2=name1;    //name2----->Hari
        System.out.println("Name 2 is : "+name2);
        System.out.println("Is name1 is equal to name2 : " + (name1.equals(name2)));
        System.out.println("DO name1 and name2 store in the same m/y location : " + (name1==name2)); 
        name2 +="Krishna";    //name2=name+"Krishna"  name2----->Hari Krishna
        System.out.println("Name 2 is : "+name2);
        System.out.println("Do name 1 and name 2 store in the same M/y location : " +(name1==name2));
        System.out.println("Do name 1 and name 2 contents are same : " +(name1==name2));

        System.out.println("Name 1 is : " +name1);
        System.out.println("Name 2 is : "+name2);
        Scanner sc=new Scanner(System.in);
        String message=sc.next();
        System.out.println(message);
        String message2=sc.nextLine();
        System.out.println(message2);
        sc.close();
    } 
}
