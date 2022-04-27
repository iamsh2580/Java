package 메소드;

import java.util.Scanner;

public class ex04_largerNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수입력 : ");
		int num1 = sc.nextInt();

		System.out.print("두번째 정수입력 : ");
		int num2 = sc.nextInt();

		int result = largerNumber(num1, num2);
		System.out.print("더 큰수는 : " + result);
	}

	public static int largerNumber(int a, int b) {
	
		int result = (a>b)?a:b;
	
		return result;

	}
	
}
