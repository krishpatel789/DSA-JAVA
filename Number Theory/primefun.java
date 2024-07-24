import java.util.Scanner;
public class primefun {
    static boolean isprime(int num)
    {
       
        boolean isprime=true;
        if(num <= 1)
        {
            return false;
        }
        else
        {
            int c=2;
            //while(Math.sqrt(num)>=c)  if no c++ ,this value is finite loop(iterative process)
            while(Math.sqrt(num)>=c++) //first the value is c(2)only,when inner block is done,c is incremented
            {
                if(num % c == 0)
                {
                    isprime = false;
                    break; 
                }
                //c++;
                
            }
          
        }
        return isprime;
    }
    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter number to check prime or not");
        int number=scn.nextInt();
        //int check=isprime(number);

        System.out.println(isprime(number));
        scn.close();


    }
    
}
