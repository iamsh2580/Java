package Phone;

public class Phone {

	// �ȵ�(�Ӽ�) : ����Ŀ,����ũ
	// �޼���(���) : ��ȭ�ϴ�,�����ϴ�

	private String speaker = "�Ｚ";
	private boolean mic;

	// ������
	
	
	public Phone()
	{
		
	}	
	public Phone(String speaker) {
		this.speaker = speaker;

	}

	public void call() {
		System.out.println("������~��");
	}

	public void message() {
		System.out.println("����!");
	}

	public String get_speaker() {
		return speaker;
	}
}
