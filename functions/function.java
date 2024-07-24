package functions;
import java.util.Scanner;
public class function{
    static void sum()
    {
      Scanner sc=new Scanner(System.in);  
      System.out.println("Enter number 1");
       int a=sc.nextInt();
       System.out.println("Enter number 2");
      int b=sc.nextInt();
      int sum=a+b;
      System.out.println(sum);
      sc.close();

    }
     int add(int a,int b){
        //int sum=a+b;
        //return sum;
        return a+b;
    }
    static int addin()
    {
         //take input of two numbers and print the sum
        Scanner sc=new Scanner(System.in);
        System.out.println("ADDIN FUNCTION : ");
        System.out.println("Enter number 1");
        int a=sc.nextInt();
        System.out.println("Enter number 2");
        int b=sc.nextInt();
        int sum=a-b;
        sc.close();
        return sum; //return implies function ends TATAA BYE BYEE KHATAMM
        //System.out.println("hejllo");
    }
    public static void main(string args[])
    {
       
        /*
         
          access modifier return_type name (){
            //body
            return statement;
          }
         */
        sum();
        System.out.println(addin());
        
        function obj=new function();
        //obj.add(20,30);
        int a=-20;
        int b=10;
        System.out.println(obj.add(a,b));
        
    }
    
}