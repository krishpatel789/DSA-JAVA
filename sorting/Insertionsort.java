package sorting;
import java.util.*;
public class Insertionsort 
{
    public static void insertionsort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            
        }


    }
    public static void main(String[] args) 
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the length of the array : ");
    int arrlength=sc.nextInt();
    int[] arr=new int[arrlength];
    for(int i=0;i<arr.length;i++)
    {
        arr[i]=sc.nextInt();
    }
    insertionsort(arr);
    }
}
