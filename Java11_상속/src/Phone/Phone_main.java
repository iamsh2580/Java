package Phone;

public class Phone_main {

	public static void main(String[] args) {

		Phone p1 = new Phone();
		Folder_phone p2 = new Folder_phone();
		Smart_phone p3 = new Smart_phone();
		// 이거 왜했지?
		

		p1.call(); // 부모는 자식꺼 못쓴다.
		p2.call();

		// smart_phone 클래스에 call() 메서드를 따로 정의하지 않았지만
		// phone 클래스를 상속받는 것 만으로도 call메서드를 사용할 수 있다.

		// 상속한 상태인 객체를 생성하면 부모클래스도 함꼐 생성됨
		// 일단 호출했을때 자식꺼 먼저 확인하고 없으면 부모꺼 검사

		// 퀴즈) smart_phone으로 call호출시, 또로롱이라고 하고싶을때
		// 부모의 메서드가 있지만 자식만의 새로운 메서드를 만들면?
		// 오버라이딩!
		p3.call();
		// 기능들 사용

		// 서브클래스에 작성된 메서드는 슈퍼클래스에서 사용 불가능
		// p1.internet();

		//System.out.println(p1.speaker);
		System.out.println(p1.get_speaker());
		System.out.println(p3.get_speaker());

	}

}
//필드는 오버라이딩 개념이 없다?!