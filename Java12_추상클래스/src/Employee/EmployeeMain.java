package Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		
		//래퍼런스 변수 = 객체 생성
		TempEmployee te = new TempEmployee("SMHRD001","한수진",3000);
		RegularEmployee re = new RegularEmployee("SMHRD002","두수진",4000,400);
		PartTimeEmployee pe = new PartTimeEmployee("SMHRD003","세수진",10,20);
		
		System.out.println(te.print());
		System.out.println(re.print());
		System.out.println(pe.print());
				
		//업캐스팅 중 > employee타입으로!
		Employee e1 = te; //작은것에서 큰거롤 바꿀때는 자동변환되니까 안적어도됩니당
		
		Employee[] emp_arr = new Employee[3];
		
		emp_arr[0] = e1;
		
		emp_arr[1] = re; //업캐스팅 자동형변환 된 상태로 참조값 할당됨
		emp_arr[2] = pe;

	}

}
//추상클래스는 추상메서드가 하나라도 있으면 무조건 추상클래스
//객체생성 불가 
//추상클래스는 기능없으니까 바로 사용할수없고
//추클 상속받은 하위클래스에서 재정의해야 쓸수있습니다..

