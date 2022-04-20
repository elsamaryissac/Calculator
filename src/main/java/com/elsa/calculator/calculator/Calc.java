package com.elsa.calculator.calculator;

import java.util.*;

/**
 * 
 * @author LEGEND
 * This class will handle calculation.
 *
 */
public class Calc {

	public static void main(String args[]) {
		int num1;
		int num2;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the value for num1");
		num1=s.nextInt();
		
		System.out.println("Enter the value for num2");
		num2=s.nextInt();
		
		System.out.println("Which operation do you want to perform?");
		System.out.println("1 - Addition");
		System.out.println("2 - Subtraction");
		System.out.println("3 - Multiplication");
		System.out.println("4 - Division");
		
		int op=s.nextInt();
		
		CalcFunctions cf = new CalcFunctions();
		
		if(op==1) {
			int additionresult = cf.add(num1, num2);
			System.out.println("Addition Result is "+additionresult);
		}
		
		else if(op==2) {
			int subtractionresult = cf.sub(num1, num2);
			System.out.println("Subtraction Result is "+subtractionresult);
		}
		
		else if(op==3) {
			int multiplicationresult = cf.mul(num1, num2);
			System.out.println("Multiplication Result is "+multiplicationresult);
		}
		
		else if(op==4) {
			int divisionresult = cf.div(num1, num2);
			
			if(divisionresult == 0) {
				
				System.out.println("Division by 0 is not possible.");
			}
			
			else {
				
				System.out.println("Division Result is "+divisionresult);
				
			}
		}
		
		else {
			System.out.println("Please select correct input!");
		}
			
	}
}
