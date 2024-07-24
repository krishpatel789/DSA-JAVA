// public class countalphabets 
// {
//     static int count(String s)
//     {
//         int vowelcount=0;
//         int constantcount=0;
      
       
//         s.toLowerCase();
//         s=s.trim();
  
//         for(int i=0;i<s.length();i++)
//         {
//             if(s.charAt(i)=='a' ||s.charAt(i)=='e' || s.charAt(i)=='i'|| s.charAt(i)=='o'|| s.charAt(i)=='u'  )
//             {
//                 vowelcount++;
//             }
//             else
//             {
//                 constantcount++;
//             }

//         }
//         System.out.println("vowel count is: " +vowelcount);
//         return constantcount;
//     }
      

//       public static void main(String args[])
//         {
            
//             System.out.println(countalphabets.count("Hari Krishna"));
            
//         }
// }
public class countalphabets {
    static int count(String s) {
        int vowelcount = 0;
        int constantcount = 0;

        // Trim the spaces in the string.
        String m = s.replace(" ","_");
        System.out.println(m);

        for (int i = 0; i < m.length(); i++) {
            if (m.charAt(i) == 'a' || m.charAt(i) == 'e' || m.charAt(i) == 'i' || m.charAt(i) == 'o' || m.charAt(i) == 'u') {
                vowelcount++;
            } else {
                constantcount++;
            }
        }

        System.out.println("vowel count is: " + vowelcount);
        return constantcount;
    }

    public static void main(String args[]) {
        System.out.println(countalphabets.count("Hari    Krishna"));
    }
}