package �޼ҵ�;

import java.util.Scanner;

public class ex04_largerNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° �����Է� : ");
		int num1 = sc.nextInt();

		System.out.print("�ι�° �����Է� : ");
		int num2 = sc.nextInt();

		int result = largerNumber(num1, num2);
		System.out.print("�� ū���� : " + result);
	}

	public static int largerNumber(int a, int b) {
	
		int result = (a>b)?a:b;
	
		return result;

	}
	
}
