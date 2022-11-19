package firstJavaProject;

import java.util.Scanner;

public class Arr2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter row size:");
		 int rows= sc.nextInt();
		 System.out.println("Enter column size:");
		 int cols= sc.nextInt();
		 
		 int[][] numbers = new int[rows][cols];   //created object for store value 
		 
		 //input rows and cols
		 System.out.println("Enter your rows and cols value:");
		 for(int i=0; i<rows; i++) {			 
			 for(int j=0; j<cols; j++) {	
				 
				 numbers[i][j]=sc.nextInt();	// Enter  input value
			 }			 
		 } 
		 
		 //output
		 System.out.println("Your Matrix is:");
		 for(int i=0; i<rows; i++) {
			 for(int j=0; j<cols; j++) {
				 System.out.print(numbers[i][j]+ " ");
			 }
			 
			 System.out.println();
		 }
			
	}

}
