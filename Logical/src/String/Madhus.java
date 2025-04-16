package String;
import java.util.*;
/*public class String15
{

	public static void main(String[] args) 
	{
		int vowels=0;
		String str1="i m sonu";
		String newStr="";
		for(int i=0;i<str1.length();i++)
		{
			Integer count=1;
			// str1;
			while(i<str1.length()-1 && str1.charAt(i)==str1.charAt(i+1))
			{
				count++;
				i++;
			}
			newStr+=str1.charAt(i);
			if(count>1)
			{
				newStr+=count.toString();
			}
		
	    if(str1.charAt(i)=='a' || str1.charAt(i)=='e' || str1.charAt(i)=='i' || str1.charAt(i)=='o' || str1.charAt(i)=='u')
 	   {
 	 //  int vowels;
		vowels++;
 	   }
		}
		System.out.println(vowels);
    	   
	}
}*/
      

/*public class String15
{
    public static void main(String[] args)
    {
        int vowels = 0;
        String str = "i m sonu";
        String newStr = "";
        
        for (int i = 0; i < str.length(); i++)
        {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) 
            {
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if (count > 1) 
            {
                newStr += count.toString();
            }
            
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                vowels++;
            }
        }

        System.out.println("Modified String: " + newStr);
        System.out.println("Vowel count: " + vowels);
    }
}*/
public class Madhus
{
	public static boolean m1()
	{
		 String str = "racecar";
	        int n = str.length();
	        
	        for (int i = 0; i < n/2; i++) {
	            if (str.charAt(i) != str.charAt(n-1-i)) {
	                return false;
	            }
	            //return true;
	        }
			return false;
	}
    public static void main(String[] args) {
       
    	Madhus.m1();
       // System.out.println(str);
       // return true;
    }
}
