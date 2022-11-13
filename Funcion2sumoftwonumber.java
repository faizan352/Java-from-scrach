package firstJavaProject;

import java.util.Scanner;

public class Funcion2sumoftwonumber {
	
	
	public static int calculateSum(int a , int b) {
		
		int sum= a+b;
		
		return sum;
	}

	public static void main(String[]args) {   //main function
		
		Scanner sc = new Scanner(System.in);
		
		int a= sc.nextInt();
		
		int b= sc.nextInt();
		
		int sum = calculateSum(a, b);
		System.out.println("sum of two number is: "+ sum );
		
		
		
		
		
		
		
		
	}

}
