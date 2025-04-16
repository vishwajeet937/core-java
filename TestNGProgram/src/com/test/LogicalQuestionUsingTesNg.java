package com.test;
import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.testng.annotations.Test;
import org.testng.internal.junit.ArrayAsserts;
public class LogicalQuestionUsingTesNg
{
    @Test
	public static void smallestTest()
	{
	int smallest=0;
    smallest=SmallestLargest.smallest(new int[]{1,2,3});
    assertEquals(smallest,1);
	}
	
	@Test
	public static void largestTest()
	{
		int largest=0;
	    largest=SmallestLargest.largest(new int[]{4,5,6});
        assertEquals(largest,6);
	}
	@Test
	public static void oddTest()
	{
		int odd=0;
		odd=SmallestLargest.odd(new int[]{21,5,4,54,19});
		assertEquals(odd,19);
	}
	@Test
	public static void linearSearch()
	{
		int numberSearch=0;
		numberSearch=SmallestLargest.linearSearch(new int[]{1,2,23,4,5,6,7,8,9});
		assertEquals(numberSearch,23);
	}
	//@Test
	/*public static void reverse()
	{
		String name="sonu";
		name=SmallestLargest.reverse(new String[]{"fwe","fwe"});
		assertEquals("wqd","wqd");
	}*/
	@Test
	public static void evenTest()
	{
		int even=0;
		even=SmallestLargest.even(new int[]{23,3,45,22,33,44});
		assertEquals(even,44);
	}
	@Test
	public static void vowelTest()
	{
		ArrayList<Character> al1=new ArrayList<Character>();
		ArrayList<Character> al2= SmallestLargest.vowel("adade");
		al1.add('a');
		al1.add('a');
		al1.add('e');
		//char vowel=1;
		for(int i=0;i<al1.size();i++)
		{
			assertEquals(al1.get(i),al2.get(i));
			//if(arr[i]==)
		}
		//assertEquals(vowel,'a');
	}
	@Test
	public static void consTest()
	{
		ArrayList<Character> al1=new ArrayList<Character>();
		ArrayList<Character> al2=SmallestLargest.consonent("qwertik");
		al1.add('q');
		al1.add('w');
		al1.add('r');
		al1.add('t');
		al1.add('k');
		for (int i=0;i<al1.size();i++)
		{
			assertEquals(al1.get(i),al2.get(i));
		}
	}
	/*@Test
	public static void zeroTest()
	{
		ArrayList<Integer> al1=new ArrayList<Integer>();
		al1.add(1);
		//al1.add(1);
		//al1.add(0);
		//al1.add(1);
		ArrayList<Integer> al2=SmallestLargest.zero(al1);
		
		ArrayList<Integer> al3=new ArrayList<Integer>();
        System.out.println("gg"+al2);
		al3.add(0);
		//al3.add(0);
		//al3.add(1);
		//al3.add(1);
		for (int i=0;i<al1.size();i++)
		{
		assertEquals(al3.get(i),al2.get(i));
		}
	}*/
	@Test
	public static void smallestTest1()
	{
		ArrayList<Integer> al1=new ArrayList<Integer>();
		al1.add(2);
		al1.add(3);
		al1.add(4);
		al1.add(5);
		ArrayList<Integer> al2=EvenOddUsingCollection.odd(al1);
		ArrayList<Integer> al3=new ArrayList<Integer>();
		//System.out.println("smallest1"+al2);
		//al3.add(3);
		al3.add(2);
		al3.add(4);
		
		for (int i=0;i<al2.size();i++)
		{
			assertEquals(al3.get(i),al2.get(i));
		}
	}
	@Test
	public static void duplicateTest()
	{
		 LinkedHashSet<Character> s1=new LinkedHashSet<Character>();
		Set<Character> s2=RemoveDuplicateCharacterProgram.duplicate("aba");
		//System.out.println("duplicate."+s2);
		s1.add('a');
		s1.add('b');
		s1.add('a');
		Iterator itr1=s1.iterator();
		Iterator itr2=s2.iterator();
		while(itr1.hasNext()&&itr2.hasNext())
			assertEquals(itr1.next(),itr2.next());
			
			//System.out.print(iterator.next()+" ");
		//System.out.println();
		/*for (int i=0;i<s1.size();i++)
		{
			assertEquals(s2.i(i),s1.get(i));
		}*/
	} 
	@Test
	public static void reverseStringTestNg()
	{
		LinkedHashSet<Character> s1=new LinkedHashSet<Character>();
		s1.add('r');
		s1.add('a');
		s1.add('m');
		Set<Character> s2=ReverseString.reverseString("ram");
		Set<Integer> s3=new LinkedHashSet<Integer>();
		//System.out.println("Reverse"+s2);
		s2.add('m');
		s2.add('a');
		s2.add('r');
		Iterator itr1=s2.iterator();
		Iterator itr2=s3.iterator();
		while(itr1.hasNext()&&itr2.hasNext())
			assertEquals(itr1.next(),itr2.next());
	}
	@Test
	public static void postiveNumberTestNg()
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(1);
		a1.add(3);
		a1.add(-2);
		a1.add(2);
		ArrayList<Integer> a2=PostiveNegative.postive(a1);
		ArrayList<Integer> a3=new ArrayList<Integer>();
		//System.out.println("postive:"+a2);
		a3.add(1);
		a3.add(3);
		a3.add(2);
		for(int i=0;i<a2.size();i++)
		{
			assertEquals(a3.get(i),a2.get(i));
		}		
	}
	@Test 
	public static void repetedCharacterTestNg()
	{
		LinkedHashSet<Character> s1=new LinkedHashSet<Character>();
		s1.add('w');
		s1.add('e');
		s1.add('w');
		s1.add('e');
		s1.add('k');
		Set<Character> s3=FindFirstRepetedCharacter.nonRepted("wewek");
		Set<Character> s2=new LinkedHashSet<Character>();
		//System.out.println("n:"+s3);
		s2.add('w');
		//System.out.println("n1:"+s2);
		Iterator itr1=s3.iterator();
		Iterator itr2=s2.iterator();
		while(itr1.hasNext()&&itr2.hasNext())
			assertEquals(itr1.next(),itr2.next());
			
	}
	@Test
	public static void countOccurrences()
	{
		/*ArrayList<Character> al1=new ArrayList<Character>();
		al1.add('a');
		al1.add('b');
		al1.add('a');
		al1.add('a');
		al1.add('a');*/
		ArrayList<Character> al2=CountOccurrencesCharacter.count("abaaa");
	    ArrayList<Character> al3=new ArrayList<Character>();
	   // System.out.println("count:"+al2);
	    al3.add('a');
	    al3.add('a');
	    al3.add('a');
	    al3.add('a');
	  
	    for (int i=0;i<al2.size();i++)
		{
			assertEquals(al3.get(i),al2.get(i));
		}
	}
	//@Test
	//public static void palindrome()
	//{
		/*ArrayList<Integer> al3=new ArrayList<Integer>();
		al3.add(1);
		al3.add(2);
		al3.add(1);*/
		/*ArrayList<Integer> al1=PalindromeNumber.palindrome1(new int[]{121});
		ArrayList<Integer> al2=new ArrayList<Integer>();
		//System.out.println("palindrome:"+al1);
		al2.add(1);
		al2.add(2);
		al2.add(1);
		for (int i=0;i<al1.size();i++)
		{
			assertEquals(al2.get(i),al1.get(i));
		}
	}*/
	/*public static void palindromeStringTest()
	{
		String nam="";
		nam=PalindromeString.palindrome(new String[] {"zxz","zxz"});
	}*/
	@Test
	public static void factorialTest()
	{
		int fact=1;
		fact=SmallestLargest.factorial(new int[]{5,4,3,2,1});
		assertEquals(fact,1);
	}
	@Test
	public static void accendingTest()
	{
	    int[] accending=null;
		accending=AccendingOrder.accendingOrder(new int[]{6,5,1,2});
		ArrayAsserts.assertArrayEquals(accending,new int[] {1,2,5,6});
		//System.out.println(Arrays.toString(accending));
	}
	@Test
	public static void decendingTest()
	{
		int[] decending=null;
		decending=DecendingOrder.decending(new int[] {3,4,5,2,8,7});
		ArrayAsserts.assertArrayEquals(decending,new int[] {8,7,5,4,3,2});
		//System.out.println(Arrays.toString(decending));
	}
	@Test
	  public void swapTest()
	{
		  ArrayList list1=new ArrayList();
		  list1.add("vishwajeet");
		  list1.add("kumar");
		  
		  ArrayList list2=SwapProgram.swap("kumar","vishwajeet");
		  assertEquals(list1,list2);
	  }
	@Test
	  public void equalsTests() 
	{
		  ArrayList list=new ArrayList();
		  list.add("vishw");
		  list.add("ajeet");
		  
		  ArrayList list2=EqualsProgram.equalMethods("vishwajeet", 2);
		  
		  assertEquals(list,list2);
	  }

		  @Test
		  public void primeFactorTest()
		  {
			  ArrayList al1=new ArrayList();
			  al1.add(2);
			  al1.add(5);
			  ArrayList al2=PrimeFactorProgram.primeFactors(10);
			  System.out.println("pf:"+al2);
			  assertEquals(al1,al2);
		  }
}

