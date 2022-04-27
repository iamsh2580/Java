package Animal;

import java.util.ArrayList;

public class AnumalMain {

	public static void main(String[] args) {
		
		//객체생성
		Lion lion = new Lion();
		Rabbit rabbit = new Rabbit();
		//각각 라이언,레빗 자료형이라 같은 배열에 넣을 수 업성유~
		
		//위에는 같은 클래스라 가능한건가요? public이라서
		
		// new Animal(); 추상클래스라서 객체 생성 불가능
		//추상클래스의 기능 물려받아 사용하고 싶을때 또는
		//추상메서드를 무조건 재정의해야한다고 강제성 부여할때 사용
		
		lion.attack();
		rabbit.attack();
		
		//업캐스팅
		Animal a1 = lion; //자식타입을 부모로 바꿈
		//근데 작은거(하위)에서 큰거(상위)로 변하는건 굳이 적지않아도 자동 형변환 해줌
		Animal a2 = new Lion();
		Animal a3 = rabbit;
		
		//한 공간안에 담기위해 업캐스팅 했어요!
		
		ArrayList<Animal> al = new ArrayList<Animal>();
		al.add(a1);
		al.add(a3);
		al.add(new Lion()); //	=	Animal a2 = new Lion();
		
		for(Animal a:al) { //arr타입의 각 변수를 a라고 사용가능?
			a.move();
			
		}
		
		//a1.sleep(); a1은 라이언이었으나 업캐스팅되어 오버라이딩굉세 아닌 원래 메소드는 사용할 수 없게된다
		//업캐스팅 된 객체를 원래상태로 돌려주는 것 -> 다운캐스팅(명시적형 반환 > 자동으로 안됨)
		//Lion l = al;  다운캐스팅에는 이렇게 쓰면 ㄴㄴ 큰걸 작은것에 넣으려하니.;;
		Lion l = (Lion)a1;
		l.sleep();
		
		
	}

}
