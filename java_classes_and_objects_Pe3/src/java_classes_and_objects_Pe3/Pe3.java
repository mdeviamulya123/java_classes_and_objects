package java_classes_and_objects_Pe3;

import java.util.*;

class member{
	String name;
	int age;
	int salary;
	
}

public class Pe3 {
	public static void main(String[] args)
	{
		member m=new member();
		
		Scanner scan = new Scanner(System.in);  
		
		System.out.println("Enter name: ");
		String name = scan.nextLine();
		
		System.out.println("Enter age: ");
		int age = scan.nextInt();
		
		
		
		System.out.println("Enter salary: ");
		int sal = scan.nextInt();
		
		m.name=name;
		m.age=age;
		m.salary=sal;
		
		System.out.println("Name: "+m.name);
		System.out.println("Age: "+m.age);
		System.out.println("Salary: "+m.salary);
	}

}
