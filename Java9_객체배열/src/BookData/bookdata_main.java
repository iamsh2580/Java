package BookData;

import java.util.ArrayList;
import java.util.Scanner;

public class bookdata_main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// bookdate[] bd = new bookdata[];

		ArrayList<bookdata> al = new ArrayList<bookdata>();

		int menu = 0;

		while (menu != 4) {

			System.out.println("1)å �߰� 2) å ���� 3) ���� �� �� �ִ� å 4) ����");
			menu = sc.nextInt();

			if (menu == 1) {
				System.out.print("å �̸� : ");
				String name = sc.next();
				System.out.print("����: ");
				int price = sc.nextInt();
				System.out.print("�۰�: ");
				String writer = sc.next();

				al.add(new bookdata(name, price, writer));
				
			} else if (menu == 2) {
					for(int i =0 ;i<al.size();i++) {//��̸���Ʈ�� ���� �� ������
						System.out.printf("%d. %s\t%d\t%s\n",i+1,al.get(i).getTitle(),al.get(i).getPrice(),al.get(i).getWriter() );
					}
					System.out.print("�����ϰ� ���� å >> ");
					int del_num = sc.nextInt();
					
					al.remove(del_num -1); //1�������Ҷ� 0�� ���õǾ���ϴϱ�~
					
			} else if (menu == 3) {
				System.out.print("�ݾ� : ");
				int money = sc.nextInt();
				
				for(int i =0 ;i<al.size();i++) {//��̸���Ʈ�� ���� �� ������
					if(money>=al.get(i).getPrice()) {
					System.out.printf("%d. %s\t%d\t%s\n",i+1,al.get(i).getTitle(),al.get(i).getPrice(),al.get(i).getWriter() );
				}
				}
				
				

			}

		}

	}

}
