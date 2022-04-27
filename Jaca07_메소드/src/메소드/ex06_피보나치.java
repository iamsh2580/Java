package 메소드;

public class ex06_피보나치 {

	public static void main(String[] args) {

		// 자연상에 존재하는 피보나치 수열
		// 수열? : 어떤 규칙을 가지고
		// 차이가 동등하게 증가하는 수열 > 등차수열
		// 2 4 6 16 32 > 등비수열
		// 숫자들이 규칙적으로 나열되는것을 수열
		// 피보나치 수열 : 1 1 로 시작
		// 1+1 =2 > 1 1 2 3 5 8 13 21 34 55

		int num4 = 10;
		int result4 = fibonacci(num4);
		System.out.print("피보나치 수열의" + num4 + "번째 항은 " + result4 + "입니다.");

	}

	public static int fibonacci(int num4) {
		int result4 = 0;
		// 재귀함수
		// 자기 자신을 호출하는 함수

		// num4번째항의 얼마를 돌려주는지?
		// result4 = f1+f2+(f1+f2)+'''''
		// 1,2 항은 1

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
