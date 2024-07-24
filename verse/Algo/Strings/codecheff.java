import java.util.*;
import java.lang.*;
import java.io.*;
class codecheff{
	public static void main (String[] args) throws java.lang.Exception{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        String s=sc.next();
	        int n=sc.nextInt();
	        int vowelCount=0;
	        s.toLowerCase();
	        for(int i=0;i<s.length();i++)
	        {
	            if(s.charAt(i)=='a'|| s.charAt(i)=='e'|| s.charAt(i)=='i'|| s.charAt(i)=='o'|| s.charAt(i)=='u')
	            {
	                vowelCount++;
	                if(vowelCount>3)
	                {break;}
	                
	            }
	            else
	            {
	                vowelCount=0;
	            }
	        }
	        
	        if(vowelCount>3)
	        {
	            System.out.println("No");
	        }
	        else
	        {
	            System.out.println("Yes");
	        }
	        
	    }
	}
}
