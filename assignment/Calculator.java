package assignment;

import java.util.*;
public class Calculator
{
	public static void main(String[] args) {
		if(args.length!=3){
		    System.out.println("invalid input");
		    return;
		}
		String op=args[0];
		double num1= Double.parseDouble(args[1]);
		double num2= Double.parseDouble(args[2]);
		double result=0.0;
		
		switch(op){
		   case "add" :
		        result=num1+num2;
		        break;
		  case "sub":
		      result=num1-num2;
		        break;
		  case "mul":
		      result=num1*num2;
		        break;
		  case "div":
		      result=num1/num2;
		        break;
		  default:
		      System.out.println("invalid inputs");
		      break;
		}
		
		System.out.println(result);
	}

}
