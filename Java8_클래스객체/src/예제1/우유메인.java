package ����1;

public class �������� {

	public static void main(String[] args) {

		// %��� Ŭ������ �ֻ��� ��ü? object �θ�?

		// ������ ��Ű ĳ����(��ü,�ν��Ͻ�) ����
		new ��������Ű();// ����Ÿ���� ��ü ���� <<<�̰ſ���?

		// ��������Ű ��ü�� �������� �����ϰ� �ִ� ���۷��� ���� ����
		��������Ű cs = new ��������Ű(); //��Ű���� ����!
		//��������Ű cs2 = new ��������Ű(); //��Ű���� ����!

		// ���� �Ӽ� ���

		// ������ ��������Ű �ν��Ͻ��� ������ ����
		System.out.println(cs.level);
		
		//������ ��������Ű �ν��Ͻ��� ���ݱ��(�޼ҵ�) ���
		cs.attack();
		
		��������Ű cs2 = new ��������Ű("��������Ű2",10,50);
		cs2.attack();
		
		//��� �ν��Ͻ��� �Ӽ��� �Ҵ�;
		cs.name = "�� ��������Ű";
		cs.level = 100;
		cs.power = 999999;
		
		System.out.println();
		System.out.println("�̸� : " + cs.name);
		System.out.println("���� : " + cs.level);
		System.out.println("���ݷ� : " + cs.power);
		
		cs.attack();
	}

}
