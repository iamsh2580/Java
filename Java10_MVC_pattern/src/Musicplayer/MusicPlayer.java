package Musicplayer;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;
import music_player.Controller;
import music_player.Music;

public class MusicPlayer {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);

		MP3Player mp3 = new MP3Player();
		
		
		Controller con = new Controller();
		
		Music music1 = new Music("��������", "����ģ��", 59,"C:\\Users\\smhrd\\Desktop\\music\\\\��.mp3");
		
		ArrayList<Music> list = new ArrayList<Music>();
		
		
		int index = 0;
		
		while(true){
			System.out.println("===�����÷��̾�===");
			System.out.print("1.��� 2.��� 3.���� 4.������ 5.������ 6.���� >> " );
			int num = sc.nextInt();

			if(num == 1){
			//���
			System.out.println("===���===");


			} else if(num == 2){
			//���
			System.out.println("===�뷡���===");

			} else if(num ==3){
			//����
			System.out.println("===����===");
			con.play(list,index);
			System.out.println(list.get(index).getSinger());
			System.out.println(list.get(index).getPlayTime());
			}else if(num == 4){
			//������
			System.out.println("===������===");

			con.stop();
			
			
		index--;
		
		if(index <0) {
			index = list.size()-1;
			con.play(list,index);
			System.out.println(list.get(index).getSinger());
			System.out.println(list.get(index).getPlayTime());
		}
			
			}else if(num == 5){
			//������
			System.out.println("===������===");

			index++;
		if(index>=list.size()-1) {
			index = 0;
		}
		con.stop();

		con.play(list,index);
			System.out.println(list.get(index).getSinger());
			System.out.println(list.get(index).getPlayTime());
		

			}else if(num == 6){
				System.out.println("�����մϴ�.");
			}else{
			System.out.println("��Ȯ�� ���ڸ� �Է����ּ���.");
			}
	}

}
