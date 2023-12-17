package br.com.macedo;

import org.springframework.stereotype.Component;

@Component
public class MathCalc {
	
	
	public static double sum(double numberOne, double numberTwo) {
		return numberOne + numberTwo;
	}
	public static double sub(double numberOne, double numberTwo) {
		return numberOne - numberTwo;
	}
	public static double mult(double numberOne, double numberTwo) {
		return numberOne * numberTwo;
	}
	public static double div(double numberOne, double numberTwo) {
		return numberOne / numberTwo;
	}
	public static double mean(double numberOne, double numberTwo) {
		return (numberOne + numberTwo)/2;
	}
	public static double squar(double number) {
		return Math.sqrt(number);
	}
}
