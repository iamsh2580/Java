package 메소드;

import java.util.Scanner;

public class ex01 {

	
	//static지우면 논스테틱인데 메인메서드 스테틱키워드 
	private static void getMinusVal(int a, int b) {
//  접근 제한자 정적 키워드  반환타입 메서드 이름 () {..}
		
		System.out.print("결과 : " + (a-b));
	}
//스테틱메서드안에서 논스테틱을 호출 >> 불가능
//non스테틱 메서드를 호출하려면 객체,인슽언스 생성 후 호출 
	
	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 수 : ");
		int num2 = sc.nextInt();
		
		getMinusVal(num1,num2);
		
	}

}
