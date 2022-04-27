package 예제1;
public class piggyBank_main {

	public static void main(String[] args) {

		piggyBank pb = new piggyBank();

		//private 접근제한자가 붙은 필드는 바로 접근x 
		//기능을 사용해서 값 변경
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