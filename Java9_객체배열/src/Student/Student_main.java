package Student;

public class Student_main {

	public static void main(String[] args) {
		
		//1. student ��ü �迭 ���۷��� ���� ����
		//Student[] std_arr;
		
		//2.2���� student��ü�� �������� ������ �� �ִ� ���۷��� �迭 ����
		Student[] std_arr = new Student[2];

		//3.�� �ε����� ��ü ������ ����
		//3-1. ������ s��ü�� �������� �ٷ� 0�� �ε����� �Ҵ�
		std_arr[0] = new Student();
		
		//3-2.��ü ���� �� ������ ����� �������� 1�� �ε����� �Ҵ�
		Student std2 = new Student();
		//s�������� std2��� ������ �������ִ�
		std_arr[1]= std2;
		
		
		//4.������ �� ��ü�� �� �ʱ�ȭ
		//4-1.str_Arr[0]: std_Arr ������ �������ִ� ������ ������
		//���۷��� �迭�� ã�ư��� �� �߿��� 0���ε����� ����Ǿ��ִ� stu
		//��ü ���������� ������ �ش� ��ü�� ã�ư�
		//ã�ư� 
		std_arr[0].setName("�����");
		std_arr[0].setBan(1);
		std_arr[0].setNum(10);
		
		std_arr[1].setName("�ں���");
		std_arr[1].setBan(2);
		std_arr[1].setNum(20);
		
		System.out.println(std_arr[0].getName());
		System.out.println(std_arr[0].getBan() + "��");
		System.out.println(std_arr[0].getNum() + "��");
		//set�� �� �Ϸ¹޾� �����ϴ°Ű�, get�� �װ��� ���? ���ִ� �ǰ�?
		
		System.out.println(std_arr[0].toString()); //�� ���ڿ��� �ٲ۴ٰ�?
		
		
		
		
	}

	@Override
	public String toString() {
		return "Student_main [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";//?
	}

}
