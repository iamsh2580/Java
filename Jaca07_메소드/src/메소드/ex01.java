package �޼ҵ�;

import java.util.Scanner;

public class ex01 {

	
	//static����� ����ƽ�ε� ���θ޼��� ����ƽŰ���� 
	private static void getMinusVal(int a, int b) {
//  ���� ������ ���� Ű����  ��ȯŸ�� �޼��� �̸� () {..}
		
		System.out.print("��� : " + (a-b));
	}
//����ƽ�޼���ȿ��� ����ƽ�� ȣ�� >> �Ұ���
//non����ƽ �޼��带 ȣ���Ϸ��� ��ü,�Κ��� ���� �� ȣ�� 
	
	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° �� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�ι�° �� : ");
		int num2 = sc.nextInt();
		
		getMinusVal(num1,num2);
		
	}

}
