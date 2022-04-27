package 예제1;

public class 우유맛쿠키 {

	// 우유맛 쿠키 설계
	// 속성(field),행동(method)

	// 1.속성(field) : 이름,레벨,공격력

	String name; // 이름이 있어야돼!
	int level;
	int power;

	// 생성자 : new키워드를 사용해서 객체를 생성할때만 호출되는 메서드
	// 접근제한자 클래스이름(){} - 생성자 구조
	// 기본생성자 : 매개변수x,기능x
	// 개발자가 다른 생성자를 정의하지 않으면 컴파일러 자동으로 생성해줌
	public 우유맛쿠키() {

	}
	// public 우유맛쿠키() {
	// 같은 클래스 내 같은 구는 존재 xxx
	// }

	public 우유맛쿠키(String name, int level, int power) {
		this.name = name;
		this.level = level;
		this.power = power;

	}

	// 2.행동(method) : 공격한다,걷는다
	// 다른곳에서 만들면 사용가능해야하니까 public이 좋을것같아요~
	public void attack() {
		System.out.println(name + "공격!");
	}

	public void walk() {
		System.out.println("걷는다~");
	}

}
