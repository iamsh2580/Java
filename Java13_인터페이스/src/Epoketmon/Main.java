package Epoketmon;

public class Main {

	public static void main(String[] args) {
		
		//Epoketmon e  = new epoketmon  인터페이스 객체 생성 불가능
		
		
		Pikachu p = new Pikachu();
		Coil c = new Coil();
		//인터페이스도 업캐스팅 가능!
		
		//업캐스팅 했다! (자동형변환)
		Epoketmon e1 = p;
		Epoketmon e2 = c;
		
		Epoketmon[] e_arr = new Epoketmon[2];
		
		
		e_arr[0] = p; //피카츄 -> 전기포켓몬으로 업캐스팅(자동형변환)
					  //여 배열은 전기포켓몬타입 이라고? 피카츄타입이 아니다?
		e_arr[1] = e2;
		
		

	}

}
