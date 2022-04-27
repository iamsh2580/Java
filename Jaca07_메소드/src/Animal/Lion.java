package Animal;

public class Lion extends Animal {

	boolean tail;
	
	public void sleep() {
		System.out.println("자다");
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("사자 움직임");
		
	}
	//주석(annotation) :특별한 기능(컴파일할 때 해당 메서드가 상위 클래스의 메서드를 재정의 한
	//메서드인지 확인)을 가진 주석
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("사자 공격");
		
	}
	//필드: 눈,귀,꼬리
	//메서드:움직이다,공격하다,자다

	//상위클래스인 추상클래스의 추상메서드를 무조건 재정의하도록 강제성을 부여
	//하기위해 추상메서드를 사용!
}
