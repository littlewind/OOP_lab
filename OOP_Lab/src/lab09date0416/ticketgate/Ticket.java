package lab09date0416.ticketgate;

import java.util.Date;

public abstract class Ticket {
	protected Date issuedDate;
	protected int value;
	protected Gate origin;
	
	public Ticket(int value, Date issuedDate ) {
		this.value = value;
		this.issuedDate = issuedDate; 
	}
	
	
	
	public int getValue() {
		return value;
	}
	
	public abstract void adjustValue(int value);
	
	public void setOrigin(Gate origin) {
		this.origin = origin;
	}
	
	public Gate getOrigin() {
		return origin;
	}
	
	public abstract boolean isValid();
	
	public void getInfo() {
		System.out.println("\n------------ Ticket Info ------------");
		System.out.println("issuedDate : " + this.issuedDate);
		System.out.println("value : " + this.getValue());
		System.out.println("-------------------------------------\n");
	}
}
