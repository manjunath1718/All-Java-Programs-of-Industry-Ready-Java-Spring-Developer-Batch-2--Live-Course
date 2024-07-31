
import java.util.HashSet;

import java.util.Scanner;



class Book{

	Integer bID;
	String bName;
	boolean isAvailable;
	public Book() {
	}
	public Book(Integer bID, String bName, boolean isAvailable) {
		super();
		this.bID = bID;
		this.bName = bName;
		this.isAvailable = isAvailable;
	}
	public Integer getbID() {
		return bID;
	}
	public void setbID(Integer bID) {
		this.bID = bID;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	

}
public class LibraryManagementSystem {

	HashSet<Book>  hs=new HashSet<Book>();
	Scanner sc=new Scanner(System.in);
	static int idGenerate=1;
	
	public  void addBook() {
		System.out.println("Start Adding Books");
		
		System.out.println("Enter Book Name");
		String name=sc.next();
	
		hs.add(new Book(idGenerate++,name,true));

	}
	public  void checkingOutBooks() {
		
		System.out.println("Enter the Book Id customer want");
		int id=sc.nextInt();
		for(Book s:hs) {
			if(s.getbID()==id) {
				s.setAvailable(false);
			}
		
		}
		System.out.println("Customer Got The Book to Read");
		

	}
	public  void returningBooks() {
		
		System.out.println("Enter the Book Id customer want to return");
		int id=sc.nextInt();
		for(Book s:hs) {
			if(s.getbID()==id) {
				s.setAvailable(true);
			}	
		}
		System.out.println("Customer Reurn The Book ");

	}
	public  void displayAvailableBooks() {
				
		for(Book s:hs) {
			if(s.isAvailable()) {
				System.out.println(s.getbName());
			}
		
		}

	}
	public static void main(String[] args) {

		LibraryManagementSystem lms=new LibraryManagementSystem();
		while(true) {
			Scanner sc=new Scanner(System.in);
			System.out.println("=========================================");
			System.out.println("1:Press 1 to Add Book");
			System.out.println("2:Press 2 to Checking Out Book");
			System.out.println("3:Press 3 to Return Books");
			System.out.println("4:Press 4 to Display Available Books");
			System.out.println("5:Press 5 to Exit");

			System.out.println("Enter Choice");
			int choice=sc.nextInt();
			System.out.println("=========================================");
			
			
			switch(choice) {
			
			case 1->lms.addBook() ;
			case 2->lms.checkingOutBooks();
			case 3->lms.returningBooks();
			case 4->lms.displayAvailableBooks();
			case 5->System.exit(0);
			default->System.out.println("Invalid Choice");
			
			}

		}
	}

}
