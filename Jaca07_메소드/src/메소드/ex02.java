package �޼ҵ�;

import java.util.Scanner;

public class ex02 {

	public static int getAbsouluteVal(int a, int b) {

		//���׿����ڸ� �̿���
		//int result = (a>=b)?a-b:(a-b)*1;	
		//return result;
		
		return Math.abs(a-b);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("ù��° �� : ");
		int num1 = sc.nextInt();

		System.out.print("�ι�° �� : ");
		int num2 = sc.nextInt();

		int result = getAbsouluteVal(num1, num2);
		System.out.print("��� : " + result);

	}

}

//�Ű����� : 2���� ������ �� �� ��ȯ�ҰŴϱ� �ΰ��� ���� (int�� 2��)
//��ȯ Ÿ�� : ����

