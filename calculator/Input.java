package calculator;

import java.util.Scanner;

public class Input {
	static int takeData(Scanner data) {
		System.out.println("값을 입력하세요.");
		String inputString = data.nextLine();
		int returnData = Integer.parseInt(inputString);
		
		return returnData;
	}
	
	public static char takeSymbol(Scanner data) {
		System.out.println("연산자를 입력하세요. (ex. '+', '-', '*', '/', '%', 'c')");
		char inputSym = data.next().charAt(0);
		
		return inputSym;
	}
}
