package 예제1;

public class 주소록메인 {

	public static void main(String[] args) {

		//객체(인스턴스) 생성
		new 주소록(); //소괄호 뒤 열어져있으면? 메서드
					//생성자라는 메서드? 객체생성!

		주소록 sc = new 주소록();

		sc.name = "김이박";
		sc.address = "내집주소";
		sc.number = 1;

		System.out.println("이름 : " + sc.name);
		System.out.println("주소 : " + sc.address);
		System.out.println("번호 : " +sc.number);
		
		sc.showAddr();
		
		//하나 더 넣으려면 또 하나의 객체(인스턴스)생ㅅㅇ
		//인스턴스는 자기만의 인스턴스를 
		new 주소록();

		sc.name = "최최";
		sc.address = "니집주소";
		sc.number = 2;

		System.out.println(sc.name);
		System.out.println(sc.address);
		System.out.println(sc.number);
		
		sc.showAddr();

	}

}
