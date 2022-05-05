package Epoketmon;

public interface Epoketmon {
	
	//상수랑 추상메서드 정의할게요

	//인페 내에는 상수만 선언 가능 = final
	//상수는 무조건 선언할 때 초기화 시켜줘야함
	final String type = "전기";
	int level=1; //자동으로 상수형으로 변환
	//인터페이스 내에서는 변수 선언이 불가능하기때문에 
	//final 키워드를 붙여주지 않아도 상수로 선언 가능
	//단, 초기화는 필수!
	
	//메서드 정의 시작!
	//인터페이스 내에서는 추상메서드만 선언 가능!
	public abstract void attack();
	public void moving(); //abstract 키워드를 붙이지 않아도 추상메서드로 선언됨
	
	//ver8에서는 일반메서드도 선언 가능 (default,static)
	//여기서 사용하는 default는 접근제한자가 아닌
	//인터페이스 내에서 일반메서드를 선언할 수 있게 해주는 키워드
	public default void hello() {
		System.out.println("안뇽");
	}
	//정적 메서드로 선언시 사용 가능
	public static void hello1() {
		System.out.println("하이");
	}

}
//인터페이스로는 객체생성 불가능하니까 구현하는걸 만들어서~ 
