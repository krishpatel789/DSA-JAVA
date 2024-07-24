import java.util.Scanner;
import java.util.ArrayList;
public class multialist 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        ArrayList <ArrayList<Integer>> obj=new ArrayList<>();
        
        //INTIALIZATION OF MULTIDIMENSIONAL ARRAYLIST
        for(int i=0;i<3;i++)
        {
           obj.add(new ArrayList<>());

        }
        //adding elements 
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                obj.get(i).add(sc.nextInt());
            }
        }

        System.out.println(obj);

        //printing elements
        for(ArrayList<Integer> items: obj)
        {
            for(Integer a:  items)
            {
                System.out.println(a);
                
            }      
        }

        for(int i=0;i<obj.size();i++)
        {
            for(int j=0;j<obj.get(i).size();j++)
            {
                System.out.println(obj.get(j) +" ");
            }
            
        }

    }
    
}
