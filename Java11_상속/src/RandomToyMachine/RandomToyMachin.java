package RandomToyMachine;

import java.util.ArrayList;
import java.util.Random;

public class RandomToyMachin {

		//arraaylist�ʿ�, random�ʿ�
	//���: �峭�� �߰� ���, �����Ǻ� ���
	ArrayList<Toy> toyList = new ArrayList<Toy>();
	Random r = new Random();
	


	public void addToy(Toy toy) {
		// arrya�߰�
		toyList.add(toy);
		//������ �ӽ� �ν��Ͻ��� t_l�ʤ��� �峭�� �߰�

		

	}

	public Toy getToy() {
		//0~2������ �ε��� �� �������� �ϳ� ����  (3) ���� �ؾߵ�
		int ran =  r.nextInt(toyList.size());
		return toyList.get(ran);
		
	}

}
