package Employee;

public abstract class Employee {
	//필드: 사번,이름,페이(읻당,연봉)
	//메서드: 월급계산하다(추상메서드),정보출력(자신이 사번,이름,연봉/일당)
	
	//abstract 추상키워드
	//추상클래스는 클래스 내에 추상메서드가 하나라도 있거나 클래스 선언시 abstract 키워드를 붙이면
	//추상 클래스가 됨 -> 객체 생성 불가능
		
	String empno;
	String name;
	int pay;
	
	//추상 메서드 :정의는 되어 있지만 기능이 없는 메서드
	//추상메서드가 있는 추상 클래스를 상속받은 하위에서 필수로 오버라이딩 해줘야함(강제성)
	public abstract int getPay(); //추상 매서드 > 하나라도 있으니 추상 클래스
	
	public String print() {
		return empno+" : " + name + " : " + getPay();
	}
	
	
}
