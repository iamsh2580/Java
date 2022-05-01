package Employee;

public class TempEmployee extends Employee {

	public TempEmployee(String empno,String name,int pay) {
		this.empno = empno;
		//부모,자식 둘 다 접근 가능한 this
		this.name = name;
		this.pay = pay;
		
		
	}
	
	@Override
	public int getPay() {
		
		return pay/12;
	}

	
	
	
}
