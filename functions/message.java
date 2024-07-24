package functions;
public class message {
    static void messageswap(String message)
    {
         message="Hey,how are uh doing..!";

    }
    public static void main(String args[])
    {
        String NewMessage="Hello,Java is Pass By Value Only";
        messageswap(NewMessage);
        
        System.out.println(NewMessage);

    }
}
