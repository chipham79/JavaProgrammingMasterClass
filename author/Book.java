package author;

public class Book {
	private String name;
	private double price ;
	private int qtyInStock;
	Author author;
	
	public Book(String name, Author author, double price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}
	
	public Book(String name, Author author, double price, int qtyInStock) {
		this.name = name;
		this.price = price;
		this.qtyInStock = qtyInStock;
		this.author = author;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getQtyInStock() {
		return this.qtyInStock;
	}
	
	public double getPrice() {
		return this.price;
	}
	public Author getAuthor() { 
		return this.author;
	}
	
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getAuthorName() {
		return this.author.getName();
		
	}
	
	public String getAuthorEmail() {
		return this.author.getEmail();
		
	}
	
	public String getAuthorGender() {
		return this.author.getGender();
		
	}
	
	
}
