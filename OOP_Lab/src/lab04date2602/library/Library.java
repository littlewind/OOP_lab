package lab04date2602.library;

import java.util.Scanner;

public class Library {
	private Book[] bookList;
	private String libraryTitle;
	private int nbBooks;
	public static final int MAX_NUMBER_BOOKS = 100;
	
	public Library(String title) {
		this.libraryTitle = title;
		this.bookList = new Book[MAX_NUMBER_BOOKS];
		this.nbBooks = 0;
	}
	
	public Book[] getBookList() {
		return bookList;
	}

	public void setBookList(Book[] bookList) {
		this.bookList = bookList;
	}

	public String getLibraryTitle() {
		return libraryTitle;
	}

	public void setLibraryTitle(String libraryTitle) {
		this.libraryTitle = libraryTitle;
	}

	public int getNbBooks() {
		return nbBooks;
	}

	public void setNbBooks(int nbBooks) {
		this.nbBooks = nbBooks;
	}



	public void addNewBook() {
		if (nbBooks < MAX_NUMBER_BOOKS) {
			Book newBook = new Book();
			Scanner sc = new Scanner(System.in);
			int tempTotalAmount;
			System.out.println("Enter book's information:");
			System.out.print("\tBook ID: ");
			newBook.setBookID(sc.nextInt());
			sc.nextLine();
			System.out.print("\tBook title: ");
			newBook.setBookTitle(sc.nextLine());
			System.out.print("\tAmount: ");
			tempTotalAmount = sc.nextInt();
			newBook.setAmount(tempTotalAmount);
			newBook.setAvailable(tempTotalAmount);
			
			bookList[nbBooks] = newBook;
			nbBooks += 1;
			
			System.out.println("Add new book successfully!");
//			sc.close();
		} else {
			System.out.println("Cannot add new book! The number of book exceeded the limit.");
		}
	}
	
	public boolean findBook(int bookID) {
		for (int i=0; i<this.getNbBooks(); i++ ) {
			if (bookList[i].getBookID() == bookID) {
				bookList[i].showBookInfo();
				return true;
			}
		}
		return false;
	}
	
	public void borrowBook(int bookID) {	
		for (int i=0; i<nbBooks; i++) {
			if (bookList[i].getBookID() == bookID) {
				int availableAmount = bookList[i].getAvailable();
				if (availableAmount > 0) {
					availableAmount -= 1;
					bookList[i].setAvailable(availableAmount); 
					System.out.println("\nThe book is borrowed successfully!");
					bookList[i].showBookInfo();
				} else {
					System.out.println("This book is not available now.");
				}
				return;
			}
		}
		System.out.println("Cannot find any book with this ID.");
	}
	
	public void returnBook(int bookID) {
		for (int i=0; i<nbBooks; i++) {
			if (bookList[i].getBookID() == bookID) {
				int availableAmount = bookList[i].getAvailable();
				if (availableAmount == bookList[i].getAmount()) {
					System.out.println("Cannot return this book!");
					return;
				}
				availableAmount += 1;
				bookList[i].setAvailable(availableAmount); 
				System.out.println("\nThe book is returned successfully!");
				bookList[i].showBookInfo();
				return;
			}
		}
		System.out.println("Cannot find any book with this ID.");
	}
	
	public void showLibraryInfo() {
		System.out.println("Library's Name: "+this.getLibraryTitle()+"\nNumber of books: "+this.getNbBooks());
		if (this.getNbBooks()>0) {
			System.out.println("List of books:");
			System.out.println("----------");
			for (int i=0; i<this.getNbBooks(); i++) {
				bookList[i].showBookInfo();
				System.out.println("----------");
			}
		}
	}
}
