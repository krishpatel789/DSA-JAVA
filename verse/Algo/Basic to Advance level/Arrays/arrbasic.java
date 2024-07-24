import java.util.*;
public class arrbasic 
{



    public static void main(String[] args) 
    {
       //Array is collection of elements of similar datatype(type)
        //syntax
        //datatype[] refVarName=new datatype[];
        
        //storing marks of students
        int[] marks=new int[5];
        System.out.println(marks); 
        //The above line prints the reference of the Array only


//printing array elments
        int[] rating={5,4,6,9,10};
        System.out.println(rating);
        //above lines only print the reference of the array rating
        //we can print it by using a for loop or for each loop

        for(int i=0;i<rating.length;i++)
        {
            System.out.println(rating[i]);
        }
        /*Strictly remember that length is a method in strings but,
        it is a datamember in arrays */
        String s="Hari Krishna";
        System.out.println(s.length());

        //USING FOR EACH LOOP
        /*
         *It is best to use for each loop when we have to iterate through the elments of an array/collection
         **No great modifications can be done using for loop


         SYNTAX:

         for(datatypeOfArray var_name : Array/collection )
         {
            //var_name 
         }

         */

         //EXAMPLE

         int[] students={149,150,152};
         for(int student:students)
         {
            System.out.println("The student roll is :" +student);
         }


         int [] numm; //declaration of an array called num(reference variable) is defined in the stack 
         numm=new int[5];//Inrialization of the array num with size 5 in the heap memory
         System.out.println(numm[3]);
         Scanner sc=new Scanner(System.in);
        //  numm[0]=1;
        //  numm[1]=2;
        //  numm[2]=3;
        //  numm[4]=4;
        //  numm[5]=5;
        //  System.out.println(numm[4]);
         System.out.println("Enter an input objects less than/equal the size of array");
        for(int i=0;i<numm.length;i++)
        {
            
            numm[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(numm));

        int[] hp=new int[20];
        System.out.println(hp[0]);

     int[] room={15,16,17,18};
     System.out.println(Arrays.toString(room));
     mutaable(room);


    }
    static void mutaable(int[] arr)
    {
        arr[1]=14;
    }
}
