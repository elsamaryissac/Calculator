package com.elsa.calculator.calculator;

public class CheckForFunction {

	public Double arithmeticfunctions(String calculationline) {
        
		char symboltobecalculated = ' ';
        Double[] arr = null;
         
            if (isOperation(calculationline,"+")) {
            	arr=getArray(calculationline,"\\+");
                symboltobecalculated = '+';
            } else if (isOperation(calculationline,"-")) {
                arr=getArray(calculationline,"\\-");
                symboltobecalculated = '-';
            } else if (isOperation(calculationline,"*")) {
            	arr=getArray(calculationline,"\\*");
                symboltobecalculated = '*';
            } else if (isOperation(calculationline,"/")) {
            	arr=getArray(calculationline,"\\/");
                symboltobecalculated = '/';
            }
            return ResultCalculation.arithmeticresultcalculation(arr, symboltobecalculated);
    }
	
	private static Double[] getArray(String calculationline, String operation) {
		
		 String[] str = calculationline.split(operation);
         Double[] arr = new Double[str.length];
         for (int i = 0; i < str.length; ++i) {
             arr[i] = Double.parseDouble(str[i]);
         }
         return arr;
	}
	
	private static boolean isOperation(String calculationline, String operation) {
		return calculationline.contains(operation);
	}
}
