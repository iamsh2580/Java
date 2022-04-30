package Animal;

public class Cat extends Animal {

	public void groon() {
		System.out.println("그루밍중~");
	}
	
@Override //주석인데 특별기능 가진 주석
//컴팓일할 때 오류 확인할 수 있게 만들어주는 기능
public void cry() {
	System.out.println("미야옹~");
}

//재정의하겠다! =오버라이딩
//메서드 이름이 다르다면 기능 자체가 다른것!


}
