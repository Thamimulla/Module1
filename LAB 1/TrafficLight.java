package lab;

import java.util.Scanner;

public class TrafficLight {

	public class DifferenceSquareSum {

	}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("choose the colour");
		String colour=sc.nextLine();
		
		
		if(colour.equals("red"))
		{
			System.out.println("stop");
		}
		else if(colour.equals("Yellow"))
		{
			System.out.println("ready");
		}
		else
		{
			System.out.println("go");
		}
	}
}
