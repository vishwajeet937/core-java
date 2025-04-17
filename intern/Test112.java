class Test112
{
public static void main(String[] args)
{
    String name="vishwajeet";
	
      int valCount=0;
     for(int i=0; i<name.length;i++)
     {
       for(int j=i+1;j<name.length;j++)
        {
              valCount=name[j];
        }
     }
System.out.println(valCount);
}
}
