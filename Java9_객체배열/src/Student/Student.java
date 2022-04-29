package Student;

public class Student {

	// 속성(필드)
	private String name;
	private int ban;
	private int num;
	// 함부로 접근 못하게 접근제한자

	// 기능(메서드) :getter, setter (값
	public String getName() { // 이름받아서 ? 해야되니까 같은 반환형??
		return name;

	}

	public void setName(String name) { // 왜 재료가 필요하다고??
		this.name = name;

	} // setter는 보통 반환타입x

	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	
	
}
