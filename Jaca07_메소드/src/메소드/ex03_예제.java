package �޼ҵ�;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ex03_���� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("�迭�� ���� : ");
		int len = sc.nextInt();
		int[] arr = getArr(len);

		// ����ƽ�޼���� �ٷ� ��� ����\
		System.out.print(Arrays.toString(arr));
		
		boolean sw = isDuplicate(arr);
		System.out.print("��� : " + sw);

	}

	public static int[] getArr(int len) {

		Random rd = new Random();
		// ����ڰ� �Է��� ���̸�ŭ�� �迭 ����
		int[] arr = new int[len];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = rd.nextInt(20) + 1; // �׳�20�� 0~19
		}

		return arr;

	}
	
	private static boolean isDuplicate(int[] arr) {
		
		
		boolean sw = false;
		//0vs1  0 vs2  ..0������ ��! / 1vs0??�ʿ� �� 1�� 2���� �ʿ�
		for(int i =0;i<arr.length-1;i++) {
			
			for(int j =i+1; j<arr.length ;j++){
				if(arr[i] == arr[j]) {
					//sw = true;
					return true;
					//return������ �ش� �� ��ȯ�ϰ� �޼ҵ� ����
				}
			}			
		}
		
		//return sw;
	}


	
	
	
}
