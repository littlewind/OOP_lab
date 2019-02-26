package lab04date2602.library;

import java.util.Scanner;

public class LibraryProgram {
	public static void main(String[] args) {
		Library mLib = new Library("TQB");
		int option = 0;
		Scanner scan = new Scanner(System.in);
//		mLib.addNewBook();
//		mLib.findBook(1);
//		mLib.borrowBook(1);
//		mLib.returnBook(1);
		do {
			showMenu();
			option = scan.nextInt();
			while(option<1 || option>6) {
				System.out.println("Invalid number!\n"
								  +"Enter menu ID (1-6): ");
				option = scan.nextInt();
			}
			switch(option) {
				case 1: {
					mLib.showLibraryInfo();
					break;
				}
				case 2: {
					System.out.println("2. Add new book\n"
									 + "------------------------------");
					mLib.addNewBook();
					scan.nextLine();
					break;
				}
				case 3: {
					System.out.println("3. Find book\n"
							 + "------------------------------");
					System.out.print("Enter book's ID: ");
					int bookID = scan.nextInt();
					if(!mLib.findBook(bookID)) {
						System.out.println("There is no book with this ID");
					};
					break;
				}
				case 4: {
					System.out.println("4. Borrow a book\n"
							 + "------------------------------");
					System.out.print("Enter book's ID: ");
					int bookID = scan.nextInt();
					mLib.borrowBook(bookID);
					break;
				}
				case 5: {
					System.out.println("5. Return a book\n"
							 + "------------------------------");
					System.out.print("Enter book's ID: ");
					int bookID = scan.nextInt();
					mLib.returnBook(bookID);
					break;
				}
			}
		} while (option!=6);
		scan.close();
	}
	
	public static void showMenu() {
		System.out.print("========== Main menu ========\n"
						 + "1. Show library information\n"
						 + "2. Add new book\n"
						 + "3. Find book\n"
						 + "4. Borrow a book\n"
						 + "5. Return a book\n"
						 + "6. Exit\n"
						 + "=============================\n"
						 + "Enter menu ID (1-6): ");
	}

}
