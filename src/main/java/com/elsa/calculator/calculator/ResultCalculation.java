package com.elsa.calculator.calculator;

public class ResultCalculation {
	public static void arithmeticresultcalculation(Double[] values, int sizeofarray, char charsymbol) {
        Double additionresult = 0.0;
        Double subtractionresult = 0.0;
        Double multiplicationresult = 1.0;
        Double divisionresult = 1.0;
        
        if (charsymbol == '+') {
            for (int j = 0; j < sizeofarray; ++j) {
                additionresult += values[j];
            }
            System.out.println("Addition Result is " + additionresult);
        }
        else if (charsymbol == '-') {
            for (int j = 0; j < (sizeofarray-(sizeofarray-1)); ++j) {
                subtractionresult = values[j];
                for (int k = j + 1; k < sizeofarray; ++k) {
                    subtractionresult -= values[k];
                }
                System.out.println("Subtraction Result is " + subtractionresult);
            }
        }
        else if (charsymbol == '*') {
            for (int j = 0; j < sizeofarray; ++j) {
                multiplicationresult *= values[j];
            }
            System.out.println("Multiplication Result is " + multiplicationresult);
        }
        else if (charsymbol == '/') {
            for (int j = 0; j < sizeofarray; ++j) {
                divisionresult = values[j];
                for (int k = j + 1; k < sizeofarray; ++k) {
                    divisionresult /= values[k];
                    if (values[k] == 0.0) {
                        System.out.println("Division by 0 is not possible");
                    }
                    else {
                        System.out.println("Division Result is " + divisionresult);
                    }
                }
            }
        }
    }
}
