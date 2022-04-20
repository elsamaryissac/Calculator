package com.elsa.calculator.calculator;

import java.util.*;

/**
 * 
 * @author LEGEND
 * This class will handle calculation.
 *
 */
public class Calculator {

	public static void main(String args[]) {
		int first_number;
		int second_number;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the value for first number:");
		first_number=s.nextInt();
		
		System.out.println("Enter the value for second number:");
		second_number=s.nextInt();
		
		System.out.println("Which operation do you want to perform?");
		System.out.println("1 - Addition");
		System.out.println("2 - Subtraction");
		System.out.println("3 - Multiplication");
		System.out.println("4 - Division");
		
		int op=s.nextInt();
		
		CalculatorFunctions cf = new CalculatorFunctions();
		
		if (op==1) {
			Double additionresult = cf.addition(first_number, second_number);
			System.out.println("Addition Result is "+additionresult);
		}
		
		else if (op==2) {
			Double subtractionresult = cf.subtraction(first_number, second_number);
			System.out.println("Subtraction Result is "+subtractionresult);
		}
		
		else if (op==3) {
			Double multiplicationresult = cf.multiplication(first_number, second_number);
			System.out.println("Multiplication Result is "+multiplicationresult);
		}
		
		else if (op==4) {
			Double divisionresult = cf.division(first_number, second_number);
			
			if (divisionresult == null) {
				
				System.out.println("Division by 0 is not possible.");
			} else {
				
				System.out.println("Division Result is "+divisionresult);
				
			}
		} else {
			System.out.println("Please select correct input!");
		}
			
	}
}
