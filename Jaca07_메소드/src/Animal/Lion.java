package Animal;

public class Lion extends Animal {

	boolean tail;
	
	public void sleep() {
		System.out.println("�ڴ�");
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("���� ������");
		
	}
	//�ּ�(annotation) :Ư���� ���(�������� �� �ش� �޼��尡 ���� Ŭ������ �޼��带 ������ ��
	//�޼������� Ȯ��)�� ���� �ּ�
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("���� ����");
		
	}
	//�ʵ�: ��,��,����
	//�޼���:�����̴�,�����ϴ�,�ڴ�

	//����Ŭ������ �߻�Ŭ������ �߻�޼��带 ������ �������ϵ��� �������� �ο�
	//�ϱ����� �߻�޼��带 ���!
}
