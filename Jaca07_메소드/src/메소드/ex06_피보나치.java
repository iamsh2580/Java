package �޼ҵ�;

public class ex06_�Ǻ���ġ {

	public static void main(String[] args) {

		// �ڿ��� �����ϴ� �Ǻ���ġ ����
		// ����? : � ��Ģ�� ������
		// ���̰� �����ϰ� �����ϴ� ���� > ��������
		// 2 4 6 16 32 > ������
		// ���ڵ��� ��Ģ������ �����Ǵ°��� ����
		// �Ǻ���ġ ���� : 1 1 �� ����
		// 1+1 =2 > 1 1 2 3 5 8 13 21 34 55

		int num4 = 10;
		int result4 = fibonacci(num4);
		System.out.print("�Ǻ���ġ ������" + num4 + "��° ���� " + result4 + "�Դϴ�.");

	}

	public static int fibonacci(int num4) {
		int result4 = 0;
		// ����Լ�
		// �ڱ� �ڽ��� ȣ���ϴ� �Լ�

		// num4��°���� �󸶸� �����ִ���?
		// result4 = f1+f2+(f1+f2)+'''''
		// 1,2 ���� 1

		if (num4 == 1) {

			return 1;

		} else if (num4 == 2) {

			return 1;

		} else  {
			//result4 = fibonacci(num4-2) + fibonacci(num4-1);
			return fibonacci(num4-2) + fibonacci(num4-1);
		}
		}

}
