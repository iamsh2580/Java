package Student;

public class Student_main {

	public static void main(String[] args) {
		
		//1. student 객체 배열 래퍼런스 변수 선언
		//Student[] std_arr;
		
		//2.2명의 student객체의 참조값을 저장할 수 있는 래퍼런스 배열 생성
		Student[] std_arr = new Student[2];

		//3.각 인덱스에 객체 참조값 저장
		//3-1. 생성된 s객체의 참조값을 바로 0번 인덱스에 할당
		std_arr[0] = new Student();
		
		//3-2.객체 생성 후 변수에 저장된 참조값을 1번 인덱스에 할당
		Student std2 = new Student();
		//s참조값을 std2라는 변수가 가지고있다
		std_arr[1]= std2;
		
		
		//4.생성된 각 객체의 값 초기화
		//4-1.str_Arr[0]: std_Arr 변수가 가지고있는 참조값 가지고
		//래퍼런스 배열을 찾아가서 그 중에서 0번인덱스에 저장되어있는 stu
		//객체 참조값ㅇ르 가지고 해당 객체를 찾아감
		//찾아가 
		std_arr[0].setName("김미희");
		std_arr[0].setBan(1);
		std_arr[0].setNum(10);
		
		std_arr[1].setName("박병관");
		std_arr[1].setBan(2);
		std_arr[1].setNum(20);
		
		System.out.println(std_arr[0].getName());
		System.out.println(std_arr[0].getBan() + "반");
		System.out.println(std_arr[0].getNum() + "번");
		//set은 값 일력받아 저장하는거고, get은 그값을 출력? 해주느 건가?
		
		System.out.println(std_arr[0].toString()); //뭐 문자열로 바꾼다고?
		
		
		
		
	}

	@Override
	public String toString() {
		return "Student_main [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";//?
	}

}
