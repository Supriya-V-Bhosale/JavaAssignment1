package com.Assignment.app;
import java.util.Scanner;

public class QuestionNumber10 {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.print("Enter five digit number: ");
	int fiveDigitNum=input.nextInt();
	String result="";
	while(fiveDigitNum>0)
	{
		int lastDigit=fiveDigitNum%10;
		result+=lastDigit;
		fiveDigitNum=fiveDigitNum/10;
	}
	System.out.println("Reversed string is : "+result);
	}

}
