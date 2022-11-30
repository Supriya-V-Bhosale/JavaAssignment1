package com.Assignment.app;
import java.util.Scanner;
/*
 * Implement a logic to swap two numbers without using a temporary variable
 */

public class QuestionNumber8 {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.print("Enter first number : ");
	int firstNumber=input.nextInt();
	System.out.print("Enter second number : ");
	int secondNumber=input.nextInt();
	System.out.println("Previous values of firstNumber and secondNumber are: "+firstNumber+" , "+secondNumber);
	firstNumber=firstNumber+secondNumber;
	secondNumber=firstNumber-secondNumber;
	firstNumber=firstNumber-secondNumber;
	System.out.println("Swapped values of firstNumber and secondNumber are: "+firstNumber+" , "+secondNumber);
	}
}
