package ������;

public class Calculator {

	private int num1;
	private int num2;
	
	//����Ÿ�� ������ x  -�̸� void ������
	

	
	public Calculator(int a,int b) {
		super();
		num1 = a;
		num2 =b;
		
	}
	
	public void setNum1(int a){
		
		num1 = a;
	}
	
	public void setNum2(int b){
		num2 = b;
	}
	
	public int sum(){
		return num1 +num2;
	}
	
	public int sub(){
		return num1-num2;
	}
	
	public int mul(){
		return num1*num2;
	}
	
	public double div(){
		return (double)num1/num2;
	}
	
	
	
	
}
