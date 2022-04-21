package com.elsa.calculator.calculator;

public class CheckForFunction {

	public static void arithmeticfunctions(String calculationline) {
        
		char symboltobecalculated = ' ';
        int size = 0;
        Double[] arr = new Double[4];
        char[] characterarray = calculationline.toCharArray();
        char[] array;
        
        for (int length = (array = characterarray).length, j = 0; j < length; ++j) {
            char characterarray2 = array[j];
            
            if (characterarray2 == '+') {
                String[] str = calculationline.split("\\+");
                size = str.length;
                arr = new Double[size];
                for (int i = 0; i < size; ++i) {
                    arr[i] = Double.parseDouble(str[i]);
                }
                symboltobecalculated = '+';
            }
            else if (characterarray2 == '-') {
                String[] str = calculationline.split("\\-");
                size = str.length;
                arr = new Double[size];
                for (int i = 0; i < size; ++i) {
                    arr[i] = Double.parseDouble(str[i]);
                }
                symboltobecalculated = '-';
            }
            else if (characterarray2 == '*') {
                String[] str = calculationline.split("\\*");
                size = str.length;
                arr = new Double[size];
                for (int i = 0; i < size; ++i) {
                    arr[i] = Double.parseDouble(str[i]);
                }
                symboltobecalculated = '*';
            }
            else if (characterarray2 == '/') {
                String[] str = calculationline.split("\\/");
                size = str.length;
                arr = new Double[size];
                for (int i = 0; i < size; ++i) {
                    arr[i] = Double.parseDouble(str[i]);
                }
                symboltobecalculated = '/';
            }
        }
        ResultCalculation.arithmeticresultcalculation(arr, size, symboltobecalculated);
    }
}
