package Musicplayer;

import java.util.ArrayList;

import javazoom.jl.player.MP3Player;
import music_player.Music;

public class MusicController {


	static MP3Player mp3 = new MP3Player();
	
	public static void main(String[] args) {

}
public static void play(ArrayList<Music> list,int index) {
mp3.play(list.get(index).getPath());
}
public static void stop() {
	if(mp3.isPlaying() == true){
		mp3.stop();
	}
}
}
