package br.com.macedo;

import org.springframework.stereotype.Component;

import br.com.macedo.exceptions.UnsupportedMathOperationException;

@Component
public class ValidNumber {
	

	public Double convertToDouble(String strNumber) {
		
		if (!isNumeric(strNumber)) {
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}
		
		if(strNumber == null)return 0D;
		
		String number = strNumber.replaceAll(",", ".");
		
		if(isNumeric(number))return Double.parseDouble(number);
		
		return 0D;
	}

	private boolean isNumeric(String strNumber) {
		
		if(strNumber == null)return false;
		
		String number = strNumber.replaceAll(",",".");
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
	
}
