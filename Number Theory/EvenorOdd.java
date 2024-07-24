import java.util.Scanner;

public class EvenorOdd
{
    void even(int n)
    {
        if(n%2==0)
        {
            System.out.println("The number"+n +"is even");
        }
        else
        System.out.println("The number"+n +"is odd");
    }
    public static void main(String[] args) 
    {
        EvenorOdd obj=new EvenorOdd();
        obj.even(10);
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        obj.even(k);
    }
    
}
