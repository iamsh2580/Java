package RandomToyMachine;

public class ToyMain {

	public static void main(String[] args) {
		
		RandomToyMachin rtm = new RandomToyMachin();       
		
		//넣는 방법 1
		Ball ball = new Ball();
		//뉴 뒤에 적는게 그냥 만드는거? 이걸 변수에 담은거!
		//객체생성!!! 이해 완!!
		
		
		rtm.addToy(ball);
		//넣는 방법 2
		rtm.addToy(new Train());
		rtm.addToy(new Gun());
		
		//업캐스팅 안해도되는데? new Ball을 토이타입의 토이로 받아주겠대
		//가능함 왜? 자동형변환 부모타입으로 자동형변환됨
		
		
		//랜덤 뽑기
		rtm.getToy().play();;		

		
		
		
		
		
		
	
		
	}

}
