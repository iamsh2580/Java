package ������;

import java.util.Scanner;

public class Calculator_main {

	public static void main(String[] args) {
		
		
		//�⺻�����ڴ� �����ڰ� �ϳ��� ������������
		//�ȸ������ �׷��� �Ű������ִ°� �ϳ��⋚����
		//�ϳ��ۿ� �Ƚ�� (?)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1��° ���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("2��° ���� �Է� : ");
		int num2 = sc.nextInt();
		
		 Calculator cal = new Calculator(num1,num2);
		 
		 System.out.print("���� ��: ");
		System.out.println(cal.sum());

		cal.setNum1(75);
		cal.setNum2(5);
		
		System.out.print("�� ��: ");
		System.out.println(cal.sub());
		
	}

}

//����
//�׳� () �ѰŶ� cal = new~ �Ѱ� ��������?
//���°Ŷ� void�� ������?