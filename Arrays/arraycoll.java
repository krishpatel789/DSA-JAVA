import java.util.*;
public class arraycoll

{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //ArrayList<Wrapperclass> objrefVariable=new ArrayList<>(CapacityTemp);

        

        ArrayList<Integer> al=new ArrayList<>(10);
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        System.out.println(al);
        al.add(0,100);//adding at index position
        System.out.println(al);
        al.add(100);
       // al.clear();
       // System.out.println(al);
       //Returns true if element is present in the al(ArrayList)
       System.out.println(al.contains(100));
       //Returns first occurance index
       System.out.println(al.indexOf(100));
       System.out.println(al.isEmpty());
       al.set(0,500);
       System.out.println(al);
       

       //adding elemnt from terminal
        for(int i=0;i<5;i++)
        {
            al.add(sc.nextInt());

        }

        //USING FOR LOOP
        // for(int i=0;i<5;i++)
        // {
        //     System.out.println(al.get(0));

        // }
        
        //USING ENHANCED FOR LOOP
        System.out.println("First element is " + al.get(0));
        for(Integer items : al)
        {
            System.out.print(items+" ");
        }
        System.out.println(" ");
        System.out.println(al);




       
    }
    
}
