package com.elsa.calculator.calculator;

import java.util.Scanner;

public class Test {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		/*System.out.println("Enter the value for first number:");
		Double firstNumber=s.nextDouble();
		
		System.out.println("Enter the value for second number:");
		Double secondNumber=s.nextDouble();
		
		System.out.println("Which operation do you want to perform?");
		System.out.println("1 - Addition");
		System.out.println("2 - Subtraction");
		System.out.println("3 - Multiplication");
		System.out.println("4 - Division");
		
		int op=s.nextInt();*/
		
		String charactersymbol = "";
        System.out.println("Enter the line that has to be calculated");
        
        charactersymbol = s.nextLine();
        CheckForFunction.arithmeticfunctions(charactersymbol);
		
		//Calculator.process(firstNumber, secondNumber, op);
	}
}
