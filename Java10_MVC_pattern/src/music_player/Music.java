package music_player;
public class Music {

	//mp3������
	//�뷡���� > title
	//�����̸� > singer
	//����ð� > playTime
	//getter
	//������ �޼���
	//���� ������ > private
	private String title;
	private String singer;
	private int playTime;
	
	//��ο� ���� ������ �־��ֱ�
	private String path;
	
	
	public Music( String title,String singer,int playTime,String path  ) {
		this.title = title;
		this.singer = singer;
		this.playTime = playTime;
		this.path = path;
		
	}
	
	public String getPath() {
		return path;
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

	
	
	

	
	
	
}
