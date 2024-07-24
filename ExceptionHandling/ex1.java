package ExceptionHandling;



public class ex1 {
    public static void main(String[] args) {

        int i=10;
        int j=100;
        int result;

    // int result=i/j;
    // System.out.println(result);

    try{
        result=i/j;
        if(result==0){
            throw new ArithmeticException("I don not want to print num by zero");
        }     
    }
    catch(ArithmeticException e){
        System.out.println("Division by zero happend " +e);
    }


    
        
    }
    
}
