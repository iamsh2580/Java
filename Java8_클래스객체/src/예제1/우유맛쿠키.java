package ����1;

public class ��������Ű {

	// ������ ��Ű ����
	// �Ӽ�(field),�ൿ(method)

	// 1.�Ӽ�(field) : �̸�,����,���ݷ�

	String name; // �̸��� �־�ߵ�!
	int level;
	int power;

	// ������ : newŰ���带 ����ؼ� ��ü�� �����Ҷ��� ȣ��Ǵ� �޼���
	// ���������� Ŭ�����̸�(){} - ������ ����
	// �⺻������ : �Ű�����x,���x
	// �����ڰ� �ٸ� �����ڸ� �������� ������ �����Ϸ� �ڵ����� ��������
	public ��������Ű() {

	}
	// public ��������Ű() {
	// ���� Ŭ���� �� ���� ���� ���� xxx
	// }

	public ��������Ű(String name, int level, int power) {
		this.name = name;
		this.level = level;
		this.power = power;

	}

	// 2.�ൿ(method) : �����Ѵ�,�ȴ´�
	// �ٸ������� ����� ��밡���ؾ��ϴϱ� public�� �����Ͱ��ƿ�~
	public void attack() {
		System.out.println(name + "����!");
	}

	public void walk() {
		System.out.println("�ȴ´�~");
	}

}
