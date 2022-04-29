package music_player;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class Main {

	public static void main(String[] args) {
		// 뮤직 플레이어 만들기!!
		Scanner sc = new Scanner(System.in);

		MP3Player mp3 = new MP3Player();
		
		//컨트롤러 안의 기능을 사용하기 위해 클래스 가져오기
		Controller con = new Controller();
		

		Music music1 = new Music("깡", "rain", 59,"C:\\Users\\smhrd\\Desktop\\music\\\\깡.mp3");
		// System.out.print(music1.getTitle());
		// System.out.print(music1.getSinger());
		// System.out.print(music1.getPlayTime());
		Music music2 = new Music("마리아", "화사", 59,"C:\\Users\\smhrd\\Desktop\\music\\Maria.mp3");
		Music music3 = new Music("망고", "이름모름", 59,"C:\\Users\\smhrd\\Desktop\\music\\Mango.mp3");
		Music music4 = new Music("how you like that", "블랙핑크", 59,"C:\\Users\\smhrd\\Desktop\\music\\How you like that.mp3");
		Music music5 = new Music("살짝설렜어", "오마이걸", 59,"C:\\Users\\smhrd\\Desktop\\music\\살짝설렜어.mp3");

		// 노래에 대한 정보를 정리하기 위해서 arraylist

		ArrayList<Music> list = new ArrayList<Music>();
		list.add(music1);
		list.add(music2);
		list.add(music3);
		list.add(music4);
		list.add(music5);

		// "깡" music1.getTitle() --- >0번째에 들어가 있는 상태
		// get을 사용해 list안에있는 데이터 가져옴

		// ---> list.get(0).getTitle을 한다면?
		//System.out.println(list.get(0).getTitle());
		
		int index = 0;
		
		
		while (true) {
			System.out.println("1. 재생  2.정지  3.이전곡  4.다음곡  5.종료  >>");
			// 사용자에게 입력받은 정수 숫자 변수
			int menu = sc.nextInt();

			if (menu == 1) {// 재생
				//mp3.play(String path);
				//경로접근 get path
				con.play(list,index);
				System.out.println(list.get(index).getSinger());
				System.out.println(list.get(index).getPlayTime());
				
				//
				
				
			} else if (menu == 2) {// 정지
				//노래를 멈추는 기능
				
					con.stop();
				
				//노래가 재생중일때만 멈추는 기능 
				

			} else if (menu == 3) {// 이전곡
			
					con.stop();
						
					
				index--;
				
				if(index <0) {
					index = list.size()-1;
					con.play(list,index);
					System.out.println(list.get(index).getSinger());
					System.out.println(list.get(index).getPlayTime());
				}



				
			} else if (menu == 4) {// 다음곡
				//인덱스 +1
				//증가된 인덱스 값 안에 들어있는 노래를 재생시키자.
			
					index++;
				if(index>=list.size()-1) {
					index = 0;
				}
				con.stop();

				con.play(list,index);
					System.out.println(list.get(index).getSinger());
					System.out.println(list.get(index).getPlayTime());
					
				
				

			} else if (menu == 5) {//종료
				System.out.println("종료합니다.");
			} else {
				System.out.println("잘못 입력");
			}

		}

	}

}
