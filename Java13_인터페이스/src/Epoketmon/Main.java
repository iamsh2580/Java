package Epoketmon;

public class Main {

	public static void main(String[] args) {
		
		//Epoketmon e  = new epoketmon  �������̽� ��ü ���� �Ұ���
		
		
		Pikachu p = new Pikachu();
		Coil c = new Coil();
		//�������̽��� ��ĳ���� ����!
		
		//��ĳ���� �ߴ�! (�ڵ�����ȯ)
		Epoketmon e1 = p;
		Epoketmon e2 = c;
		
		Epoketmon[] e_arr = new Epoketmon[2];
		
		
		e_arr[0] = p; //��ī�� -> �������ϸ����� ��ĳ����(�ڵ�����ȯ)
					  //�� �迭�� �������ϸ�Ÿ�� �̶��? ��ī��Ÿ���� �ƴϴ�?
		e_arr[1] = e2;
		
		

	}

}
