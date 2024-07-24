import java.util.Arrays;


public class Sortingstring 
{
    static void sorting(String s)
    {
        char arr[]=s.toCharArray();
        char temp;
        Arrays.sort(arr);
   
        // for(int i=0;i<arr.length;i++)
        // {
        //     for(int j=i+1;j<arr.length;j++)
        //     {
        //         if(arr[j]<arr[i])
        //     {
        //         temp=arr[i];
        //         arr[i]=arr[j];
        //         arr[j]=temp;

        //     }

        //     }
            
        // }
        System.out.println(arr);
        //to print it as array only
        System.out.println(Arrays.toString(arr));

    }
    public static void main(String args[])
    {
        Sortingstring.sorting("hariaakrishna");
        String s="Keep doing it ,no matter how hard it is";
        
        char ch[]=s.toCharArray();
        System.out.println(Arrays.toString(ch));
        
       
    }
    
}
