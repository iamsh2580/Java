package ����1;

public class �ּҷϸ��� {

	public static void main(String[] args) {

		//��ü(�ν��Ͻ�) ����
		new �ּҷ�(); //�Ұ�ȣ �� ������������? �޼���
					//�����ڶ�� �޼���? ��ü����!

		�ּҷ� sc = new �ּҷ�();

		sc.name = "���̹�";
		sc.address = "�����ּ�";
		sc.number = 1;

		System.out.println("�̸� : " + sc.name);
		System.out.println("�ּ� : " + sc.address);
		System.out.println("��ȣ : " +sc.number);
		
		sc.showAddr();
		
		//�ϳ� �� �������� �� �ϳ��� ��ü(�ν��Ͻ�)������
		//�ν��Ͻ��� �ڱ⸸�� �ν��Ͻ��� 
		new �ּҷ�();

		sc.name = "����";
		sc.address = "�����ּ�";
		sc.number = 2;

		System.out.println(sc.name);
		System.out.println(sc.address);
		System.out.println(sc.number);
		
		sc.showAddr();

	}

}
