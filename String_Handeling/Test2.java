import java.util.Scanner;

 class Test2
{
static boolean flag = true;
static int temp=0;
void program() {
Scanner sc = new Scanner(System.in);

int a = 0;
int b = 0;
if (flag) {
try {

System.out.println("Enter the first Number");
a = sc.nextInt();
temp=a;
} catch (Exception e) {
program();
}
}
try {
System.out.println("Enter the Second Value");
flag = false;
b = sc.nextInt();

System.out.println("the result is :" + (temp + b));
} catch (Exception exp) {

System.out.println("Please Enter Numbers only");
program();

}
}

public static void main(String[] args) {
Test2 p1 = new Test2();
p1.program();
}
}
