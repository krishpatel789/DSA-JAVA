import java.util.Scanner;
public class stringbuilder
{
    public static void main(String args[])
    {
        // Scanner sc=new Scanner(System.in);
        // StringBuilder sb=new StringBuilder(sc.nextLine());
        // //print the refernce obj
        // System.out.println(sb);
        // //length (length start from 1)
        // System.out.println(sb.length());
        // //picking up by index (index starts from 0)
        // sb.charAt(0);
        // System.out.println(sb.charAt(0));
        // //updating the element using index
        // sb.setCharAt(0,'n');
        // System.out.println(sb);
        // //inserting a value
        // sb.insert(2,'i');
        // System.out.println(sb);
        // //removing wrst index
        // sb.deleteCharAt(2);
        // System.out.println(sb);
        // //adding elment at last
        // sb.append('g');
        // System.out.println(sb);
        System.out.println("TIME TAKEN IN STRINGS :");
        String s="Hari";
        int n=5;
        long start=System.currentTimeMillis();
        
        for(int i=0;i<n;i++)
        {
            s=s+i;

        }
        long end=System.currentTimeMillis();
        long duration=end-start;
        System.out.println(duration);
        System.out.println("Time taken in StringBuilder :");
        StringBuilder sb=new StringBuilder("Hari");
        int m=5;
        long begin=System.currentTimeMillis();
        for(int i=0;i<m;i++)
        {
            sb.append(i);
        }
        long stop=System.currentTimeMillis();
        long resultTime=stop-begin;
        System.out.println(resultTime);
        

        

    }
    
}
