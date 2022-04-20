package com.elsa.calculator.calculator;

import java.util.*;

/**
 * 
 * @author LEGEND
 * This class will handle calculation.
 *
 */
public class Calculator {

public static void process(Double firstNumber, Double secondNumber, int op) {
		
		CalculatorFunctions cf = new CalculatorFunctions();
		
		if (op==1) {
			Double additionresult = cf.addition(firstNumber, secondNumber);
			System.out.println("Addition Result is "+additionresult);
		}
		
		else if (op==2) {
			Double subtractionresult = cf.subtraction(firstNumber, secondNumber);
			System.out.println("Subtraction Result is "+subtractionresult);
		}
		
		else if (op==3) {
			Double multiplicationresult = cf.multiplication(firstNumber, secondNumber);
			System.out.println("Multiplication Result is "+multiplicationresult);
		}
		
		else if (op==4) {
			Double divisionresult = cf.division(firstNumber, secondNumber);
			
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
