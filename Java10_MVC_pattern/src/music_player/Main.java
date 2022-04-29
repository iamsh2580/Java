package music_player;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class Main {

	public static void main(String[] args) {
		// ���� �÷��̾� �����!!
		Scanner sc = new Scanner(System.in);

		MP3Player mp3 = new MP3Player();
		
		//��Ʈ�ѷ� ���� ����� ����ϱ� ���� Ŭ���� ��������
		Controller con = new Controller();
		

		Music music1 = new Music("��", "rain", 59,"C:\\Users\\smhrd\\Desktop\\music\\\\��.mp3");
		// System.out.print(music1.getTitle());
		// System.out.print(music1.getSinger());
		// System.out.print(music1.getPlayTime());
		Music music2 = new Music("������", "ȭ��", 59,"C:\\Users\\smhrd\\Desktop\\music\\Maria.mp3");
		Music music3 = new Music("����", "�̸���", 59,"C:\\Users\\smhrd\\Desktop\\music\\Mango.mp3");
		Music music4 = new Music("how you like that", "����ũ", 59,"C:\\Users\\smhrd\\Desktop\\music\\How you like that.mp3");
		Music music5 = new Music("��¦������", "�����̰�", 59,"C:\\Users\\smhrd\\Desktop\\music\\��¦������.mp3");

		// �뷡�� ���� ������ �����ϱ� ���ؼ� arraylist

		ArrayList<Music> list = new ArrayList<Music>();
		list.add(music1);
		list.add(music2);
		list.add(music3);
		list.add(music4);
		list.add(music5);

		// "��" music1.getTitle() --- >0��°�� �� �ִ� ����
		// get�� ����� list�ȿ��ִ� ������ ������

		// ---> list.get(0).getTitle�� �Ѵٸ�?
		//System.out.println(list.get(0).getTitle());
		
		int index = 0;
		
		
		while (true) {
			System.out.println("1. ���  2.����  3.������  4.������  5.����  >>");
			// ����ڿ��� �Է¹��� ���� ���� ����
			int menu = sc.nextInt();

			if (menu == 1) {// ���
				//mp3.play(String path);
				//������� get path
				con.play(list,index);
				System.out.println(list.get(index).getSinger());
				System.out.println(list.get(index).getPlayTime());
				
				//
				
				
			} else if (menu == 2) {// ����
				//�뷡�� ���ߴ� ���
				
					con.stop();
				
				//�뷡�� ������϶��� ���ߴ� ��� 
				

			} else if (menu == 3) {// ������
			
					con.stop();
						
					
				index--;
				
				if(index <0) {
					index = list.size()-1;
					con.play(list,index);
					System.out.println(list.get(index).getSinger());
					System.out.println(list.get(index).getPlayTime());
				}



				
			} else if (menu == 4) {// ������
				//�ε��� +1
				//������ �ε��� �� �ȿ� ����ִ� �뷡�� �����Ű��.
			
					index++;
				if(index>=list.size()-1) {
					index = 0;
				}
				con.stop();

				con.play(list,index);
					System.out.println(list.get(index).getSinger());
					System.out.println(list.get(index).getPlayTime());
					
				
				

			} else if (menu == 5) {//����
				System.out.println("�����մϴ�.");
			} else {
				System.out.println("�߸� �Է�");
			}

		}

	}

}
