package ch11_api_class.sec07;

public class Book {
	String bookNo;
	String bookName;
	String bookAuthor;
	int bookPrice;
	public Book(String bookNo, String bookName, String bookAuthor, int bookPrice) {
		super();
		this.bookNo = bookNo;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
	}
	public String getBookNo() {
		return bookNo;
	}
	
	public void setBookNo(String bookNo) {
		this.bookNo = bookNo;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	@Override
	public String toString() {
		// �Ѳ����� ���ڿ��� �����ؼ� �����ϱ� ���� StringBuilder Ŭ���� ���
		StringBuilder builder = new StringBuilder();
		builder.append(bookNo);
		builder.append("\t");
		builder.append(bookName);
		builder.append("\t");
		builder.append(bookAuthor);
		builder.append("\t");
		builder.append(bookPrice);
		
		return builder.toString();
				
	}
}
