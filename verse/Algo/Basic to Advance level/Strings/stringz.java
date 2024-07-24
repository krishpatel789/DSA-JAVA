import java.util.Scanner;
class stringz

{
    int roll;
    String name;
    String section;

    stringz(int a,String b,String c)
    {
        this.roll=a;
        this.name=b;
        this.section=c;

    }


    public static void main(String args[])
    {
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter a String of your choice");
        // String obj=sc.nextLine();
       // System.out.println(obj);
        String name="hari krishna";
        System.out.println(name);
        // String conca=obj+name;
        // System.out.println(conca);
        // int sample=123;
       
        // stringz s=new stringz(1,"ramyu","cse A");
        
        // stringz s1=new stringz(1,"ramyu","cse A");
        // stringz s2=new stringz(2,"hari","aiml");
        // System.out.println(s);
        // System.out.println(s.hashCode());
        // System.out.println(s1.hashCode());
        // System.out.println(s2.hashCode());
        System.out.println(name.length());
    }
}