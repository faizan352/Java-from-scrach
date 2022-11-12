package firstJavaProject;

import java.util.Scanner;

public class Halfpyramid180 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=n-1; j++) {				
				System.out.print(" ");
			} // after closing this we can create again loop with j because in memory space has been clear after close the block 
			
			for(int j=1; j<=i; j++) {				
				System.out.print("*");
			}
			
			System.out.println();
		}

	}
}
