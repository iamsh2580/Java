package 예제1;

public class piggyBank {

	// 속성 : 금액
	// private 현재 클래스(객체)내에서만 접근가능하도록!
	private int money;

	// 기능(메서드)

	// 1.돈을 넣는다.
	public void deposit(int money) {

		// this. :현재 생성된 인스턴스에 접근
		this.money = this.money + money;

	}

	// 2.돈을 인출한다.
	public void withdraw(int money) {

		if (money < this.money) {
			this.money -= money;
		}else {
			System.out.println("잔액이 부족합니다.");
		}
	}

	// 3.잔액을 보여준다. 돈넣고 잔액출력?잔액돌려주고싶? 그러면
	// 잔액에 대한 변수도 있어야됨!
	public void showMoney() {
		System.out.println("현재 잔액 : " + money);

	}

}// 끝!
