package Person;

public class Student extends Person {

	String std_id = "123";
	String grade;

	//st��ü ������ �� stringŸ���� �Ű����� �ϳ� �ްڴ�!
	public Student(String name) {
		//�Ű������� ���� ���� ����Ŭ����(�θ�)�� ������ ȣ��� ���
		super(name);
	}//��?

	//�������̵�
	public void walk() { 
		System.out.println("�ɾ �б�����.");
	}
}
