package Phone;

public class Phone_main {

	public static void main(String[] args) {

		Phone p1 = new Phone();
		Folder_phone p2 = new Folder_phone();
		Smart_phone p3 = new Smart_phone();
		// �̰� ������?
		

		p1.call(); // �θ�� �ڽĲ� ������.
		p2.call();

		// smart_phone Ŭ������ call() �޼��带 ���� �������� �ʾ�����
		// phone Ŭ������ ��ӹ޴� �� �����ε� call�޼��带 ����� �� �ִ�.

		// ����� ������ ��ü�� �����ϸ� �θ�Ŭ������ �Բ� ������
		// �ϴ� ȣ�������� �ڽĲ� ���� Ȯ���ϰ� ������ �θ� �˻�

		// ����) smart_phone���� callȣ���, �Ƿη��̶�� �ϰ������
		// �θ��� �޼��尡 ������ �ڽĸ��� ���ο� �޼��带 �����?
		// �������̵�!
		p3.call();
		// ��ɵ� ���

		// ����Ŭ������ �ۼ��� �޼���� ����Ŭ�������� ��� �Ұ���
		// p1.internet();

		//System.out.println(p1.speaker);
		System.out.println(p1.get_speaker());
		System.out.println(p3.get_speaker());

	}

}
//�ʵ�� �������̵� ������ ����?!