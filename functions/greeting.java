package functions;
import java.util.Scanner;
import java.io.*;
public class greeting {
    static void greet(){
        System.out.println("Hey hello,How are you doing");

    }
    static String greets(String name)
    {
        String message="Hello"+" " +name;
        return message;
        
    }
    public static void main(String[] args) throws IOException {
        greet();
       // InputStreamReader obj=new InputStreamReader(System.in);
        //BufferedReader R=new BufferedReader(obj);

        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name: ");
        String name_var=obj.readLine();
        System.out.println(greets(name_var));
    }   
}
