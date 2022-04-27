package Animal;

public class Rabbit extends Animal{

	//필드: 눈,귀
	//메서드:움직이다.공격하다,뛰다
	
	public void jump() {
		System.out.println("토끼 뛰다");
	}
	
	@Override
	public void move() {
		System.out.println("토끼 움직임");
		
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("토끼 공격");
		
	}
	
	
}
