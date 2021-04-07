package lab;

import java.util.Scanner;

public class Cube {
	public static void main(String[] args) {
			
	Scanner sc=new Scanner(System.in);	
	System.out.println("enter the number n");
	
	int n=sc.nextInt();
	 int cube =(int) n*n*n;
	 System.out.println("Cube of the number n is "+cube);
	
	}
   
}
