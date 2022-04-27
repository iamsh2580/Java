package 메소드;

public class ex05_예제5 {

	public static void main(String[] args) {

		// 약수라면 트루 아니면 펄스

		int num1 = 10;
		int num2 = 2;

		// 돌려받을 타입
		//
		// is메서드는 불리언타입
		boolean result = isDevisor(num1, num2);
		System.out.println(result);

		// 출력하는 기능이 들어가있는 메서드를 만들자! > void
		getDivisor(24);

		// god()메서드
		int num = 10; // 메서드에게 보낼 ㅕㅂㄴ수
		int result2 = getSomeOfDevisor(num);

		System.out.println("약수의 합 : " + result2);

		// isPerfectNumber
		// 완전수 : 자기 자신을 제외한 약수들의 합이 자기자신과 같은 수
		// 6 > 1 2 3 6 1+2+3= 6 <완전수
		// 9 > 1 3 9 1+3 != 9 < 완전수 아니다

		int num3 = 8128;
		boolean result3 = isPerfectNumber(num3);
		System.out.println("이게 완전수니? >> " + result3);
		
		int startNumber =2;
		int endNumber = 1000;
		getPerfectNumber(startNumber,endNumber);
		//2~1000사이의 완전수를 구하자
		
		
		

	}

	public static boolean isDevisor(int num1, int num2) {

		// 타입확인해!
		boolean result = false;

		// num1,2로 나눴을때 나누어 떨어지니?
		// num2가 num1의 약수?
		// num1이 2 의 배수? >> true값

		if ((num1 % num2 == 0) || (num2 % num1 == 0)) {

			return true;
		} else {
			return false;
		}

	}

	public static void getDivisor(int num) {

		String result = "";

		result += num;

		// 24의 약수

		System.out.print("24의 약수: ");

		for (int i = 1; i < 25; i++) {

			if (num % i == 0) {
				System.out.print(i + " ");

				result += i;
			}
		}

		// System.out.print(result); //string에 숫자넣어도 되나유ㅜ?

	}

	public static int getSomeOfDevisor(int num) {
		int result2 = 0;
		// 만약 num에 10이 들어왔다면 10의약수가 1 2 5 10

		// int 타입 = 4byte
		// 1byte = 8bit
		// 1bit = 2^1
		// 1byte 2^8 =256
		// 4byte 2^32 = 43억
		for (int i = 1; i <= num; i++) {

			if (num % i == 0) {
				result2 += i;
			}
		}
		return result2;

	}

	public static boolean isPerfectNumber(int num) {

		// isPerfectNumber
		// 완전수 : 자기 자신을 제외한 약수들의 합이 자기자신과 같은 수
		// 6 > 1 2 3 6 1+2+3= 6 <완전수
		// 9 > 1 3 9 1+3 != 9 < 완전수 아니다
		boolean result3 = false;
		int sum = 0;

		// 만약 넘이 완전수라면 트루 리턴

		if (getSomeOfDevisor(num) / 2 == num) {

			result3 = true;

		}
		return result3;

	}
	
	public static void getPerfectNumber(int startNumber,int endNumber) {
		
		String result = "";
		result += startNumber + " ~ " + endNumber + "까지의 완전수 : " ;
		System.out.print(result);
		for(int i =2 ; i<=1000;i++) {
		if(getSomeOfDevisor(i) / 2 == i) { //isperfect~==true 해도됨;
			System.out.print(i +" ");
			result += i;
		}
		}
		
		
	}
	
	
}
