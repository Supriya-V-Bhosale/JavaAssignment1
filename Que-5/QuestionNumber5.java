package com.Assignment.app;

import java.util.Scanner;

/*The temperature of a city in Fahrenheit is given. 
Write a program to convert it into Celsius.
*/
public class QuestionNumber5 {
	public static void convertTemperatureCIntoF(int temperatureInFahrenheit ) {
		System.out.println("Temperature "+temperatureInFahrenheit +" in Fahrenheit = "+(temperatureInFahrenheit-32) * 5/9 + " in Celsius");
	}
	
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter temperature in Fahrenheit  ");
			int temperatureInFahrenheit=sc.nextInt();
			convertTemperatureCIntoF(temperatureInFahrenheit);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
