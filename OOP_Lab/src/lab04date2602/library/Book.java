package lab04date2602.library;

public class Book {
	private int bookID;
	private String bookTitle;
	private int amount;
	private int available;
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getAvailable() {
		return available;
	}
	public void setAvailable(int available) {
		this.available = available;
	}
	
	public Book() {
		super();
	}
	public Book(int bookID, String bookTitle, int amount, int available) {
		super();
		this.bookID = bookID;
		this.bookTitle = bookTitle;
		this.amount = amount;
		this.available = available;
	}
	
	public void showBookInfo() {
		System.out.println("Book Title: " + bookTitle + "\nBook ID: " + bookID
							+ "\nTotal amount: " + amount + "\nAvailable: " + available);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bookID;
		result = prime * result + ((bookTitle == null) ? 0 : bookTitle.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (bookID != other.bookID)
			return false;
		if (bookTitle == null) {
			if (other.bookTitle != null)
				return false;
		} else if (!bookTitle.equals(other.bookTitle))
			return false;
		return true;
	}
	
}
