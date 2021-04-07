package lab;
import java.util.Scanner;

public class CheckNumber {
	
	public static void main(String[] args) {

	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter a Number n");
	    int n = in.nextInt();
	    in.close();

	    if (isPowerOfTwo(n)) {
	      System.out.println("yes");
	    } else {
	      System.out.printf("no");
	    }
	  }

	  private static boolean isPowerOfTwo(int n) {

	    if (n % 2 != 0) {
	      return false;
	    } else {

	      for (int i = 0; i <= n; i++) {

	        if (Math.pow(2, i) == n) return true;
	      }
	    }
	    return false;
	  }
	}



