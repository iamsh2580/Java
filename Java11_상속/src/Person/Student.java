package Person;

public class Student extends Person {

	String std_id = "123";
	String grade;

	//st객체 생성할 때 string타입의 매개변수 하나 받겠다!
	public Student(String name) {
		//매개변수로 받은 값을 슈퍼클래스(부모)의 생성자 호출시 사용
		super(name);
	}//몬말?

	//오버라이딩
	public void walk() { 
		System.out.println("걸어서 학교간다.");
	}
}
