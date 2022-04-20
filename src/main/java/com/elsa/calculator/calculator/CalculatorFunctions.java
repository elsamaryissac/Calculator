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
	public Double addition(Double firstNum, Double secondNum) {
		return (firstNum+secondNum);
	}
	
	/**
	 * This method is used to subtract two numbers.
	 * @param firstNum This is the value of the first number.
	 * @param secondNum This is the value of the second number.
	 * @return
	 */
	public Double subtraction(Double firstNum, Double secondNum) {
		return (firstNum-secondNum);
	}
	
	/**
	 * This method is used to multiplsecondNum two numbers.
	 * @param firstNum This is the value of the first number.
	 * @param secondNum This is the value of the second number.
	 * @return
	 */
	public Double multiplication(Double firstNum, Double secondNum) {
		return (firstNum*secondNum);
	}
	
	/**
	 * This method is used to divide two numbers.
	 * @param firstNum This is the value of the first number.
	 * @param secondNum This is the value of the second number.
	 * @return
	 */
	public Double division(Double firstNum, Double secondNum) {
		if(secondNum == 0) {
			return null;
		} else {
			return (firstNum/secondNum);
		}
	}
	
}
