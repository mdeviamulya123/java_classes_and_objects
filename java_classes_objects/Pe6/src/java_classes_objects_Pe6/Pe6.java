package java_classes_objects_Pe6;



import java.util.Scanner;

public class Pe6 {

	public static void main(String[] args){

int n,i, sum=0;



      System.out.println("Enter the number of students");
      Scanner in = new Scanner(System.in);
      n = in.nextInt();

      int a[]=new int[n];

for( i=0;i<a.length;i++){
System.out.println("Enter the grade of student" + i);
     
      a[i] = in.nextInt();

}



for(i=0;i<a.length;i++){

      sum= sum + a[i];


}

double average= sum/n;
System.out.println("" + average);

int maxValue = a[0];
  for(i=1;i < a.length;i++){
    if(a[i] > maxValue){
	  maxValue = a[i];
	}
  }
  System.out.println("maximum value is " + maxValue);


int minValue = a[0];
  for(i=1;i < a.length;i++){
    if(a[i] < minValue){
	  minValue = a[i];
	}
  }
  System.out.println("minimum value is " + minValue);






}

	}

	


