package Student;

public class Student {

	// �Ӽ�(�ʵ�)
	private String name;
	private int ban;
	private int num;
	// �Ժη� ���� ���ϰ� ����������

	// ���(�޼���) :getter, setter (��
	public String getName() { // �̸��޾Ƽ� ? �ؾߵǴϱ� ���� ��ȯ��??
		return name;

	}

	public void setName(String name) { // �� ��ᰡ �ʿ��ϴٰ�??
		this.name = name;

	} // setter�� ���� ��ȯŸ��x

	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	
	
}
