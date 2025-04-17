Pattern Assignment

This is the pattern assignment here you need to paste the screenshot of the output using cmd-prompt by executing each program and also should give explanation and need to share to your mentors Mail-ID

1. What will be the output of this program?

 
For Example:

Output:

Explanation:


2. What will be the output of this program?

 
Output:

Explanation:


3. What will be the output of this program?

 


4. What will be the output of this program?

 




5. What will be the output of this program?

 


6. What will be the output of this program?

import java.util.Scanner;
public class Pattern6
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows to print the pattern ");
        int rows = scanner.nextInt();
        System.out.println("** Printing the pattern... **");
        for (int i = 1; i <= rows; i++)
        {
            for (int j = rows; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++)
            {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}



7. What will be the output of this program?

 


8. What will be the output of this program?

import java.util.Scanner;
public class Pattern8
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows to print the pattern ");
        int rows = scanner.nextInt(); 
        System.out.println("** Printing the pattern... **"); 
        for (int i = rows; i >= 1; i--)
        {
            for (int j = rows; j >= i; j--)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}



9. What will be the output of this program?

 



10. What will be the output of this program?

import java.util.Scanner;
public class Pattern10
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows to print the pattern ");
        int rows = scanner.nextInt();
        int k = 1; 
        System.out.println("** Printing the pattern... **"); 
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }
}



11. What will be the output of this program?

 



12. What will be the output of this program?

import java.util.Scanner;
public class Pattern12
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows to print the pattern ");
        int rows = scanner.nextInt();
        System.out.println("** Printing the pattern... **");
        for (int i = 1; i <= rows; i++)
        {
            int temp = i;
            for (int j = i; j >= 1; j--)
            {
                System.out.print(temp + " ");
                temp = temp + rows;
            }
            System.out.println();
        }
    }
}



13. What will be the output of this program?

 





14. What will be the output of this program?

 



15. What will be the output of this program?

 




16. What will be the output of this program?

 


17. What will be the output of this program?

import java.util.Scanner;
public class Pattern17
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows to print the pattern ");
        int rows = scanner.nextInt();
        System.out.println("** Printing the pattern... **");

        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }

            for (int k = i; k <= rows; k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }
        for (int i = rows; i >= 1; i--)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }

            for (int k = i; k <= rows; k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}



18. What will be the output of this program?
package com.javainterviewpoint;
import java.util.Scanner;
public class Pattern18
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows to print the pattern ");
        int rows = scanner.nextInt();
        System.out.println("** Printing the pattern... **");
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }

            for (int k = i; k <= rows; k++)
            {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        for (int i = rows; i >= 1; i--)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }

            for (int k = i; k <= rows; k++)
            {
                System.out.print(k + " ");
            }
            System.out.println();
        }

    }
}


 
19. What will be the output of this program?

 


20. What will be the output of this program?

import java.util.Scanner;
public class Pattern20
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows to print the pattern ");
        int rows = scanner.nextInt();
        System.out.println("** Printing the pattern... **");
        for (int i = 1; i <= rows; i++)
        {
            for (int j = rows; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++)
            {
                System.out.print(k);
            }
            for (int l = i - 1; l >= 1; l--)
            {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}



21. What will be the output of this program?

 





22. What will be the output of this program?

 



23. What will be the output of this program?

 



24. What will be the output of this program?

 


25. What will be the output of this program?

 


26. What will be the output of this program?

import java.util.Scanner;
public class Pattern26
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows to print the pattern ");
        int rows = scanner.nextInt(); 
        System.out.println("** Printing the pattern... **"); 
        for (int i = rows; i >= 1; i--)
        {
            for (int j = i; j < rows; j++)
            {
                System.out.print(j + " ");
            }

            for (int k = rows - i; k < rows; k++)
            {
                System.out.print(5 + " ");
            }
            System.out.println();
        }
    }
}
27. What will be the output of this program?

 


28. What will be the output of this program?

import java.util.Scanner;
public class Pattern28
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows to print the pattern ");
        int rows = scanner.nextInt();
        System.out.println("** Printing the pattern... **");
        int temp = 1;
        for(int i=1; i<=rows/2+1; i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(temp*j+" ");
            }
            System.out.println();
            temp++;
        }
        for(int i=1; i<=rows/2; i++)
        {
            for(int j=1;j<=rows/2+1-i;j++)
            {
                System.out.print(temp*j+" ");
            }
            System.out.println();
            temp++;
        }
    }
}



29. What will be the output of this program?

import java.util.Scanner;
public class Pattern29
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows to print the pattern ");
        int rows = scanner.nextInt();
        System.out.println("** Printing the pattern... **");
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                if (j % 2 == 0)
                {
                    System.out.print(1 + j * rows - (j - 1) * j / 2 + i - j + " ");
                } else
                {
                    System.out.print(1 + j * rows - (j - 1) * j / 2 + rows - 1 - i + " ");
                }
            }
         System.out.println();
        }
    }
}
30. What will be the output of this program?

 


31. What will be the output of this program?

import java.util.Scanner;
public class Pattern31
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows to print the pattern ");
        int rows = scanner.nextInt();
        int temp = 0;
        System.out.println("** Printing the pattern... **");
        for (int i = rows; i >= 1; i--)
        {
            for (int j = rows ; j >= i; j--)
            {
                System.out.print(j + " ");
                temp =j;
            }
            for (int k = rows - i+1; k < rows; k++)
            {
                System.out.print(temp + " ");
            }
            System.out.println();
        }
    }
}



32. What will be the output of this program?

 


33. What will be the output of this program?

import java.util.Scanner;
public class Pattern33
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows to print the pattern ");
        int rows = scanner.nextInt(); 
        System.out.println("** Printing the pattern... **");
        for (int i = rows; i >= 1; i--)
        {
            for (int j = i; j <= rows; j++)
            {
                System.out.print(j + " ");
            }
            for (int k = rows-1; k >= i; k--)
            {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        for (int i = 2; i <= rows; i++)
        {
            for (int j = i; j <= rows; j++)
            {
                System.out.print(j + " ");
            }
            for (int k = rows-1; k >= i; k--)
            {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}



34. What will be the output of this program?

import java.util.Scanner;
public class Pattern34
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows to print the pattern ");
        int rows = scanner.nextInt(); 
        System.out.println("** Printing the pattern... **"); 
        for (int i = 1; i <= rows; i++)
        {
            int j = i;
            
            for (int k = 1; k <= rows; k++) 
            { 
                System.out.print(j + " "); 
                j++; 
                if (j > rows)
                    j = 1;
            }
            System.out.println();
        }
        scanner.close();
    }
}
35. What will be the output of this program?

 


36. What will be the output of this program?

import java.util.Scanner;
public class Pattern36
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows to print the pattern ");
        int rows = scanner.nextInt();
        System.out.println("** Printing the pattern... **"); 
        for (int i = 1; i <= rows; i++)
        {
            int j = (i * 2) - 1;

            for (int k = 1; k <= rows; k++) 
            { 
                System.out.print(j + " "); 
                j += 2; 
                if (j > (rows * 2) - 1)
                    j = 1;
            }
            System.out.println();
        }
        scanner.close();
    }
}



37. What will be the output of this program?

 


38. What will be the output of this program?

import java.util.Scanner;
public class Pattern38
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows to print the pattern ");
        int rows = scanner.nextInt(); 
        System.out.println("** Printing the pattern... **");
        
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
            
            for (int j= i*2 ; j < rows*2; j++) 
            { 
                System.out.print(" "); 
            } 
            for (int l = i; l >= 1; l--)
            {
                System.out.print(l);
            }
            System.out.println();
        }
        scanner.close();
    }
}



39. What will be the output of this program?

import java.util.Scanner;
public class Pattern39
{
    public static void main(String[] args) 
    { 
        int currentRow = 1;
        int counter = 1; 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows to print the pattern ");
        int rows = scanner.nextInt(); 
        System.out.println("** Printing the pattern... **");
        for (int i=1; i<= rows; i++)
        {
            if (i % 2 == 0) 
            {
                int reverse = currentRow + counter - 1;
                for (int j = 0; j<i; j++)
                {
                    System.out.print(reverse--  +" ");
                    counter++;
                }
            }
            else
            {
                for (int j = 1; j<=i; j++)
                {
                    System.out.print(counter  +" ");
                    counter++;
                }
            }
            System.out.println();
            currentRow++;
        }
    }
}



40. What will be the output of this program?

import java.util.Scanner;
public class Pattern40
{
    public static void main(String[] args) 
    { 
        int currentRow = 1;
        int counter = 1;
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter the number of rows to print the pattern ");
        int rows = scanner.nextInt(); 
        System.out.println("** Printing the pattern... **");
        for (int i=1; i<= rows; i++)
        {
            if (i % 2 == 0) 
            {
                for (int j = 1; j<=i; j++)
                {
                    System.out.print(counter  +" ");
                    counter++;
                }
            }
            else
            {
                int reverse = currentRow + counter - 1;
                for (int j = 0; j<i; j++)
                {
                    System.out.print(reverse--  +" ");
                    counter++;
                }
            }
            System.out.println();
            currentRow++;
        }
    }
}



41. What will be the output of this program?

 


42. What will be the output of this program?

import java.util.Scanner;
public class Pattern42
{
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of rows to print the pattern ");
            int rows = scanner.nextInt(); 
            System.out.println("** Printing the pattern... **");
            
            for (int i = rows; i >= 1; i--)
            {
                for (int j = 1; j <= i; j++)
                {
                    System.out.print(j);
                } 
                for (int j= i*2 ; j < rows*2-1; j++) 
                { 
                    System.out.print(" "); 
                } 
                for (int l = i; l >= 1; l--)
                {
                    if(l!=rows)
                        System.out.print(l);
                }
                System.out.println();
            }
            scanner.close();
        }
}



43. What will be the output of this program?

import java.util.Scanner;
public class Pattern43
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows to print the pattern ");
        int rows = scanner.nextInt();
        System.out.println("** Printing the pattern... **");
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            for (int k = i - 1; k >= 1; k--)
            {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        for (int i = rows-1; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            for (int k = i - 1; k >= 1; k--)
            {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
44. What will be the output of this program?

import java.util.Scanner;
public class Pattern44
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows to print the pattern ");
        int rows = scanner.nextInt();
        System.out.println("** Printing the pattern... **");
        for (int i = 1; i <= rows; i++)
        {
            int temp = i;
            for (int j = 1; j <= i; j++)
            {
                System.out.print(temp + " ");
                temp = temp + 1;
            }
            temp = temp - 2;
            for (int k = i - 1; k >= 1; k--)
            {
                System.out.print(temp + " ");
                temp = temp - 1;
            }
            System.out.println();
        }
        for (int i = rows - 1; i >= 1; i--)
        {
            int temp = i;
            for (int j = 1; j <= i; j++)
            {
                System.out.print(temp + " ");
                temp = temp + 1;
            }
            temp = temp - 2;
            for (int k = i - 1; k >= 1; k--)
            {
                System.out.print(temp + " ");
                temp = temp - 1;
            }
            System.out.println();
        }
    }
}



45. What will be the output of this program?

 

46. What will be the output of this program?

import java.util.Scanner;
public class Pattern46
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows to print the pattern ");
        int rows = scanner.nextInt();
        System.out.println("** Printing the pattern... **");
        for (int i = 1; i <= rows; i++)
        {
            for (int k = i; k >= 1; k--)
            {
                System.out.print(k + " ");
            }
            for (int l = 2; l <= i; l++)
            {
                System.out.print(l + " ");
            }
            System.out.println();
        }

        for (int i = rows - 1; i >= 1; i--)
        {
            for (int k = i; k >= 1; k--)
            {
                System.out.print(k + " ");
            }
            for (int l = 2; l <= i; l++)
            {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }
}



47. What will be the output of this program?

import java.util.Scanner;
public class Pattern47
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows to print the pattern ");
        int rows = scanner.nextInt();
        System.out.println("** Printing the pattern... **");
        for (int i = 1; i <= rows; i++)
        {
            for (int j = rows; j > i; j--)
            {
                System.out.print(" ");
            }
            int val1 = 1;
            for (int k = 1; k <= i; k++)
            {

                System.out.print(val1 + " ");
                val1 = val1 * 2;
            }
            val1 = val1 / 4;
            for (int l = i - 1; l >= 1; l--)
            {
                System.out.print(val1 + " ");
                val1 = val1 / 2;
            }
            System.out.println();
        }
    }
}



48. What will be the output of this program?

 


49. What will be the output of this program?

import java.util.Scanner;
public class Pattern49
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows to print the pattern ");
        int rows = scanner.nextInt();
        System.out.println("** Printing the pattern... **");
        int temp = 2;
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                while (!isPrime(temp))
                {
                    temp++;
                }
                System.out.print(temp + " ");
                temp++;
            }
            System.out.println();
        }
    }

    public static boolean isPrime(int num)
    {
        boolean flag = false;
        for (int k = 2; k <= num / 2; k++)
        {

            if (num % k == 0)
            {
                flag = true;
                break;
            }
        }
        if (flag)
            return false;
        return true;
    }
}



50. What will be the output of this program?

import java.util.Scanner;
public class Pattern50
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows to print the pattern ");
		int rows = scanner.nextInt();
		System.out.println("** Printing the pattern... **");
		System.out.println("0");
		for (int i = rows; i >= 1; i--)
		{
			for (int j = i; j <= rows; j++) { System.out.print(j); } System.out.print("0"); for (int k = rows; k >= i; k--)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}
}



51. What will be the output of this program?

 


52. What will be the output of this program?

import java.util.Scanner;
public class Pattern52
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows to print the pattern ");
		int rows = scanner.nextInt();
		System.out.println("** Printing the pattern... **");
		int temp = 1;
		for (int i = 1; i <= rows; i++) { for (int l = rows; l > i; l--)
			{
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++)
			{
				System.out.print(temp + " ");
				temp++;
			}
			int temp1 = temp - 1;
			for (int k = 2; k <= i; k++)
			{
				System.out.print(--temp1 + " ");
			}
			System.out.println();
		}
	}
}



53. What will be the output of this program?

import java.util.Scanner;

public class Pattern53
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows to print the pattern ");
		int rows = scanner.nextInt();
		int temp = 1;
		System.out.println("** Printing the pattern... **");

		for (int i = 1; i <= rows; i++) { for (int l = rows; l > i; l--)
			{
				System.out.print(" ");
			}
			for (int j = 1; j <= (i * 2 - 1); j++)
			{
				System.out.print((int) Math.pow(temp, 2) + " ");
				temp++;
			}
			System.out.println();
		}
	}
}



54. What will be the output of this program?

import java.util.Scanner;
public class Pattern54
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows to print the pattern ");
		int rows = scanner.nextInt();
		System.out.println("** Printing the pattern... **");
		int temp = 1;
		for (int i = 1; i <= rows; i++) { for (int l = rows; l > i; l--)
			{
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++)
			{
				if (temp < 10)
				{
					System.out.print(temp + " ");
					temp++;
				} else
				{
					temp = 0;
					System.out.print(temp + " ");
					temp++;
				}
			}
			int temp1 = temp - 1;
			for (int k = 2; k <= i; k++)
			{
				if (temp1 == 0)
				{
					temp1 = 10;
					System.out.print(--temp1 + " ");
				} else
				{
					System.out.print(--temp1 + " ");
				}
			}
			System.out.println();
		}
	}
}



55. What will be the output of this program?

import java.util.Scanner;
public class Pattern55
{
	public static void main(String[] args)
	{
		int currentRow = 1;
		int counter = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows to print the pattern ");
		int rows = scanner.nextInt();

		System.out.println("** Printing the pattern... **");
		for (int i = 1; i <= rows; i++) { for (int l = rows; l > i; l--)
			{
				System.out.print(" ");
			}
			if (i % 2 == 0)
			{
				int reverse = currentRow + counter - 1;
				for (int j = 0; j < i; j++)
				{
					System.out.print(reverse-- + " ");
					counter++;
				}
			} else
			{
				for (int j = 1; j <= i; j++)
				{
					System.out.print(counter + " ");
					counter++;
				}
			}
			System.out.println();
			currentRow++;
		}
	}
}



56. What will be the output of this program?

 


57. What will be the output of this program?

import java.util.Scanner;
public class Pattern57
{
	public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows to print the pattern ");
        int rows = scanner.nextInt();
        System.out.println("** Printing the pattern... **");
        for (int i = 0; i < rows; i++)
        {
        	int num = 1;
            for (int j = 0; j <= i; j++)
            {
            	if(i ==0 || j ==0)
            		num = 1;
            	else
            		num = num * (i - j + 1)/ j;
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}



58. What will be the output of this program?

 
