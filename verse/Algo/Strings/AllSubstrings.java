public class AllSubstrings
{
    static void substrings(String s)
    {
        //ALL POSSIBLE SUBSTRINGS OF A STRING
        
    for(int i=0;i<s.length();i++)
    {
        for(int j=i+1;j<=s.length();j++)
        {
            System.out.print(s.substring(i,j)+" ");
        }
       System.out.println();
    }
    }
     
    //Spliting Strings(SENTENCE)
    //A SENTENCE IS AN ARRAY(i.e SEQUENCE) OF WORDS NOT CHARACTERS
    static void splitting(String S)
    {
       String arr[]=S.split(" ");
       System.out.println(arr.length);
       for(int i=0;i<arr.length;i++)
      //for(String word:arr)
       {
       // System.out.println(word);
       System.out.println(arr[i]);
       }
    }
 
    public static void main(String args[])
    {
        //AllSubstrings.substrings("Hari");
        AllSubstrings.splitting("Hari Krishna");
        
        
        
    }

   
    



}
