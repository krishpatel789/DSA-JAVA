import java.util.Scanner;
public class ntimes 
{
    static void name(int n)
    {
        if(n<=0)
        {
            return;
        }
        else
        {
            name(n-1);
            System.out.println("Raju");
        }
    }

    public static int numlin(int n)
    {
        
            numb(n-1);
  
        return n;
    }
    static void numb(int n)
    {
        if(n<=0)
        {
            return;
        }
        else
        {
            numb(n-1);
            System.out.println(n);
            
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of times a number need to printed :");
        int n=sc.nextInt();
        // System.out.println(name(n));
       // name(n);
        //System.out.println(numlin(n));
        System.out.println(numseries(n));

    }

    static int numseries(int numbers)
    {
        if(numbers<=0)
        {
           return 0;
        }
        else
        return numbers;
    }
    static void numseriess(int n)
    {
        if(n<=0)
        {
            return;
        }
        else
        {
            numseries(n-1);
            System.out.println(n);
        }
    }


    

}
