package Animal;

import java.util.ArrayList;

public class AnumalMain {

	public static void main(String[] args) {
		
		//��ü����
		Lion lion = new Lion();
		Rabbit rabbit = new Rabbit();
		//���� ���̾�,���� �ڷ����̶� ���� �迭�� ���� �� ������~
		
		//������ ���� Ŭ������ �����Ѱǰ���? public�̶�
		
		// new Animal(); �߻�Ŭ������ ��ü ���� �Ұ���
		//�߻�Ŭ������ ��� �����޾� ����ϰ� ������ �Ǵ�
		//�߻�޼��带 ������ �������ؾ��Ѵٰ� ������ �ο��Ҷ� ���
		
		lion.attack();
		rabbit.attack();
		
		//��ĳ����
		Animal a1 = lion; //�ڽ�Ÿ���� �θ�� �ٲ�
		//�ٵ� ������(����)���� ū��(����)�� ���ϴ°� ���� �����ʾƵ� �ڵ� ����ȯ ����
		Animal a2 = new Lion();
		Animal a3 = rabbit;
		
		//�� �����ȿ� ������� ��ĳ���� �߾��!
		
		ArrayList<Animal> al = new ArrayList<Animal>();
		al.add(a1);
		al.add(a3);
		al.add(new Lion()); //	=	Animal a2 = new Lion();
		
		for(Animal a:al) { //arrŸ���� �� ������ a��� ��밡��?
			a.move();
			
		}
		
		//a1.sleep(); a1�� ���̾��̾����� ��ĳ���õǾ� �������̵����� �ƴ� ���� �޼ҵ�� ����� �� ���Եȴ�
		//��ĳ���� �� ��ü�� �������·� �����ִ� �� -> �ٿ�ĳ����(������� ��ȯ > �ڵ����� �ȵ�)
		//Lion l = al;  �ٿ�ĳ���ÿ��� �̷��� ���� ���� ū�� �����Ϳ� �������ϴ�.;;
		Lion l = (Lion)a1;
		l.sleep();
		
		
	}

}
