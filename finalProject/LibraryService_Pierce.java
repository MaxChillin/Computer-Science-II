package finalProject;

import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;

public class LibraryService_Pierce {
	
	public static void main(String[] args){
		
		String filePath = "F:\\School\\Programming\\Mars workspace\\Programming3\\src\\finalProject\\bookData_Pierce.txt";
		
		LibraryDataBase_Pierce library = new LibraryDataBase_Pierce();
		Book_Pierce book;
		String selection, id, isbn, title, writer, category, publisher;
		int num;
		
		Scanner input = new Scanner(System.in);
		
		final File file = new File(filePath);
		
		try{Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            String temp = scanner.nextLine();
            String[] info = temp.split(", ");
            book = new Book_Pierce(info[0], info[1], info[2], info[3], info[4], info[5], (Integer.valueOf(info[6])));
            library.addBook(book);
        }
        } catch(FileNotFoundException fnfe){JOptionPane.showMessageDialog(null, "Text file not found.");}
		
		
		do{
			System.out.println("\n\t****************************************" +
					"\n\tWelcome To The Library" +
					"\n\t1: Add A Book" +
					"\n\t2: Remove A Book" +
					"\n\t3: Search By Book ID" +
					"\n\t4: Search By ISBN" +
					"\n\t5: Search By Title" +
					"\n\t6: Search By Writer" +
					"\n\t7: Search By Publisher" +
					"\n\t8: Exit");
			System.out.print("\n\tPlease Make A Selection: ");
			
			selection = input.nextLine();
			
			// switch to handle selection options
			switch(selection){
			case "1":
				System.out.print("\n\tPlease Enter the Book ID: ");
				id = input.nextLine();
				System.out.print("\n\tPlease Enter the Book ISBN: ");
				isbn = input.nextLine();
				System.out.print("\n\tPlease Enter the Book Title: ");
				title = input.nextLine();
				System.out.print("\n\tPlease Enter the Name of the Writer: ");
				writer = input.nextLine();
				System.out.print("\n\tPlease Enter the Book Category: ");
				category = input.nextLine();
				System.out.print("\n\tPlease Enter the Book Publisher: ");
				publisher = input.nextLine();
				System.out.print("\n\tPlease Enter the Number of Copies: ");
				num = input.nextInt();
				input.nextLine(); // this catches the Enter key stroke after the number of copies is stored
				book = new Book_Pierce(id, isbn, title, writer, category, publisher, num);
				library.addBook(book);
				System.out.println(book);
				System.out.println("\n\t*****ADDED TO LIBRARY*****");
				break;
			case "2":
				System.out.print("\n\tPlease Enter the Title of the Book You Want to Delete: ");
				title = input.nextLine();
				System.out.println(library.searchByTitle(title));
				System.out.println("\n\t*****DELETED FROM LIBRARY*****");
				library.removeBook(title);
				break;
			case "3":
				System.out.print("\n\tPlease Enter the Book ID: ");
				id = input.nextLine();
				System.out.println(library.searchByID(id));
				break;
			case "4":
				System.out.print("\n\tPlease Enter the Book ISBN: ");
				isbn = input.nextLine();
				System.out.println(library.searchByISBN(isbn));
				break;
			case "5":
				System.out.print("\n\tPlease Enter the Book Title: ");
				title = input.nextLine();
				System.out.println(library.searchByTitle(title));
				break;
			case "6":
				System.out.print("\n\tPlease Enter the Name of the Writer: ");
				writer = input.nextLine();
				library.searchByWriter(writer);
				break;
			case "7":
				System.out.print("\n\tPlease Enter the Book Publisher: ");
				publisher = input.nextLine();
				library.searchByPublisher(publisher);
				break;
			case "8":
				library.writeToFile(file); // writes the info from the library data structure back onto the file
				
				System.exit(0);
				
				default:
					System.out.println("\n\tInvalid Input");
			
			}// End of switch			
			
		}while(true);		
		
	}// End of main
	

}// End of class
