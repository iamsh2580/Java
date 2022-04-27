package 메소드;

import java.util.Scanner;

public class ex02 {

	public static int getAbsouluteVal(int a, int b) {

		//삼항연산자를 이용함
		//int result = (a>=b)?a-b:(a-b)*1;	
		//return result;
		
		return Math.abs(a-b);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 수 : ");
		int num1 = sc.nextInt();

		System.out.print("두번째 수 : ");
		int num2 = sc.nextInt();

		int result = getAbsouluteVal(num1, num2);
		System.out.print("결과 : " + result);

	}

}

//매개변수 : 2개의 정수를 뺀 값 반환할거니까 두개의 정수 (int형 2개)
//반환 타입 : 정수

