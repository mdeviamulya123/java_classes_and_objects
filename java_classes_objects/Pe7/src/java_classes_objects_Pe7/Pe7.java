package java_classes_objects_Pe7;



import java.util.Scanner;

public class Pe7 {

	public static void main(String[] args)
	{

int n, c, factorial=1;

	System.out.println("Enter the number ");

	Scanner in = new Scanner(System.in);
      n = in.nextInt();

      for (c = 1 ; c <= n ; c++  ){


factorial= factorial *c;

System.out.println("The factorial of " + c + "is" + factorial);

      }




	}
}