package sorting;
import java.util.*;
class ss
{
    public static void selectionsort(int[] arrr)
    {
        for(int i=0;i<arrr.length-1;i++)
        {
            int min=i;
            for(int j=i+1;j<arrr.length;j++)
            {
                //13 46 24 52 20 9
                if(arrr[j]<arrr[i])
                {
                    min=j;
                }
            }
            int temp=arrr[min];
            arrr[min]=arrr[i];
            arrr[i]=temp;
        }
        System.out.println(Arrays.toString(arrr));

    }
    
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int len=sc.nextInt();
        int[] arr=new int[len];
        // for(int item:arr)
        // {
        //     arr[item]=sc.nextInt();
        // }
        for(int i=0;i<len;i++)
        {
            arr[i]=sc.nextInt();

        }

        selectionsort(arr);
        
    }
}
