import java.util.*;
  
  public class numbers{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
  
       // write ur code here
       Scanner sc=new Scanner(System.in);
       //int t=sc.nextInt();
       //for(int i=0;i<t;i++)
       //{
           int n=sc.nextInt();
           int divideCount=0;
           for(int j=2;j*j<=n;j++)
           {
               if(n%j==0)
               {
                   divideCount++;
                //    if(divideCount>2)
                //    break;
               }
           }
           if(divideCount==0)
           {
               System.out.println("prime");
           }
           else
           {
            System.out.println("Not a Prime");
           }
     //  }
       
  
   }
  }
