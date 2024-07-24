public class stringformatting 
{
    public static void main(String args[])
    {
        String firstname="Tulisagari";
        String middlename="Hari Krishna";
        String lastname="Patel";
        System.out.println("My name is "+" " +firstname+" "+middlename+" "+lastname);
        System.out.println("My name is "+"\n" +firstname+" "+middlename+" "+lastname);
        System.out.println("My name is "+"\n"+firstname+middlename+lastname);
        //System.out.printf("My name is %s %s %s",firstname,middlename,lastname);
        System.out.printf("My name is %3$s %1$s %2$s",firstname,middlename,lastname);
        //System.out.printf("My name is %2$s %3$s %1$s %n  My first name is %1$s ",firstname,middlename,lastname);



    }
    
}
