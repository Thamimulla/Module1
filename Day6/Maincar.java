package Day6;

import java.util.Scanner;

public class Maincar {
public static void main(String[] args) {
	
		Scanner input=new Scanner(System.in);
		Car [] cars= new Car[3];
		String temp;
		
		for(int i=0; i <cars.length;i++) {
			System.out.println("enter the cars");	
			temp=input.next();
			cars [i]=new Car();
			cars[i].setCarName(temp);
		}
		for(int i=0; i <cars.length;i++) {
			System.out.println("car name "+ cars[i].getCarName());
			
		}

		Scanner input1=new Scanner(System.in);
		String temp1;
		
		for(int i=0; i <cars.length;i++) {
			System.out.println("enter the colour");	
			temp=input.next();
			cars [i]=new Car();
			cars[i].setCarName(temp);
		}
		for(int i=0; i <cars.length;i++) {
			System.out.println("colour is "+ cars[i].getCarPower());
			
	}
}}

