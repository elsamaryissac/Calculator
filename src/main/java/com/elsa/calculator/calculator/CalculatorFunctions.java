package com.elsa.calculator.calculator;

/**
 * This class is written to handle all the arithmetic operations in a calculator.
 * @author LEGEND
 *
 */
public class CalculatorFunctions {
	/**
	 * This method is used to add two numbers.
	 * @param firstNum This is the value of the first number.
	 * @param secondNum This is the value of the second number.
	 * @return
	 */ 
	public Double addition(int firstNum, int secondNum) {
		return Double.valueOf(firstNum+secondNum);
	}
	
	/**
	 * This method is used to subtract two numbers.
	 * @param firstNum This is the value of the first number.
	 * @param secondNum This is the value of the second number.
	 * @return
	 */
	public Double subtraction(int firstNum, int secondNum) {

			return Double.valueOf(firstNum-secondNum);
	}
	
	/**
	 * This method is used to multiplsecondNum two numbers.
	 * @param firstNum This is the value of the first number.
	 * @param secondNum This is the value of the second number.
	 * @return
	 */
	public Double multiplication(int firstNum, int secondNum) {
		
		Double firstnumDouble = Double.valueOf(firstNum);
		Double secondnumDouble = Double.valueOf(secondNum);
		return Double.valueOf(firstnumDouble*secondnumDouble);
	}
	
	/**
	 * This method is used to divide two numbers.
	 * @param firstNum This is the value of the first number.
	 * @param secondNum This is the value of the second number.
	 * @return
	 */
	public Double division(int firstNum, int secondNum) {
		
		if(secondNum == 0) {
			return null;
		} else {
			Double firstnumDouble = Double.valueOf(firstNum);
			Double secondnumDouble = Double.valueOf(secondNum);
			return (firstnumDouble/secondnumDouble);
		}
	}
	
}
