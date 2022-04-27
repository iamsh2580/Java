package 예제1;

public class 우유메인 {

	public static void main(String[] args) {

		// %모든 클래스의 최상위 객체? object 부모?

		// 우유맛 쿠키 캐릭터(객체,인스턴스) 생성
		new 우유맛쿠키();// 우유타입의 객체 생성 <<<이거왜함?

		// 우유맛쿠키 객체의 참조값을 저장하고 있는 레퍼런스 변수 선언
		우유맛쿠키 cs = new 우유맛쿠키(); //쿠키생성 여기!
		//우유맛쿠키 cs2 = new 우유맛쿠키(); //쿠키생성 여기!

		// 현재 속성 출력

		// 생성된 우유맛쿠키 인스턴스의 레벨에 접근
		System.out.println(cs.level);
		
		//생성된 우유맛쿠키 인스턴스의 공격기능(메소드) 사용
		cs.attack();
		
		우유맛쿠키 cs2 = new 우유맛쿠키("우유맛쿠키2",10,50);
		cs2.attack();
		
		//춘식 인스턴스의 속성값 할당;
		cs.name = "내 우유맛쿠키";
		cs.level = 100;
		cs.power = 999999;
		
		System.out.println();
		System.out.println("이름 : " + cs.name);
		System.out.println("레벨 : " + cs.level);
		System.out.println("공격력 : " + cs.power);
		
		cs.attack();
	}

}
