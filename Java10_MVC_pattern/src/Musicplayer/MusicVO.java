package Musicplayer;

public class MusicVO {

	  private String title;
	   private String singer;
	   private int playTime;
	   
	   //경로에 대한 데이터 넣어주기
	   //private String path;
	   

	   public void MusicVo( String title,String singer,int playTime ) {
	      this.title = title;
	      this.singer = singer;
	      this.playTime = playTime;
	      
	   }
	   
	   
	   public String getTitle() {
	      return title;
	   }

	   public String getSinger() {
	      return singer;
	   }

	   public int getPlayTime() {
	      return playTime;
	   }

	   public void setTitle(String title) {
	      this.title = title;
	   }

	   public void setSinger(String singer) {
	      this.singer= singer;
	   }

	   public void setPlayTime(int playTime) {
	      this.playTime = playTime;
	   }
	   

	      // public String toString() {
	        // 안했다!
	   // }

}
