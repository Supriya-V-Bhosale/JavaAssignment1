package com.Assignment.app;

import java.util.Scanner;

/*
 * The distance between two cities (KM) is input through the keyboard.
 *  Write a program to convert and print this distance in meters, feet, 
 *  inches and centimeters.
 */
public class QuestionNumber4 {
	public static void metersConvesion(float distance) {
		System.out.println(distance +"km = " + distance*1000 + " Meters");
	}
	public static void feetConvesion(float distance) {
		System.out.println(distance +"km = " + distance*3280.84 + " feet");
	}
	public static void inchesConvesion(float distance) {
		System.out.println(distance +"km = " + distance*39370.1+ " Inches");
	}
	
	public static void centiMetersConvesion(float distance) {
		System.out.println(distance +"km = " + distance*100000 + " Centimeters");
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
		System.out.print("Enetr Distance between two cities in km  ");
		float distance=sc.nextFloat();
		metersConvesion(distance);
		feetConvesion(distance);
		inchesConvesion(distance);
		centiMetersConvesion(distance);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
