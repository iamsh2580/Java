package �޼ҵ�;

public class ex05_����5 {

	public static void main(String[] args) {

		// ������ Ʈ�� �ƴϸ� �޽�

		int num1 = 10;
		int num2 = 2;

		// �������� Ÿ��
		//
		// is�޼���� �Ҹ���Ÿ��
		boolean result = isDevisor(num1, num2);
		System.out.println(result);

		// ����ϴ� ����� ���ִ� �޼��带 ������! > void
		getDivisor(24);

		// god()�޼���
		int num = 10; // �޼��忡�� ���� �Ť�����
		int result2 = getSomeOfDevisor(num);

		System.out.println("����� �� : " + result2);

		// isPerfectNumber
		// ������ : �ڱ� �ڽ��� ������ ������� ���� �ڱ��ڽŰ� ���� ��
		// 6 > 1 2 3 6 1+2+3= 6 <������
		// 9 > 1 3 9 1+3 != 9 < ������ �ƴϴ�

		int num3 = 8128;
		boolean result3 = isPerfectNumber(num3);
		System.out.println("�̰� ��������? >> " + result3);
		
		int startNumber =2;
		int endNumber = 1000;
		getPerfectNumber(startNumber,endNumber);
		//2~1000������ �������� ������
		
		
		

	}

	public static boolean isDevisor(int num1, int num2) {

		// Ÿ��Ȯ����!
		boolean result = false;

		// num1,2�� �������� ������ ��������?
		// num2�� num1�� ���?
		// num1�� 2 �� ���? >> true��

		if ((num1 % num2 == 0) || (num2 % num1 == 0)) {

			return true;
		} else {
			return false;
		}

	}

	public static void getDivisor(int num) {

		String result = "";

		result += num;

		// 24�� ���

		System.out.print("24�� ���: ");

		for (int i = 1; i < 25; i++) {

			if (num % i == 0) {
				System.out.print(i + " ");

				result += i;
			}
		}

		// System.out.print(result); //string�� ���ڳ־ �ǳ�����?

	}

	public static int getSomeOfDevisor(int num) {
		int result2 = 0;
		// ���� num�� 10�� ���Դٸ� 10�Ǿ���� 1 2 5 10

		// int Ÿ�� = 4byte
		// 1byte = 8bit
		// 1bit = 2^1
		// 1byte 2^8 =256
		// 4byte 2^32 = 43��
		for (int i = 1; i <= num; i++) {

			if (num % i == 0) {
				result2 += i;
			}
		}
		return result2;

	}

	public static boolean isPerfectNumber(int num) {

		// isPerfectNumber
		// ������ : �ڱ� �ڽ��� ������ ������� ���� �ڱ��ڽŰ� ���� ��
		// 6 > 1 2 3 6 1+2+3= 6 <������
		// 9 > 1 3 9 1+3 != 9 < ������ �ƴϴ�
		boolean result3 = false;
		int sum = 0;

		// ���� ���� ��������� Ʈ�� ����

		if (getSomeOfDevisor(num) / 2 == num) {

			result3 = true;

		}
		return result3;

	}
	
	public static void getPerfectNumber(int startNumber,int endNumber) {
		
		String result = "";
		result += startNumber + " ~ " + endNumber + "������ ������ : " ;
		System.out.print(result);
		for(int i =2 ; i<=1000;i++) {
		if(getSomeOfDevisor(i) / 2 == i) { //isperfect~==true �ص���;
			System.out.print(i +" ");
			result += i;
		}
		}
		
		
	}
	
	
}
