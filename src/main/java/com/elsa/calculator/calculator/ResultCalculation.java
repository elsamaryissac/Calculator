package com.elsa.calculator.calculator;

public class ResultCalculation {
	public static Double arithmeticresultcalculation(Double[] values, char charsymbol) {
        Double result = 0.0;
        int sizeofarray = values.length;
        if (charsymbol == '+') {
            for (int j = 0; j < sizeofarray; ++j) {
            	result += values[j];
            }
            System.out.println("Addition Result is " + result);
        } else if (charsymbol == '-') {
        	Double start = values[0];
        	for(int i = 1; i<values.length; i++) {
        		start = start - values[i];
        	}
        	result = start;
        	System.out.println("Subtraction Result is " + result);
        }
        else if (charsymbol == '*') {
        	Double start = values[0];
            for (int j = 1; j < values.length; j++) {
            	start = start * values[j];
            }
            result = start;
            System.out.println("Multiplication Result is " + result);
        }
        else if (charsymbol == '/') {
        	Double start = values[0];
        	for(int i = 1; i<values.length; i++) {
        		if(values[i] == 0) {
        			start = null;
        		} else {
        			start = start / values[i];
        		}
        	}
        	result = start;
        	if(start == null) {
        		System.out.println("Division by 0 is not possible");
        	} else {
        	System.out.println("Division Result is " + result);
        	}
        }
        return result;
    }
}
