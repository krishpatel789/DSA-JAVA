package functions;
public class Passbyvalue {

    public static void main()
    {
        int a=10;
        int b=20;
        swap(a,b);
        System.out.println(a +" "+b);
        

    }
    static void swap(int num1,int num2)
    {
        
       int temp=num1;
       num1=num2;//20
       num2=temp;//10


    }
    
}
