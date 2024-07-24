//Linear Search by Taking Input from the User
import java.util.*;

public class Searching1
{
    public static void LinearSearch(int[] arr,int key)
    {
        int counter=0;
        for(int i=0;i<arr.length;i++)
        {
            counter++;
            
            if(arr[i]==key)
            {
                System.out.println(key+" is found at index position : "+ i);
              
            }
            else if(arr[i]!=key && counter==arr.length-1)
            {
                System.out.println(key+" is not found in the array ......!");
              
               
            }
        }   
    }

    static int LinearSearch1(int[] arr,int key)
    {
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]==key)
           {
            return i;
           }
        }
        return -1;
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
        System.out.println("Enter element to search : ");
        int searchkey=sc.nextInt();
        LinearSearch(arr,searchkey);//void method(Method with no return type)
        System.out.println(LinearSearch1(arr,searchkey)); //int method(Method with return type int)



        
        
    }
    
}
