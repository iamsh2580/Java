package RandomToyMachine;

public class ToyMain {

	public static void main(String[] args) {
		
		RandomToyMachin rtm = new RandomToyMachin();       
		
		//�ִ� ��� 1
		Ball ball = new Ball();
		//�� �ڿ� ���°� �׳� ����°�? �̰� ������ ������!
		//��ü����!!! ���� ��!!
		
		
		rtm.addToy(ball);
		//�ִ� ��� 2
		rtm.addToy(new Train());
		rtm.addToy(new Gun());
		
		//��ĳ���� ���ص��Ǵµ�? new Ball�� ����Ÿ���� ���̷� �޾��ְڴ�
		//������ ��? �ڵ�����ȯ �θ�Ÿ������ �ڵ�����ȯ��
		
		
		//���� �̱�
		rtm.getToy().play();;		

		
		
		
		
		
		
	
		
	}

}
