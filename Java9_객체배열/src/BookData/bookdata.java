package BookData;

public class bookdata {

	private String title;
	private int price;
	private String writer;
	
	
	public  bookdata(String title,int price,String writer) {
		
		this.title = title;
		this.price = price;
		this.writer = writer;
	
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getWriter() {
		return writer;
	}
	
	
}
