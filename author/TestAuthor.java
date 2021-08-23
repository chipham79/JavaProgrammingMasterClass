package author;

public class TestAuthor {
	public static void main(String[] args) {
		Author author = new Author("Tan Ah Teck", "ahteck@somewhere.com", "m");
		
		System.out.println(author);
		
		author.setEmail("chi.pham@besmartee.com");
		
		System.out.println(author);
	}
}
