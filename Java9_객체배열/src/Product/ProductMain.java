package Product;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	//	System.out.print("����� ��ǰ ���� : ");
	//	int num = sc.nextInt();
//�ֿ� ����!

		System.out.println("���� ���� �Է� : ");
		int num = sc.nextInt();
		Product[] pd = new Product[num];

		for (int i = 0; i <pd.length; i++) {
	//		pd[i] = new Product[num];

			System.out.print(i + 1 + ") ���� �̸� : ");
			String name = sc.next();
			System.out.print(i + 1 + ") �ܰ� : ");
			int price = sc.nextInt();
			System.out.print(i + 1 + ") ���� : ");
		    int amount = sc.nextInt();
		    
		   pd[i] =  new Product(name,price,amount);
		}
		System.out.println("��ǰ��\t�ܰ�\t����");
		int total = 0;
		for(int i = 0;i<pd.length;i++) {
		System.out.printf("%s\t%d\t%d",pd[i].getName(),pd[i].getUnitPrice(),pd[i].getAmount());
		total += pd[i].getUnitPrice()*pd[i].getAmount();
		
		}
	System.out.println("�� �ݾ� : " + total + "��");
	}

}
