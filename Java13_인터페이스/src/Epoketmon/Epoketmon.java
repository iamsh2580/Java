package Epoketmon;

public interface Epoketmon {
	
	//����� �߻�޼��� �����ҰԿ�

	//���� ������ ����� ���� ���� = final
	//����� ������ ������ �� �ʱ�ȭ ���������
	final String type = "����";
	int level=1; //�ڵ����� ��������� ��ȯ
	//�������̽� �������� ���� ������ �Ұ����ϱ⶧���� 
	//final Ű���带 �ٿ����� �ʾƵ� ����� ���� ����
	//��, �ʱ�ȭ�� �ʼ�!
	
	//�޼��� ���� ����!
	//�������̽� �������� �߻�޼��常 ���� ����!
	public abstract void attack();
	public void moving(); //abstract Ű���带 ������ �ʾƵ� �߻�޼���� �����
	
	//ver8������ �Ϲݸ޼��嵵 ���� ���� (default,static)
	//���⼭ ����ϴ� default�� ���������ڰ� �ƴ�
	//�������̽� ������ �Ϲݸ޼��带 ������ �� �ְ� ���ִ� Ű����
	public default void hello() {
		System.out.println("�ȴ�");
	}
	//���� �޼���� ����� ��� ����
	public static void hello1() {
		System.out.println("����");
	}

}
//�������̽��δ� ��ü���� �Ұ����ϴϱ� �����ϴ°� ����~ 
