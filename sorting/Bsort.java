package sorting;
import java.util.*;
import java.util.Scanner;
public class Bsort
{
    static String Bubblesort(int[] arr)
    {
       
        int lengtharr=arr.length;
        for(int row=0;row<lengtharr;row++)
        {
            int count=0;
            for(int col=0;col<lengtharr-1-row;col++)//col=1
            {
                
                if(arr[col]>arr[col+1])
                {
                    int temp=arr[col];
                    arr[col]=arr[col+1];
                    arr[col+1]=temp;

                }
              
               
            }
              if(count==0)
                {
                    System.out.println("Array is sorted already : ");
                    break;

                }
            
        }
        System.out.println(Arrays.toString(arr));
        for(int item:arr)
        {
            System.out.println(item);
        }
        return Arrays.toString(arr);
    }
    public static void main(String[] args) 
    {

         // int[] a={50,60,70,100,800,1,50};
        // LinearSearch(a, 15);
        // System.out.println(LinearSearch1(a,15));

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements you want to add to array : ");
        int elements=sc.nextInt();

        int[] arr=new int[elements];
        System.out.println("Enter Elements of the array : ");
        for(int i=0;i<elements;i++)
        {
            arr[i]=sc.nextInt();
        }
        //void method(Method with no return type)
        Bubblesort(arr);
        //System.out.println(Bubblesort(arr));
     
        
    }

    
}
