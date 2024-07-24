//Binary Search by Taking input from the user (if not sorted ,automatically sorted)
import java.util.*;

//This program handles BinarySearch for Unsorted array of Elements too

public class Searching2
{
    //USING VOID (NO RETURN TYPE REQUIRED)
    public static void BinarySearch(int[] arr,int key)
    {
       int low=0;
       int high=arr.length-1;
       int mid=(low+high)/2;

       while(low<=high)
       {
        if(arr[mid]==key)
        {
            System.out.println(key+" is found at index postion "+mid);
            break;
        }
        else if(key<arr[mid])
        {
            high=arr[mid-1];
            mid=(low+high)/2;

        }
        else
        {
            low=arr[mid+1];
            mid=(low+high)/2;
        }
       }

    }

    //USING int as return type ( RETURN TYPE REQUIRED OF TYPE int)
    public static int BinarySearch1(int[] arr,int key)
    {
       int low=0;
       int high=arr.length-1;
       int mid=(low+high)/2;

       while(low<=high)
       {
        if(arr[mid]==key)
        {
            break;
          
        }
        else if(key<arr[mid])
        {
            high=arr[mid-1];
            mid=(low+high)/2;

        }
        else
        {
            low=arr[mid+1];
            mid=(low+high)/2;
        }
       }
      return mid;
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
        sc.close();//releases System resources
        System.out.println("BINARY SEARCH WORKS FOR ONLY SORTED ARRAY ");
        System.out.println("IF THE ARRAY IS NOT SORTED,SORTING IS DONE NOW.....");
        Arrays.sort(arr);
        System.out.println("The array in sorted form is :");
        System.out.println(Arrays.toString(arr));
        BinarySearch(arr,searchkey);//void method(Method with no return type)
    
        System.out.println(BinarySearch1(arr,searchkey)); //int method(Method with return type int)    
        System.out.println("BINARY SEARCH IS DONE....Thaala for a Reason..!");
    }

    
}
