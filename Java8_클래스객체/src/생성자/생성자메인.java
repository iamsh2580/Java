package ������;

public class �����ڸ��� {

	public static void main(String[] args) {

		new Person();

		Person ps = new Person();

		// Person ps = new Person("ȫ�浿",25);

		ps.setName("ȫ�浿");
		ps.setAge(25);

		Person ps2 = new Person("�迵��", 27);

		System.out.println("str1��ü �л� �̸� :" + ps.getName() +", ���� : "+ps.getAge());
		System.out.println("str2��ü �л� �̸� :" + ps2.getName() +", ���� : "+ps2.getAge());
		

	}

}
