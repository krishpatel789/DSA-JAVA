import java.util.*;
public class basicsstring 
{
    public static void main(String args[])
    {

        /* 
        String name="mango";// reference variable "name" pointing to object mango
        System.out.println(name);
        name="apple"; //new object for referece is created ,first object goes to garbage
        System.out.println(name);
        System.out.println(name);

        String name1="Apple";
        String name2="Apple";
        System.out.println(name1==name2);//returns true when two ref variables point same object

*/
  //Creating two different String variabels wrt sperate objects in heap
        String name3=new String("Apple");
        String name4=new String("Apple");
        System.out.println(name3==name4); //false
        System.out.println(name3.equals(name4));//true
        




 


 /* 

        String a="ramu";
        String b="ramu";
        System.out.println(a.charAt(0));
        System.out.println(a==b);
        System.out.println(a.equals(b));
        System.out.println(149+100);
      
        String s=null;
        System.out.println(s);

        float c=45123.5555f;
    //   System.out.printf("%.2f", c);
    System.out.printf(" Hello I am  %s belongs to the class %s ","Hari Krishna","AIML-BETA");

//  % placeholders of different types

*/
        String s="Hari KRISHNA";
        s.toLowerCase();
        System.out.println(s);
        System.out.println(s.toUpperCase());
        System.out.println(s.toCharArray());
        System.out.println(s.substring(0,5));
        System.out.println(s.trim()); //is same as trim in photo editings only removes extra space around photo
        System.out.println(s.replaceAll(" ",""));
       
        System.out.println(s);
        String s2=" Is a good boy";
        String s3=s.concat(s2);
        System.out.println(s3);
        System.out.println(s3.trim());
        //SPLI
        String[] spliit=s.split(" ");
        // for(int i=0;i<spliit.length;i++)
        // {
        //     System.out.println(spliit[i]);
        // }
        for(String word:spliit)
        {
            System.out.println(word);

        }
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            System.out.println(ch);
        }   
    }
    
}
