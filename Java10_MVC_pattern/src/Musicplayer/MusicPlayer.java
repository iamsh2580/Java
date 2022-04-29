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
		
		Music music1 = new Music("유리구슬", "여자친구", 59,"C:\\Users\\smhrd\\Desktop\\music\\\\깡.mp3");
		
		ArrayList<Music> list = new ArrayList<Music>();
		
		
		int index = 0;
		
		while(true){
			System.out.println("===뮤직플레이어===");
			System.out.print("1.등록 2.목록 3.실행 4.이전곡 5.다음곡 6.종료 >> " );
			int num = sc.nextInt();

			if(num == 1){
			//등록
			System.out.println("===등록===");


			} else if(num == 2){
			//목록
			System.out.println("===노래목록===");

			} else if(num ==3){
			//실행
			System.out.println("===실행===");
			con.play(list,index);
			System.out.println(list.get(index).getSinger());
			System.out.println(list.get(index).getPlayTime());
			}else if(num == 4){
			//이전곡
			System.out.println("===이전곡===");

			con.stop();
			
			
		index--;
		
		if(index <0) {
			index = list.size()-1;
			con.play(list,index);
			System.out.println(list.get(index).getSinger());
			System.out.println(list.get(index).getPlayTime());
		}
			
			}else if(num == 5){
			//다음곡
			System.out.println("===다음곡===");

			index++;
		if(index>=list.size()-1) {
			index = 0;
		}
		con.stop();

		con.play(list,index);
			System.out.println(list.get(index).getSinger());
			System.out.println(list.get(index).getPlayTime());
		

			}else if(num == 6){
				System.out.println("종료합니다.");
			}else{
			System.out.println("정확한 숫자를 입력해주세요.");
			}
	}

}
