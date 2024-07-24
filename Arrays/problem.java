import java.util.Scanner;
import java.util.Arrays;
public class problem 
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
        // System.out.println(Arrays.toString(nums));
        // System.out.println("Enter 1st index of element to swap: ");
        // int index1=sc.nextInt();
        // System.out.println("Enter 2nd index of element to swap: ");
        // int index2=sc.nextInt();
        // swap(nums,index1,index2);
        // System.out.println(Arrays.toString(nums));
           
        
         max2(nums);
         sc.close();
     
        
    }
    //In methods we have commas not semicolon ;
    static void swap(int[] nums, int index1, int index2)
    {
        int temp=nums[index1];
        nums[index1]=nums[index2];
        nums[index2]=temp;
        
    }

    static void max1(int[] nums)
    {
        int maxx=nums[0];
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i] < nums[i+1])
            {
                maxx = nums[i+1];
            }
        }
        System.out.println("Maximum number in the array is : "+maxx);
    }

    static void max2(int[] nums)
    {
        int max=nums[0];
        int i=1;
        // while(i<nums.length)//nums.length > i++
        while(nums.length>i)
        {
            if(max < nums[i])
            {
                max = nums[i];
                
            }
            i++;
        }
        System.out.println("maximum element in the array is : "+max);  
        i=1;
        while(i++>5)
        {
            System.out.println(i);
            System.out.println("Hello");
        }
    }
}