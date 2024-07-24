public class countletters
{
    static int count(String S)
    {
        int vowel_count=0;
        int consonant_count=0;
        int length=S.length();
        System.out.println("The total characters in the Name is : " + length);
        S.toLowerCase();
        for(int i=0;i<length;i++)
        {
            if(S.charAt(i)=='a' || S.charAt(i)=='e'|| S.charAt(i)=='i' || S.charAt(i)=='o'||S.charAt(i)=='u')
            {
                vowel_count++;
            }
            else{
                consonant_count++;
            }
            
        }
        int consonants=length-vowel_count;
        System.out.println("consonats count is :"+consonants);
        System.out.println("Vowel Count is : ");
        return vowel_count ;
    
    }
    
   
    public static void main(String[] args)
    {
        System.out.println(countletters.count("Hari Krishna"));
        
    }
    
}
