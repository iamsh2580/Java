package Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		
		//���۷��� ���� = ��ü ����
		TempEmployee te = new TempEmployee("SMHRD001","�Ѽ���",3000);
		RegularEmployee re = new RegularEmployee("SMHRD002","�μ���",4000,400);
		PartTimeEmployee pe = new PartTimeEmployee("SMHRD003","������",10,20);
		
		System.out.println(te.print());
		System.out.println(re.print());
		System.out.println(pe.print());
				
		//��ĳ���� �� > employeeŸ������!
		Employee e1 = te; //�����Ϳ��� ū�ŷ� �ٲܶ��� �ڵ���ȯ�Ǵϱ� ������˴ϴ�
		
		Employee[] emp_arr = new Employee[3];
		
		emp_arr[0] = e1;
		
		emp_arr[1] = re; //��ĳ���� �ڵ�����ȯ �� ���·� ������ �Ҵ��
		emp_arr[2] = pe;

	}

}
//�߻�Ŭ������ �߻�޼��尡 �ϳ��� ������ ������ �߻�Ŭ����
//��ü���� �Ұ� 
//�߻�Ŭ������ ��ɾ����ϱ� �ٷ� ����Ҽ�����
//��Ŭ ��ӹ��� ����Ŭ�������� �������ؾ� �����ֽ��ϴ�..

