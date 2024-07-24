package generics;

public class gens 
{
    static <T> void genericPrint(T t)
    {
        System.out.println( t);
        

    }
    public static void main(String[] args) {
        genericPrint(101);
        genericPrint("javaaa");
        genericPrint(3.14444);
    }
    
}
