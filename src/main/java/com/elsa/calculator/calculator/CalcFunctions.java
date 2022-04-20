package com.elsa.calculator.calculator;

/**
 * This class is written to handle all the arithmetic operations in a calculator.
 * @author LEGEND
 *
 */
public class CalcFunctions {
	/**
	 * This method is used to add two numbers.
	 * @param x This is the value of the first number.
	 * @param y This is the value of the second number.
	 * @return
	 */
	int add(int x, int y) {
		return(x+y);
	}
	
	/**
	 * This method is used to subtract two numbers.
	 * @param x This is the value of the first number.
	 * @param y This is the value of the second number.
	 * @return
	 */
	int sub(int x, int y) {
		if(x>y) {
		
			return(x-y);
		}
		else {
			
			return(y-x);
		}
	}
	
	/**
	 * This method is used to multiply two numbers.
	 * @param x This is the value of the first number.
	 * @param y This is the value of the second number.
	 * @return
	 */
	int mul(int x, int y) {
		return(x*y);
	}
	
	/**
	 * This method is used to divide two numbers.
	 * @param x This is the value of the first number.
	 * @param y This is the value of the second number.
	 * @return
	 */
	int div(int x, int y) {
		if(y == 0) {
			return 0;
		}
		
		else {
		return(x/y);
		}
	}
	
}
