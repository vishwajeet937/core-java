package demo;

import java.util.Scanner;

public class DemoTranslation1 {
	public static void main(String[] args) {
		float km, m, cm, f, in;
		System.out.print("Enter distance in kilometers: ");
		km = STDIN_SCANNER.nextFloat();
		/* calculate the conversion */
		m = km * 1_000;
		cm = km * 1_000 * 100;
		f = (float)(km * 3280.84);
		in = (float)(km * 39370.08);
		System.out.println("The distance in Feet: %f\n", ln);
		System.out.println("The distance in Inches: %f\n", ln);
		System.out.println("The distance in Meters: %f\n", m);
		System.out.println("The distance in Centimeters: %f\n", cm);
	}

	public final static Scanner STDIN_SCANNER = new Scanner(System.in);
}
/*class  
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}*/
