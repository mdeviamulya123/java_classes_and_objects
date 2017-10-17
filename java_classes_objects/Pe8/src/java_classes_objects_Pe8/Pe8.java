package java_classes_objects_Pe8;


import java.util.Scanner;

public class Pe8 {

	public static void main(String[] args)
	{

long n, factorial=1;
int c;

	System.out.println("Enter the number ");

	Scanner in = new Scanner(System.in);
      n = in.nextInt();

      for (c = 1 ; c <= n ; c++  ){


factorial= factorial *c;


System.out.println("The factorial of " + c + "is" + factorial);

      }




	}
}