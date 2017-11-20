package multipleTable;

import java.util.Scanner;

public class MultipleTable {
	//정수를 입력받는 메소드 -> checkNum 메소드로 입력받은 정수를 보내준다.
	//입력 받은 정수의 값이 오류가 있을 때, -1을 리턴해준다.
	public static int takeNum() {
		System.out.println("구구단 중 출력할 단은? : ");
        Scanner scanNum = new Scanner(System.in);
        int number = scanNum.nextInt();
        int inputNum = checkNum(number);
        scanNum.close();
        if (inputNum == -1) {
        		return -1;
        }
        return inputNum;
	}
	//정수를 입력 받아서, 2보다 작거나 9보다 크면 -1을 리턴해준다. 그렇지 않으면 정수 그대로를 리턴해준다.
	public static int checkNum(int number) {
		if (number < 2) {
			System.out.println("2보다 커야합니다.\n");
			return -1;
		}else if (number > 9) {
			System.out.println("9보다 작아야 합니다.\n");
			return -1;
		}else {
			return number;
		}
	}
	//입력받은 정수를 X 1, X 2, ... , X 9 까지 계산하여 배열의 한 칸마다 입력해준다.
	public static int[] calculate(int num) {
		int[] result = new int[9];
		
		for (int i = 0; i < result.length; i++) {
			result[i] = num * (i + 1);
		}
		return result;
	}
	//입력받은 배열의 첫 원소부터 끝 원소까지 차례로 출력해준다.
	public static void printResult(int[] result) {
		System.out.println(result[0] + "단 의 결과입니다.\n");
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[0] + " * " + (i + 1) + " = " + result[i]);
		}
	}
	//main start
	public static void main(String[] args) {
		int inputNum = takeNum();
		if (inputNum == -1) {		//리턴 받은 값이 -1일 경, 데러 메시지 출력해주고 종료.
			System.out.println("다시 시작해 주세요.\n");
			return;
		}
		int[] resultArray = calculate(inputNum);
		printResult(resultArray);
	}
}
