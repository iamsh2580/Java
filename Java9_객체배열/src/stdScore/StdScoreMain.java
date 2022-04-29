package stdScore;

import java.util.Scanner;

public class StdScoreMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		stdScore[] std_arr = new stdScore[3];
		
		
		//---------------------------------------------------
		//stdScore s1 = new stdScore();  //!!!!!!!
		//s1.setName(sc.next());
		
		//s1.set~ 이거 다 하고
		
		//std_arr[0] = s1;
		
		
		//---------------------------------------------------
		
		

		for (int i = 0; i < std_arr.length; i++) {
			std_arr[i] = new stdScore();

			System.out.print((i + 1) + "번쟤 학생의 이름을 입력하세요. >> ");
			std_arr[i].setName(sc.next());
			System.out.print((i + 1) + "번쟤 학생의 java점수를 입력하세요. >> ");
			std_arr[i].setScoreJava(sc.nextInt());
			System.out.print((i + 1) + "번쟤 학생의 web점수를 입력하세요. >> ");
			std_arr[i].setScoreWeb(sc.nextInt());
			System.out.print((i + 1) + "번쟤 학생의 android점수를 입력하세요. >> ");
			std_arr[i].setScoreAndroid(sc.nextInt());
			
			System.out.println();
			//std_arr[i]=s1;
		}

		
		
		for(int i = 0;i<std_arr.length;i++) {
			int sum = std_arr[i].getScoreJava() +std_arr[i].getScoreWeb() + std_arr[i].getScoreAndroid();
		int avg = sum/3;
			System.out.println(std_arr[i].getName() + "님의 총점은" + sum +", 평균은" + avg +"입니다.");
		}
		
	}

}
