package Person;

public class Person_main {

	public static void main(String[] args) {

		Student s1 = new Student("�ν���");

		System.out.println(s1.getName());
		System.out.println(s1.std_id);

		s1.walk();

		// ��ĳ����: ����Ŭ������ ��ü�� ����Ŭ������ ����ȯ(�ڵ�) �ϴ°�
		// ��? ����>���� �����̴ϱ� �ڵ����� ����ȯ
		Person p = s1;
		// s��ü�� �������� �����µ� �� ����
		// person��ü�� �������� ���� p�� �־ ��ĳ����
		p.walk();

		// �θ�Ÿ���� �Ǿ�� �������̵��Ѱ� �������� ��� > �������ε�
		// System.out.println(p.std_id);
		// �Ӽ��� �������̵� ����, �׷��� ��������~
		// ��ĳ���� �Ǿ��� ���� �� �� ����(��������)�� ��ü ������� ���� x
		// ��, �������̵� �� ���״� ����Ŭ������ �޼��带 ȣ��
		System.out.println();
		Student p1 = new Student("�극��");
		Teacher p2 = new Teacher("�ƿ���");
		// ������ Ÿ���� �ٸ��⶧���� �迭,��� ���� �� ����
		// �׷��� person�� ��ӹް������� , personŸ������ �����ش�

		// ��ĳ���� ����
		Person ps1 = p1;
		Person ps2 = p2;

		Person[] p_arr = new Person[2];

		p_arr[0] = ps1;
		p_arr[1] = ps2;

		for (Person person : p_arr) {
			person.walk();
			// ������ �л�,���� �̿��� �������̵��Ȱ� ����
		}
		// ps1.std_id; - ����
		// ��ĳ���� �� ���¿��� ���� � Ÿ���̾����� �˰���� �� ����ϴ� �����ڴ�
		// Ŭ������ instanceof ����Ŭ������ ������ t �ƴϸ� f = ���ǹ��� Ȱ�� �����ϰڳ�!
		System.out.println(ps1 instanceof Student);
		System.out.println(ps1 instanceof Teacher);
		// �ٿ� ĳ���� : ��ĳ���õ� ��ü�� ���� Ÿ������ �ٽ� �ǵ����� ��
		// ����� ����ȯ ( ��? ū���� �����Ϳ� �������ϱ�!)
		Student p3 = (Student) ps1;
		System.out.println(p3.std_id);

	}// main ��

}
