class palin
{
    public static String rev1(String S)
    {
        StringBuffer st=new StringBuffer(S);
        StringBuffer ob=st.reverse();
        String str=ob.toString();
        //System.out.println(str);
        return str;
    }
    static void rev2(String s)
    {
          int len_s=s.length();
        for(int i=0;i>=s.length();i++)
        {
            if(s.charAt(i) !=s.charAt(s.length()))
            {
                System.out.println("The String is not an PALINDROME");

            }
            else
            {
        
            }
        }


        
        }



    }
    public static void main(String args[])
    {
        System.out.println(palin.rev1("HARI"));
        System.out.println(palin.rev2("HARI"));
    }
}