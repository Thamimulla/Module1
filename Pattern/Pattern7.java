package Pattern;

public class Pattern7 {
	 static void display(int n) 

	    { 

	        int i, j, k; 

	        for (i = 1; i <= n; i++) { 

	            for (j = 1, k = i; j <= i; j++,k++)
	            { 

	                if (k % 2 == 0) { 

	                    // to display the numbers 

	                    System.out.print(j); 
	       

	                } 

	                else { 

	          

	                    System.out.print(" ");

	                } 

	            } 

	            System.out.print("\n");

	        } 

	    } 



	    public static void main(String[] args) 

	    { 

	       
	        int n = 15; 



	        display(n); 

	    } 


}
