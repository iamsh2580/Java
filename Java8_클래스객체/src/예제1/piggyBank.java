package ����1;

public class piggyBank {

	// �Ӽ� : �ݾ�
	// private ���� Ŭ����(��ü)�������� ���ٰ����ϵ���!
	private int money;

	// ���(�޼���)

	// 1.���� �ִ´�.
	public void deposit(int money) {

		// this. :���� ������ �ν��Ͻ��� ����
		this.money = this.money + money;

	}

	// 2.���� �����Ѵ�.
	public void withdraw(int money) {

		if (money < this.money) {
			this.money -= money;
		}else {
			System.out.println("�ܾ��� �����մϴ�.");
		}
	}

	// 3.�ܾ��� �����ش�. ���ְ� �ܾ����?�ܾ׵����ְ��? �׷���
	// �ܾ׿� ���� ������ �־�ߵ�!
	public void showMoney() {
		System.out.println("���� �ܾ� : " + money);

	}

}// ��!
