import java.util.Arrays;
import java.util.Scanner;
public class intro1
{
    public static void main(String[] args) 
    {
        //Syntax
        //datatype[] varname=new datatype[size];
        //Collection of elements of same data type only




        int[] rnos=new int[5];
        //direct
        int[] rnos1={1,2,3,4,5,20};

        //Declartion
        int[] rnos2; //declartion of array,rnos2 in stack memory
        rnos2=new int[5]; //Object is created in the memory(heap)
        System.out.println(rnos2[0]);
        System.out.println(rnos2[1]);
        System.out.println(rnos2[2]);
        System.out.println(rnos2[3]);
        System.out.println(rnos2[4]);
        
        //Array of Strings
        String[] arr=new String[5];
        System.out.println(arr[0]);
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextLine();
        }

        for(String items:arr)
        {
            System.out.print(items +" ");//items represent elements in the array
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));


        /*
         2-D array
         1 2 3
         4 5 6
         */
        int[][] arr2d=new int[3][];
        int[][] arrd={
            {1,2,3},
            {4,5,6,7},
            {7}
        };
        System.out.println(arrd.length);

        //Arrays.toString(arrayname) is used for single dimension array
        //Arrays.TodeepString(arrayname) is used for Multidimensional array
        System.out.println(Arrays.deepToString(arrd));
        // for(int[] row:arrd)
        // {
        //     for(int[] column:arrd)
        //     {
        //         System.out.println(arrd);}
            

        // }
        for (int row = 0; row<arrd.length;row++)
        {
            for(int col=0;col< arrd[row].length;col++)
            {
                System.out.print(arrd[row][col]+" ");
            }
            System.out.println();
        }




     

        


        
    }


    
}
