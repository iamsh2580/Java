package 생성자;

public class 생성자메인 {

	public static void main(String[] args) {

		new Person();

		Person ps = new Person();

		// Person ps = new Person("홍길동",25);

		ps.setName("홍길동");
		ps.setAge(25);

		Person ps2 = new Person("김영희", 27);

		System.out.println("str1객체 학생 이름 :" + ps.getName() +", 나이 : "+ps.getAge());
		System.out.println("str2객체 학생 이름 :" + ps2.getName() +", 나이 : "+ps2.getAge());
		

	}

}
