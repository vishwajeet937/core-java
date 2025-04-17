import java.util.*;

class MapProgram 
{
	public static void main(String[] args) 
	{
		Map map=new HashMap();
		map.put(1,"pen");
		map.put(2,"Book");
     Set set=map.entrySet();
	 Iterator itr=set.iterator();
	 while(itr.hasNext())
		{
			Map.Entry entry=(Map.Entry)itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
