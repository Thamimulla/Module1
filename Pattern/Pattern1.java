package Pattern;

import java.util.Scanner;

public class Pattern1 {
	
	 public static void main(String args[]) 
	    { 
	    	int n ,space = 1;
	    	System.out.print("Enter the number of rows: ");
	    	Scanner s = new Scanner(System.in);
	    	n = s.nextInt();
	    	
	        for (int i=0; i<n; i++) 
	            { 
	                System.out.print(" "); 
	            
	            for (int j=0; j<=i; j++ ) 
	            { 
	                System.out.print(" * "); 
	            } 
	  
	            System.out.println(); 
	        } 
	    
	    }
	   
	}
