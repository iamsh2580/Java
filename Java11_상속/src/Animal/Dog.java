package Animal;

public class Dog extends Animal {

	// 필드 : 종
	// 메서드 : 재주부리다,울다,뛰다

	public void skill() {
		System.out.println("공 물어오기!");
	}
	//오버라이딩 = 동적 바인딩 (<> 정적 바인딩)
	//:실제로 참조하는 객체는 dog객체 dog는 서브클래스인데?
	//서브클래스의 메서드를 호출하겠다 = 동적 바인딩
	//정적바인딩 : 업캐스팅시, dog가 animal이되는데..(부모가 되는 = 부모값만 사용가능)
	//타입이 슈퍼클래스일때 슈퍼클래스 메서드 호출하는것
	//상위 클래스의 메소드 중 재정의해야하는 기능이 있을 때 하위클래스
	//에서 매개변수의 개수,타입,순서,반환타입은 동일하게 메서드를 재정의하는 것
	public void cry() {
		System.out.println("멍멍");
	}

}
