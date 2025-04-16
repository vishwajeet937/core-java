package com.app.exceptionalHandeling;
public class UnCheckedException
{
	public static void main(String[] args)
	{
		int i[]=new int[3];
		i[0]=10;
		i[4]=50;
		int x=0;
		int y=1;
	//	int z=y/x;
		String name="vishwajeetkumar";
		String subName=name.substring(0,name.indexOf(" "));
		System.out.println("subName:"+subName);
	}

}

//checked exception
/*try {
    FileReader file = new FileReader("myfile.txt");
    // Perform file operations
} catch (IOException e) {
    // Handle the exception, e.g., by logging or reporting
}*/
