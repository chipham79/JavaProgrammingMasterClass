package author;

public class TestBook {
	public static void main(String[] args) {
		Author anAuthor = new Author("Tan Ah Teck", "ahteck@somewhere.com", "m");
		Book aBook = new Book("Java", anAuthor, 19.55, 1000);
		
		Book anotherBook = new Book("Java 2", new Author("Chi Pham", "chi.pham@gmail.com", "m"), 29.95, 888);
		
		System.out.println(aBook.getAuthorName());
		System.out.println(aBook.getAuthorEmail());
		System.out.println(aBook.getAuthorGender());
		System.out.println(aBook.getPrice());
		System.out.println(aBook.getQtyInStock());
		
	}
}
