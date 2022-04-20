package com.elsa.calculator.calculator;

public class CheckForFunction {

	public static void arithmeticfunctions(String calculationline) {
		char[] characterarray;
		char symboltobecalculated=' ';
		int i,b,size=0;
		Double [] arr=new Double[4];
		String[] str;
		
		characterarray=calculationline.toCharArray();
	
		for(char characterarray1 : characterarray)
		{
			if(characterarray1=='+') {
				str=calculationline.split("\\+");
				size = str.length;
				arr = new Double [size];
			    for(i=0; i<size; i++) {
			         arr[i] = Double.parseDouble(str[i]);
			    }
				symboltobecalculated = '+';
			}
			else if(characterarray1=='-') {
				str=calculationline.split("\\-");
				size = str.length;
				arr = new Double [size];
			    for(i=0; i<size; i++) {
			         arr[i] = Double.parseDouble(str[i]);
			    }
				symboltobecalculated = '-';
				
			}
			else if(characterarray1=='*') {
				str=calculationline.split("\\*");
				size = str.length;
				arr = new Double [size];
			    for(i=0; i<size; i++) {
			         arr[i] = Double.parseDouble(str[i]);
			    }
				symboltobecalculated = '*';
			
			}
			else if(characterarray1=='/') {
				str=calculationline.split("\\/");
				size = str.length;
				arr = new Double [size];
			    for(i=0; i<size; i++) {
			         arr[i] = Double.parseDouble(str[i]);
			    }
				symboltobecalculated = '/';
			}
		}
		ResultCalculation.arithmeticresultcalculation(arr,size,symboltobecalculated);
	}
}
