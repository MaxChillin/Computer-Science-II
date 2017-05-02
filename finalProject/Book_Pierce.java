package finalProject;

public class Book_Pierce {
	
	private String id;
	private String isbn;
	private String title;
	private String writer;
	private String category;
	private String publisher;
	private int numberOfBooks;
	
	
	// No Argument Constructor
	public Book_Pierce(){
		
		this.id = null; 
		this.isbn = null;
		this.title = null;
		this.writer = null;
		this.category = null;
		this.publisher = null;
		this.numberOfBooks = 0;
		
	}// End of No Argument Constructor
	
	// Parameter Constructor
	public Book_Pierce(String id, String isbn, String title, String writer,
			String categories, String publisher, int num){
		
		this.id = id; 
		this.isbn = isbn;
		this.title = title;
		this.writer = writer;
		this.category = categories;
		this.publisher = publisher;
		this.numberOfBooks = num;
		
	}// End of Parameter Constructor
	
	
	// Get Id Method	
	public String getId() {
		return id;
	}


	// Get ISBN Method
	public String getIsbn() {
		return isbn;
	}


	// Get Title Method
	public String getTitle() {
		return title;
	}


	// Get Writer Method
	public String getWriter() {
		return writer;
	}


	// Get Category Method
	public String getCategory() {
		return category;
	}


	// Get Publisher Method
	public String getPublisher() {
		return publisher;
	}


	// DeepCopy Method
	public Book_Pierce deepCopy(){
		Book_Pierce deepCopy = new Book_Pierce(this.id, this.isbn, this.title, this.writer, this.category, this.publisher, this.numberOfBooks);
		return deepCopy;
	}
	
	
	// To File Method
	public String toFile(){
		
		return id + ", " + isbn + ", " + title + ", " + writer + ", " + category + ", " + publisher + ", " + numberOfBooks;
	}


	// To String Method
	public String toString(){
		
	return "\n\t****************************************" +
			"\n\tBook ID: " + id +
			"\n\tTitle: " + title +
			"\n\tISBN: " + isbn +
			"\n\tWriter: " + writer +
			"\n\tPublisher: " + publisher +
			"\n\tCategories: " + category +
			"\n\tNumber of Copies: " + numberOfBooks +
			"\n\t****************************************";

	}// End of toString method

}// End of class


