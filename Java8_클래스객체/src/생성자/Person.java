package 생성자;

public class Person {

	private String name;
	private int age;

	public Person() {

	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public String getName() {

		return name;

	}

	public void setName(String name) {
		//super(); //상속 : grandma클래스 상속
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}// 끝
