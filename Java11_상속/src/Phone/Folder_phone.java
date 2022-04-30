package Phone;

public class Folder_phone {
	//필드(속성) : 스피커,마이크
	//메서드(기능) : 전화,문자,접는다
	
	String speaker;
	boolean mic;
	
	public void call() {
		System.out.println("따르릉~♬");
	}
	public void message() {
		System.out.println("문자!");

	}
	
	public void fold() {
		System.out.println("접는다");
	}
}
