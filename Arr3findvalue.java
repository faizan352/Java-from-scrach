package firstJavaProject;

import java.util.Scanner;

public class Arr3findvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Array size:");
		int size = sc.nextInt();
		
		System.out.println("Enter Array value:");
		int numbers[]= new int[size];   //create object for store value 
		
		for(int i=0; i<size; i++){      //loop for size input
			numbers[i]=sc.nextInt();	// Enter array input value
		}
		
		
		System.out.println("Select value:");
		int x= sc.nextInt();
		
		for(int i=0; i<numbers.length; i++) {        //loop for output
			if(numbers[i]==x) {				
			System.out.println("X found at index:" +i);
			
			}
		}

	}

}
	
