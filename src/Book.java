package src;

public class Book extends Item {
	public static String setDescription;
	public static String setAuthor;
	public static String setCategory;
	public static String setReleaseDate;
	private String author;
	private String description;
	private String category;
	private String releaseDate;
	
	public Book(String bookId, String name, int unitPrice) {
		super(bookId, name, unitPrice);
	}
	
	public Book(String bookId, String name, int unitPrice, String author, String
		description, String category, String releaseDate) {
		super(bookId, name, unitPrice);
		this.author = author;
		this.description = description;
		this.category = category;
		this.releaseDate = releaseDate;
	}
	
	public String getBookId() { return bookId; }
	public void setBookId(String bookId) {this.bookId = bookId;}
	
	public String getName() {return name;}
	public void setName(String name) { this.name = name;}
	
	public int getUnitPrice () {return unitPrice;}
	public void setUnitPrice(int unitPrice) { this.unitPrice = unitPrice;}
	
	public String getAuthor() {return author;}
	public void setAuthor(String author) { this.author = author;}
	
	public String getCategory() {return category;}
	public void setCategory(String category) {this.category = category;}
	
	public String getDescription() { return description; }
	public void setDescription(String description) { this.description = description;}
	public String getReleaseDate() {return releaseDate;}
	public void setReleaseDate(String releaseDate) {this.releaseDate = releaseDate;}
}
