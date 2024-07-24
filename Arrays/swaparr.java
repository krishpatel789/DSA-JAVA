import java.util.Scanner;
import java.util.Arrays;
public class swaparr
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array : ");
        int size=sc.nextInt();
        int[] nums=new int[size];
        System.out.println("Enter elements of the array : ");
        for(int i=0;i<nums.length;i++)
        {

            nums[i]=sc.nextInt();
        }
        
    
        System.out.println(Arrays.toString(nums));
        swap(nums);
        System.out.println(Arrays.toString(nums));

    }

    static void swap(int num[])
    {
        int start=0;
        int end=num.length-1;
        while(start<=end)
        {
        
            int temp=num[start];
            num[start]=num[end];
            num[end]=temp;
            start++;
            end--;
          
        }
        


    }


}