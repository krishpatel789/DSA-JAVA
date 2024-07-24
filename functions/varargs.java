package functions;


//USED TO TAKE MULTIPLE NUMBER OF (ITEMS/ELEMENTS) AT A TIME
import java.util.Arrays;

public class varargs
 {
    static void sum(int ...v)
    {
        System.out.println(Arrays.toString(v));
        

    }
    static void sum(String ...v)
    {
        System.out.println(Arrays.toString(v));
    }
    static void sum(int a,int b,int c,String...v )
    {
        System.out.println(Arrays.toString(v));
        
    }
    public static void main(String[] args) {
        sum(1,2,3,4,5,6);
        sum("Java","Python","Mern");
        sum(1,2,3,"Hari","krishna","ravi");
      
    }  
}
