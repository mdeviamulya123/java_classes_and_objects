package java_classes_objects_Pe2;


import java.util.Scanner;

class Pe2
{
   public static void main(String args[])
   {

   	
      int n;
      System.out.println("Enter an integer to check if it is power of 4 ");
      Scanner in = new Scanner(System.in);
      n = in.nextInt();

      Pe2 pf = new Pe2();
      if ( pf.power(n) == true)
         {System.out.println("Yes");}
      else
         {System.out.println("No");}
    
   }




 public boolean power(int n ){
  if(n == 0)
    return false;
  while(n != 1)
  {    
   if(n%4 != 0)
      return false ;
    n = n/4;      
  }
  return true;


}


}
