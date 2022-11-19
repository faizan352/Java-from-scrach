package firstJavaProject;

import java.util.Scanner;

public class Arr2userinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Array size:");
		int size = sc.nextInt();
		
		System.out.println("Enter Array value:");
		int numbers[]= new int[size];
		
		for(int i=0; i<size; i++){   //loop for size input
			numbers[i]=sc.nextInt();	
		}
		
		System.out.println("Output of array is:");	
		for(int i=0; i<size; i++) {    //loop for output
			
			System.out.println(numbers[i]);
		}

	}

}
