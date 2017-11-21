package multipleTable;

import java.util.Scanner;

public class MultipleTable {
	//입력받은 두 정수의 크기를 확인하는 메소드 -> 둘 중 하나라도 0보다 작으면 false 리턴.
	public static boolean takeNum(int firstNum, int secondNum) {
//        if (firstNum < 0 || secondNum < 0) {
//        		return false;
//        }
//        	return true;
		return firstNum > 0 && secondNum > 0;
	}
	
	//입력받은 정수를 계산하는 메소드. 계산 값을 화면에 출력해준다.
	public static void calculate(int first, int second) {
		for (int i = 2; i <= first; i++) {
			System.out.println(i + " 단 출력");
			for (int j = 1; j <= second; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}
	}
	
	//main start
	public static void main(String[] args) {
		System.out.println("구구단 몇 몇 단을 알려드릴까요?\n (ex) 7,8 = 2X1, 2X2, ... , 2X9, 3X1, ... , 7X1, 7X2, ... , 7X8 \n 입력 : ");
        
		Scanner scanData = new Scanner(System.in);
        String inputData = scanData.nextLine();
        String[] inputArray = inputData.split(",");		// ',' 를 기준으로 좌 우 값을 배열에 넣어준다.
        scanData.close();
        
        int firstNum = Integer.parseInt(inputArray[0]);		//배열에 들어간 두 값을 정수형으로 변환하여 준다.
        int secondNum = Integer.parseInt(inputArray[1]);
        
		boolean isInputRight = takeNum(firstNum, secondNum);
		if (isInputRight == false) {		//종료 조건 1 = 두 값 중에 0보다 작은 값이 하나라도 있으면 종료.
			System.out.println("두 수 모두 양수를 입력해야 합니다. 다시 시작해 주세요.\n");
			return;
		}
		calculate(firstNum, secondNum);
	}
}