package 메소드;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ex03_예제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("배열의 길이 : ");
		int len = sc.nextInt();
		int[] arr = getArr(len);

		// 스테틱메서드라서 바로 사용 가능\
		System.out.print(Arrays.toString(arr));
		
		boolean sw = isDuplicate(arr);
		System.out.print("결과 : " + sw);

	}

	public static int[] getArr(int len) {

		Random rd = new Random();
		// 사용자가 입력한 길이만큼의 배열 생성
		int[] arr = new int[len];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = rd.nextInt(20) + 1; // 그냥20은 0~19
		}

		return arr;

	}
	
	private static boolean isDuplicate(int[] arr) {
		
		
		boolean sw = false;
		//0vs1  0 vs2  ..0같은값 끝! / 1vs0??필요 ㄴ 1도 2번만 필요
		for(int i =0;i<arr.length-1;i++) {
			
			for(int j =i+1; j<arr.length ;j++){
				if(arr[i] == arr[j]) {
					//sw = true;
					return true;
					//return만나면 해당 값 반환하고 메소드 종료
				}
			}			
		}
		
		//return sw;
	}


	
	
	
}
