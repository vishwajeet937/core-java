class Palindrome 
{
	public static boolean isPalindrome(String str)
	{  
    StringBuilder sb=new StringBuilder(str);  
    sb.reverse();  
    String rev=sb.toString();  
    if(str.equals(rev))
		{  
        return true;  
        }
		else
		{  
        return false;  
        } 
	 public static void main(String[] args)
	{  
      System.out.println(Palindrome.isPalindrome("nitin"));  
       //System.out.println(Palindrome.isPalindrome("jatin"));  
    } 
   }  
}
