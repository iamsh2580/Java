package ����1;
public class piggyBank_main {

	public static void main(String[] args) {

		piggyBank pb = new piggyBank();

		//private ���������ڰ� ���� �ʵ�� �ٷ� ����x 
		//����� ����ؼ� �� ����
		//pb.money = 1000000;
		
		
		pb.deposit(1000);
		pb.showMoney();
		System.out.println("==================");
		pb.withdraw(600);
		pb.showMoney();
		System.out.println("==================");
		pb.withdraw(600);
		pb.showMoney();
	}

}