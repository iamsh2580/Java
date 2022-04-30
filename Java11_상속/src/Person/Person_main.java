package Person;

public class Person_main {

	public static void main(String[] args) {

		Student s1 = new Student("부쉬맨");

		System.out.println(s1.getName());
		System.out.println(s1.std_id);

		s1.walk();

		// 업캐스팅: 하위클래스의 객체를 상위클래스로 형변환(자동) 하는것
		// 왜? 상위>하위 개념이니까 자동으로 형변환
		Person p = s1;
		// s객체의 참조값을 가졌는데 이 값을
		// person객체의 참조값을 가진 p에 넣어서 업캐스팅
		p.walk();

		// 부모타입이 되었어도 오버라이딩한건 이전값을 출력 > 동적바인딩
		// System.out.println(p.std_id);
		// 속성은 오버라이딩 없고, 그래서 못쓰나봐~
		// 업캐스팅 되었을 때는 그 전 상태(하위상태)의 객체 멤버에는 접근 x
		// 단, 오버라이딩 된 경우네는 하위클래스의 메서드를 호출
		System.out.println();
		Student p1 = new Student("브레드");
		Teacher p2 = new Teacher("아웃백");
		// 지금은 타입이 다르기때문에 배열,어레이 답을 수 없다
		// 그래서 person을 상속받고있으니 , person타입으로 맞춰준다

		// 업캐스팅 공식
		Person ps1 = p1;
		Person ps2 = p2;

		Person[] p_arr = new Person[2];

		p_arr[0] = ps1;
		p_arr[1] = ps2;

		for (Person person : p_arr) {
			person.walk();
			// 이전에 학생,선생 이여서 오버라이딩된거 써짐
		}
		// ps1.std_id; - 못함
		// 업캐스팅 된 상태에서 원래 어떤 타입이었는지 알고싶을 떄 사용하는 연산자는
		// 클래스명 instanceof 예측클래스명 맞으면 t 아니면 f = 조건문에 활용 가능하겠네!
		System.out.println(ps1 instanceof Student);
		System.out.println(ps1 instanceof Teacher);
		// 다운 캐스팅 : 업캐스팅된 객체를 원래 타입으로 다시 되돌리는 것
		// 명시적 형변환 ( 왜? 큰것을 작은것에 담으려니까!)
		Student p3 = (Student) ps1;
		System.out.println(p3.std_id);

	}// main 끝

}
