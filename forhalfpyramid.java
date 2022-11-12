package firstJavaProject;

import java.util.Scanner;

public class forhalfpyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner (System.in);
		
		int n= sc.nextInt();
		
		//int n=4;
	
		
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=i; j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
	}

}
