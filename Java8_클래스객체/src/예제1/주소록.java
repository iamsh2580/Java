package 예제1;

public class 주소록 {

	// 논스테틱하는 이유?
	String name;
	String address;
	int number;

	public void name() {
		System.out.println(name);

	}

	public void address() {
		System.out.println(address);

	}

	public void number() {
		System.out.println(number);

	}

	public void showAddr() {
		System.out.println("이름 : " + name);
		System.out.println("주소 : " + address);
		System.out.println("번호 : "+ number);
	}
}
