package Phone;

public class Smart_phone extends Phone {

	// 상속: class 클래스이름 extends 상위클래스 이름
	// ->상위 클래스를 상속받아서 새로운 클래스 작성하겟다
	// *장점 : 상위클래스의 필드/메서드를 현재 클래스에 따로 정의x, 사용가능

	// 필드(속성) :(스피커,마이크) -phone class,카메라
	// 메서드(기능) :(전화하다,문자하다) -phone class,인터넷하다

	String camara;
	// 자식은 부모가 가진 필드내용 사용 못한다

	// smart+phone이 생성될떄 speaker필드 초기화 lg로
	// 셍성이 될때 뭐라고?

	// person("김",20);
	// this.name = name; ~
	// 위 내용이 객체생성시 초기화하겠다는 내용

	public Smart_phone() {
		// super(); //슈퍼클래스의 생성자를 호출
		// 자식을 생성시 부모가 같이 생성되는 메소드?
		// 근데 안써도 생성됐던 이유는?
		// 정의 안하면 슈퍼클래스의 기본생성자를 호출해서
		// 근데 오류나는데? 그 이유는?
		// 아~ 매개변수 들어가있는 메서드 있어서!
		// 기본생성자가 안만들어짐
		// 어차피 기본생성자 호출안할건데? 그럼...
		super("Lg");
		// 매개변수 넣어줘버리면 됨!
		
		//super.message();
		//수퍼는 부모에
		//this.medssage();
		//디스는 부모,자식  싹!

	}

	public void internet() {
		System.out.println("인터넷 접속!");
	}

	public String get_speaker() {
		return super.get_speaker();
		// 슈퍼: 부모 멤버(필드,메서드)를 호출하겠다는건데..
		// 굳이 안만들어도 되는데~
		//자식에서 부모를 호출해서 사용하고싶을때 이렇게 써!
	}

}
