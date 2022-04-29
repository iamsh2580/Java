package Product;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	//	System.out.print("등록할 상품 종류 : ");
	//	int num = sc.nextInt();
//애열 생성!

		System.out.println("물건 개수 입력 : ");
		int num = sc.nextInt();
		Product[] pd = new Product[num];

		for (int i = 0; i <pd.length; i++) {
	//		pd[i] = new Product[num];

			System.out.print(i + 1 + ") 물건 이름 : ");
			String name = sc.next();
			System.out.print(i + 1 + ") 단가 : ");
			int price = sc.nextInt();
			System.out.print(i + 1 + ") 수량 : ");
		    int amount = sc.nextInt();
		    
		   pd[i] =  new Product(name,price,amount);
		}
		System.out.println("제품명\t단가\t수량");
		int total = 0;
		for(int i = 0;i<pd.length;i++) {
		System.out.printf("%s\t%d\t%d",pd[i].getName(),pd[i].getUnitPrice(),pd[i].getAmount());
		total += pd[i].getUnitPrice()*pd[i].getAmount();
		
		}
	System.out.println("총 금액 : " + total + "원");
	}

}
