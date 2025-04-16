package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class Check 
{
  public static void main(String[] args) 
  {
	ArrayList a=new ArrayList();
	a.add(10);
	a.add(10);
	a.add(30);
	a.add(40);
	a.add(50);
	System.out.println(a);
	System.out.println(a.get(1));
	
    LinkedList l=new LinkedList();
    l.add(32);
    l.add(42);
    l.add(52);
    l.add(62);
    System.out.println(l);
    System.out.println(l.get(2));
    
    Vector v=new Vector();
    v.add(1);
    v.add(12);
    v.add(13);
    v.add(14);
    v.add(15);
    System.out.println(v);
    System.out.println(v.get(4));
    
    Stack s=new Stack();
    s.add(43);
    s.add(44);
    s.add(45);
    s.add(46);
    s.add(47);
    System.out.println(s);
    System.out.println(s.get(2));
    
     HashSet h=new HashSet();
     h.add(5);
     h.add(5);
     h.add(6);
     h.add(7);
     h.add(8);
     System.out.println(h);
     
     HashMap h1=new HashMap();
     h1.put(110,"vishwajeet");
     h1.put(120,"sachin");
     h1.put(130,"sonu");
     System.out.println(h1);
     
     LinkedHashMap l1=new LinkedHashMap();
     l1.put(110,"vishwajeet");
     l1.put(110,"sachin");
     l1.put(130,"sonu");
     System.out.println(l1);  
    }
}
