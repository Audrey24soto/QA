package com.qa.runner;

import java.util.Scanner;

public class Runner {

	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Welcome to the math of Unicorns! \n");
		
		int num1=0;
		int num2=0,
				option, ex;
		do
		{
			
		System.out.println("Enter your choice from the following menu:");
		System.out.println("============================");
		System.out.println("|   MENU Calculator Fun    |");
		System.out.println("============================");
		System.out.println("| Options:                 |");
		System.out.println("|        1. Add            |");
		System.out.println("|        2. Substract      |");
		System.out.println("|        3. Multiply       |");
		System.out.println("|        4. Divide         |");
		System.out.println("|        5. Exit           |");
		System.out.println("============================");
		option = scan.nextInt();
		System.out.println("Closing Unicorn Cal ...");
		if(option!=5) {
		     scan.close();
		
		     
		
		System.out.println("Enter the first number: ");
		num1 = scan.nextInt();
		System.out.println("Enter the second number: ");
		num2 = scan.nextInt();
		}
		else
			break;
		switch(option) {
		
		case 1:System.out.println("Addition: " + (num1 + num2));
		break;
		case 2:System.out.println("Subtraction: " + (num1 - num2));
		break;
		case 3:System.out.println("Multiplication: " + (num1 * num2));
		break;
		case 4: if(num2==0)
			System.out.println("Error!!! In Division denominator cannot be 0!");
		else {
		System.out.println("Division: " + (num1 / num2));}
		break;
		case 5: break;
		default: System.out.println("Invalid choice");
		}
		System.out.println("Do you want to continue?1.Yes 2.No");
		ex=scan.nextInt();
		}while(ex==1);


		System.out.println(" Bye unicorn Cal !");
		scan.close();
			
	     
	}     
}    
	     
	     
	     

		
		
		
		/*System.out.println("Hello World!");
		*/



