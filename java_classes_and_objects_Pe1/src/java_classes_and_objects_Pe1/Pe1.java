package java_classes_and_objects_Pe1;



import java.util.Scanner;

class Pe1
{
   public static void main(String args[])
   {
      int n, reverse = 0, r;
 
      System.out.println("Enter the number to reverse");
      Scanner in = new Scanner(System.in);
      n = in.nextInt();
 
      while( n != 0 )
      {
          reverse = reverse * 10;
          reverse = reverse + n%10;
          n = n/10;

         
      }
 
 System.out.println("reverse number is " +reverse);

 if(n == reverse){

System.out.println(" Its a palindrome");

 }
 else{

System.out.println("Not a palindrome");

 }
      
   }
}