package 생성자;

import java.util.Scanner;

public class Calculator_main {

	public static void main(String[] args) {
		
		
		//기본생성자는 생성자가 하나라도 정해져있으면
		//안만들어져 그래서 매개변수있는거 하나기떄문에
		//하나밖에 안써요 (?)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1번째 숫자 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("2번째 숫자 입력 : ");
		int num2 = sc.nextInt();
		
		 Calculator cal = new Calculator(num1,num2);
		 
		 System.out.print("더한 값: ");
		System.out.println(cal.sum());

		cal.setNum1(75);
		cal.setNum2(5);
		
		System.out.print("뺀 값: ");
		System.out.println(cal.sub());
		
	}

}

//질문
//그냥 () 한거랑 cal = new~ 한거 무슨차이?
//없는거랑 void랑 먼차이?