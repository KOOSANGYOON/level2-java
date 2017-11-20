package multipleTable;

import java.util.Scanner;

public class MultipleTable {
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
	
	public static int[] calculate(int num) {
		int[] result = new int[9];
		
		for (int i = 0; i < result.length; i++) {
			result[i] = num * (i + 1);
		}
		return result;
	}
	
	public static void printResult(int[] result) {
		System.out.println(result[0] + "단 의 결과입니다.\n");
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[0] + " * " + (i + 1) + " = " + result[i]);
		}
	}
	
	public static void main(String[] args) {
		int inputNum = takeNum();
		if (inputNum == -1) {
			System.out.println("다시 시작해 주세요.\n");
			return;
		}
		int[] resultArray = calculate(inputNum);
		printResult(resultArray);
	}
}
