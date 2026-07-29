class Book{
	private String title;
	private String isbn;
	private String author;
	private double price;
	
	Book(String title, String isbn, String author, double price){
		this.title = title;
		this.isbn = isbn;
		this.author = author;
		this.price = price;
	}
	Book(Book B){
		this.title = B.title;
		this.isbn = B.isbn;
		this.author = B.author;
		this.price = B.price;		
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public String getAuthor() {
		return author;
	}
	public double getPrice() {
		return price;
	}
	
	public void setTitle(String Title) {
		this.title = Title;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void calculatePrice() {
		double pp = price + price *.05;
		System.out.println("Book price with 5% VAT: "+pp);
	}
	
	public double calculatePrice(int quantity) {
		return price * quantity;
	}
	public double calculatePrice(int quantity, double discountRate) {
		double pp = price * quantity;
		pp = pp - pp*discountRate;
		if(pp>3000) System.out.println("Large purchase: "+pp+" .Eligible for free delivery.");
		return pp;
	}
	public String toString() {
		return "Title: " + title + "\nisbn: " + isbn+ "\nauthor: " +author+"\nprice: " + price;
	}
}


class Library{
	private Book [] books;
	private int count;
	private static int bookC = 0;
	
	public Library(int capacity) {
		books = new Book[capacity];
	}
	
	public void addBooks(Book b) {
		books[bookC] = b;
		bookC++;
	}
	public void displayBook() {
		for(int i = 0; i<books.length; i++) {
			System.out.println("---------------------");
			System.out.println(books[i]);
		}
	}
	public Book findMostExpensicve() {
		Book max = books[0];
		for(int i = 0; i<books.length;i++) {
			if(books[i].getPrice()>max.getPrice()) max = books[i];
		}
		return max;
	}
	public int countByAuthor(String author) {
		int count = 0;
		for(int i = 0; i<books.length;i++) {
			if(books[i].getAuthor().equals(author)) count++;
		}
		return count;
	}
}

public class ID2532388042 {
	public static void main(String[] args) {
		Book [] arr  = new Book[5];
		arr[0] = new Book("ajkdlfj", "skj287342", "hadslf", 234);
		arr[1] = new Book("ajkdlfj", "skj287342", "hadslf", 234);
		arr[2] = new Book("ajkdlfj", "skj287342", "hadslf", 234);
		arr[3] = new Book("ajkdlfj", "skj287342", "hadslf", 234);
		arr[4] = new Book("ajkdlfj", "skj287342", "hadslf", 234);
		Library L = new Library(7);
		
		for(int i = 0; i<5; i++) {
			L.addBooks(arr[i]);
		}
		
		
		System.out.println("Most Expensive book: ");
		System.out.println(L.findMostExpensicve());
		
		L.displayBook();
		
		System.out.println("Book written by Y. Daniel Liang"+ L.countByAuthor("Y. Daniel Liang"));
	}
}
