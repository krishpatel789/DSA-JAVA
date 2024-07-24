import java.util.Scanner;

class arr
{
 public static void main(String[] args) 
 {
    // int a=5;
    // // System.out.println(a);
    // // System.out.println(a);
    // // System.out.println(a);
    // // System.out.println(a);
    // // System.out.println(a);
    // for(int i=0;i<5;i++)
    // {System.out.println(a);}
    Scanner sc=new Scanner(System.in);
    System.out.println("How many numbers you want to check");
 int t=sc.nextInt();

 
 for(t=0;t<2;t++)
 {



    
    int number=sc.nextInt();
    System.out.println(number);
   for(int i=0;i<5;i++)
   {
    number=number+1;
    System.out.println(number); 
   }

}

 }
}
