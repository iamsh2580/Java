package RandomToyMachine;

import java.util.ArrayList;
import java.util.Random;

public class RandomToyMachin {

		//arraaylist필요, random필요
	//기능: 장난감 추가 기능, 랜덤뽀빅 기능
	ArrayList<Toy> toyList = new ArrayList<Toy>();
	Random r = new Random();
	


	public void addToy(Toy toy) {
		// arrya추가
		toyList.add(toy);
		//생성된 머신 인스턴스의 t_l필ㄷ에 장난감 추가

		

	}

	public Toy getToy() {
		//0~2까지의 인덱스 중 랜덤으로 하나 뽑음  (3) 으로 해야됨
		int ran =  r.nextInt(toyList.size());
		return toyList.get(ran);
		
	}

}
