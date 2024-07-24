import java.util.Scanner;
public class Factors 
{
    void factors(int n)
    {
        System.out.println("The factors of the given number are :");
        int factor=0;
        int numberoffactors=0;
        for(int i=1;i*i<=n;i++)
        {
            if(n%i==0)
            {
                factor=i;
                 System.out.println(factor);
                 numberoffactors++;
                 if(n/i!=factor)
                {
                System.out.println(n/i);
                numberoffactors++;
                }
            }
        }
        System.out.println("NUMBER OF FACTORS :" +numberoffactors);
    }    public static void main(String[] args) 
    {
        Factors obj=new Factors();
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        obj.factors(num);  
        sc.close(); 
    }
}
