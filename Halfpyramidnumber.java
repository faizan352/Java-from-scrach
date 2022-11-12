package firstJavaProject;

import java.util.Scanner;

public class Halfpyramidnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner (System.in);
		
		int num = sc.nextInt();
		
		// int num=5;
		
		for(int i=1; i<=num; i++) {
			
			for(int j=1; j<=i; j++) {
				
				System.out.print(j);
			}
			
			System.out.println();
		}

	}

}
