package functions;
public class swap 
{
   
    static void swap(int a,int b)
    {
        int temp=a;
        a=b;
        b=temp;
       System.out.println(a+" "+b);

    }
    
    public static void main(String args[])
    {
        //swap obj=new swap();
        int a=10;
        int b=20;
        swap(a,b);
        //System.out.println(a +" "+b);



        String namee="Hari Krishna";
        changename(namee);
        System.out.println(namee);

    }

    private static void changename(String name) {
        name="RAM GOPAL VARMA";
        System.out.println(name);

       
    }
    
}
