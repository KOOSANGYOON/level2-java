package calculator;
import java.util.Scanner;

public class Calculator {
//	public static int takeData(Scanner data) {
//		System.out.println("값을 입력하세요.");
//		String inputString = data.nextLine();
//		int returnData = Integer.parseInt(inputString);
//		
//		return returnData;
//	}
//	
//	public static char takeSymbol(Scanner data) {
//		System.out.println("연산자를 입력하세요. (ex. '+', '-', '*', '/', '%', 'c')");
//		char inputSym = data.next().charAt(0);
//		
//		return inputSym;
//	}
	
	public static int calculateData(int firstNum, int secondNum, char sym) {
		int returnResult = 0;
		
		if (sym == '+') {
			returnResult = firstNum + secondNum;
		}else if (sym == '-') {
			returnResult = firstNum - secondNum;
		}else if (sym == '*') {
			returnResult = firstNum * secondNum;
		}else if (sym == '/') {
			returnResult = firstNum / secondNum;
		}else if (sym == '%') {
			returnResult = firstNum % secondNum;
		}
		return returnResult;
	}
	
	public static void main(String[] args) {
		String result = "";
		int resultData = 0;
		Scanner firstInput = new Scanner(System.in);
		int inputData = Input.takeData(firstInput);
		
		result += inputData;
		resultData = inputData;
		System.out.println("총 수식 : " + result);
		System.out.println("계산 결과값 : " + resultData);
		
		while (true) {
			Scanner symbol = new Scanner(System.in);
			Scanner nextData = new Scanner(System.in);
			char inputSymbol = Input.takeSymbol(symbol);
			if (inputSymbol == 'c') {
				System.out.println("EXIT");
				break;
			}
			result += inputSymbol;
			System.out.println("총 수 : " + result);
			System.out.println("계산 결과값 : " + resultData);
			inputData = Input.takeData(nextData);
			resultData = calculateData(resultData, inputData, inputSymbol);
			result += inputData;
			System.out.println("총 수식 : " + result);
			System.out.println("계산 결과값 : " + resultData);
		}
		firstInput.close();
	}
}