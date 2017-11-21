package calculator;
import java.util.Scanner;

public class Calculator {
	//받은 입력 데이터 2개와, 연산자를 기준으로 계산하여 결과값을 리턴해주는 메소드.
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
		String result = "";		//매 순간순간마다 현재 수식을 출력해 줄 result 값 초기화
		int resultData = 0;		//총 계산 결과를 0으로 초기화
		Scanner firstInput = new Scanner(System.in);
		int inputData = Input.takeData(firstInput);
		
		result += inputData;
		resultData = inputData;
		System.out.println("총 수식 : " + result);
		System.out.println("계산 결과값(현재값) : " + resultData);
		
		while (true) {		//연산자 'c' (clear) 를 입력받을 때 까지 계속해서 반복.
			Scanner symbol = new Scanner(System.in);
			Scanner nextData = new Scanner(System.in);
			char inputSymbol = Input.takeSymbol(symbol);
			if (inputSymbol == 'c') {
				System.out.println("CLEAR AND EXIT");
				break;
			}
			result += inputSymbol;
			System.out.println("총 수 : " + result);
			System.out.println("계산 결과값(현재값) : " + resultData);
			inputData = Input.takeData(nextData);
			resultData = calculateData(resultData, inputData, inputSymbol);
			result += inputData;
			System.out.println("총 수식 : " + result);
			System.out.println("계산 결과값(현재값) : " + resultData);
		}
		firstInput.close();
	}
}