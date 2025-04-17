import java.util.Scanner;
class FindEvenNum{

public static void main(String[] args){


Scanner sc=new Scanner(System.in);
System.out.println("Enter Range:: ");
int range=sc.nextInt();
int[] arr=new int[range];
int val=0;
for(int i=1;i<=range;i++){
  if(i%2==0){
   System.out.println("Even No is: "+i);
     
    arr[val]=i;
      val++;
}//if
}//for
System.out.println(java.util.Arrays.toString(arr));

}//main

}//class

