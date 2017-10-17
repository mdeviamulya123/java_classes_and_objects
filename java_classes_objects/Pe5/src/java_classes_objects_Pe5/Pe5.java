package java_classes_objects_Pe5;


import java.util.Scanner;


public class Pe5 {

	public static void main(String[] args)
	{
	int n;

	System.out.println("Enter the number ");

	Scanner in = new Scanner(System.in);
      n = in.nextInt();

//EvenNumTest pf = new EvenNumTest();


if ( IsEven(n) == true)
         System.out.println("Yes");

else
    System.out.println("No");
    
}



public static boolean IsEven(int n){


	 if(n%2==0)

	 {return true;}

	 else
{return false;}
}

}
