package calculator;

import java.util.Scanner;

//입력값을 받아서 값은 숫자로 바꿔주고, 연산자는 기호 그대로 리턴해주는 클래스
public class Input {
	static int takeData(Scanner data) {		//data를 받으면,
		System.out.println("값을 입력하세요.");
		String inputString = data.nextLine();
		int returnData = Integer.parseInt(inputString);
		
		return returnData;
	}
	
	public static char takeSymbol(Scanner data) {		//연산자를 받으면,
		System.out.println("연산자를 입력하세요. (ex. '+', '-', '*', '/', '%', 'c')");
		char inputSym = data.next().charAt(0);
		
		return inputSym;
	}
}
