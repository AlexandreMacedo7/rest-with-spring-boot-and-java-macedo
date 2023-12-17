package br.com.macedo;

import org.springframework.stereotype.Service;

@Service
public class CalcService {

	private final MathCalc math = new MathCalc();
	private final ValidNumber valid = new ValidNumber();

	public double sum(String one, String two) {

		var numberOne = valid.convertToDouble(one);
		var numberTwo = valid.convertToDouble(two);

		return MathCalc.sum(numberOne, numberTwo);
	}

	public double sub(String one, String two) {

		var numberOne = valid.convertToDouble(one);
		var numberTwo = valid.convertToDouble(two);

		return MathCalc.sub(numberOne, numberTwo);
	}

	public double div(String one, String two) {

		var numberOne = valid.convertToDouble(one);
		var numberTwo = valid.convertToDouble(two);

		return MathCalc.div(numberOne, numberTwo);
	}

	public double mult(String one, String two) {
		var numberOne = valid.convertToDouble(one);
		var numberTwo = valid.convertToDouble(two);

		return MathCalc.mult(numberOne, numberTwo);
	}

	public double mean(String one, String two) {
		var numberOne = valid.convertToDouble(one);
		var numberTwo = valid.convertToDouble(two);

		return MathCalc.mean(numberOne, numberTwo);

	}

	public double squart(String one) {
		var numberOne = valid.convertToDouble(one);

		return MathCalc.squar(numberOne);

	}
}
