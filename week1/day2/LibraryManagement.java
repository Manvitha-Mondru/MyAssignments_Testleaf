package week1.day2;

public class LibraryManagement {
	
	public static void main(String[] args) {
		
		Library l=new Library();
		String newBook=l.addBook("IKIGAI");
		System.out.println("Newly added book title:" + newBook);
		l.issueBook();
		
	}

}
