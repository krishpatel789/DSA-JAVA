import java.util.Scanner;
public class StringBasics 
{
    public static void main(String args[])
    {

/* 

     //string literal
     String name="Hari Krishna";
     String name2="";
     String name3="mmhj";
     System.out.println(name);
     System.out.println(name2);
     System.out.println(name3);
     //System.out.println(name.charAt(0));
     char ch=name.charAt(0);
     System.out.println(ch);


    
    //  for(int i=0;i<name.length();i++)
    //  {
    //     System.out.println(name.charAt(i));
    //  }

    //  //STRING METHODS IN JAVA
    //  System.out.println(name.length());
        
    // //     Scanner sc=new Scanner(System.in);
    // //     String s1=sc.next();      //next and nextLine 
    // //    // String s2=sc.nextLine();
    // //     System.out.println(s1);
    // //     //System.out.println(s2);


    String name="Hari Krishna";
    System.out.println(name.substring(0,4));
    System.out.println(name.substring(0,3));
    //System.out.println(name.charAt(0));
    //System.out.println(name.charAt(1));

         // // LENGTH OF  A STRING WITHOUT NOTHING IS ALWAYS 0
    // String TempName="";
    // System.out.println(TempName.length());
    


    
     for(int i=0;i<name.length();i++)
     {
        char ch=name.charAt(i);
        //TempName.append(ch);

        System.out.print(name.charAt(i));
     }

        //StringBuffer METHODS
        String name1="Hari Krishna";
       // System.out.println(name1.length());       //length display no of chars in the string
        
        StringBuffer sb=new StringBuffer(name1);
        System.out.println(sb.capacity());
        sb.trimToSize();
        System.out.println(sb.capacity()); //ability to store in the buffer variable
        //System.out.println(sb.length());

*/
/* 

        //StringBuilder Methods 
        StringBuilder sb=new StringBuilder("who is who myannn!");
        System.out.println("StirngBuilder Methods:");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println(sb.charAt(5));
        System.out.println(sb.charAt(16));
        System.out.println(sb.replace(11,17,"MANN"));
        System.out.println(sb.delete(7, 11));
        System.out.println(sb.substring(0,7));
*/

        
     //STRING BUILDER
     StringBuilder sb1=new StringBuilder();
     sb1.append("Hari");
     sb1.append("Krishna");
     StringBuilder s=sb1;
     System.out.println(sb1);
     System.out.println(sb1==s);
     System.out.println(sb1.length());
     sb1.replace(0,4,"HARI");
     System.out.println(sb1);
     System.out.println(sb1.toString());

                             


        















    }
}
