package lab09date0416.ticketgate;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Test {

	public static void main(String[] args) {
		Line mLine = new Line();
		
		/// Test PrepaidCard
		System.out.println("############## PrepaidCard ##############");
		
//		if the card's balance = 0
		PrepaidCard ppCard00 = new PrepaidCard(0, new Date());
		ppCard00.getInfo();
		System.out.print("Enter Gate A: -- ");
		mLine.A.enter(ppCard00);
		
//		if the card's balance > 0
		PrepaidCard ppCard01 = new PrepaidCard(500, new Date());
		ppCard01.getInfo();
		
		System.out.print("Enter Gate A: -- ");
		mLine.A.enter(ppCard01);
				
		System.out.print("Exit Gate C: -- ");
		mLine.C.exit(ppCard01);
		ppCard01.getInfo();
		
		System.out.print("Enter Gate A: -- ");
		mLine.A.enter(ppCard01);
				
		System.out.print("Exit Gate C: -- ");
		mLine.C.exit(ppCard01);
		ppCard01.getInfo();
		
//		Adding to the card's balance
		ppCard01.add(1000);
		System.out.println("\nAfter adding 1000 to the balance:");
		ppCard01.getInfo();
		
		System.out.print("Exit Gate C: -- ");
		mLine.C.exit(ppCard01);
		ppCard01.getInfo();
		
		
		
		/// Test OneWayTicket
		System.out.println("\n############## OneWayTicket ##############");
		
		OneWayTicket owTicket01 = new OneWayTicket( 500, new Date());
		owTicket01.getInfo();
		
		System.out.print("Enter Gate A: -- ");
		mLine.A.enter(owTicket01);
				
		System.out.print("Exit Gate C: -- ");
		mLine.C.exit(owTicket01);
		owTicket01.getInfo();
			
//		Using the same ticket to enter Gate A
		System.out.print("Enter Gate A: -- ");
		mLine.A.enter(owTicket01);
		
		
		/// Test OneWayTicket
		System.out.println("\n############## OneDayTicket ##############");
				
		OneDayTicket odTicket01 = new OneDayTicket(new Date());
		odTicket01.getInfo();
		System.out.print("Enter Gate A: -- ");
		mLine.A.enter(odTicket01);
				
		System.out.print("Exit Gate C: -- ");
		mLine.C.exit(odTicket01);
		odTicket01.getInfo();
		
		System.out.print("Enter Gate C: -- ");
		mLine.C.enter(odTicket01);
				
		System.out.print("Exit Gate D: -- ");
		mLine.D.exit(odTicket01);
		odTicket01.getInfo();
		
		// delay 2s
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.print("Enter Gate A: -- ");
		mLine.A.enter(odTicket01);
		odTicket01.getInfo();

	}

}
