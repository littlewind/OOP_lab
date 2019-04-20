package lab09date0416.ticketgate;

import java.util.Date;

public class PrepaidCard extends Ticket implements ICard {
	public PrepaidCard(int value, Date issuedDate) {
		super(value, issuedDate);
	}

	@Override
	public void add(int value) {
		this.value += value; 
	}
	
	@Override
	public boolean deduct(int value) {
		if (this.value < value) return false;
		this.value -= value;
		return true;
	}
	
	@Override
	public boolean isValid() {
		return getValue() > 0;
	}

	@Override
	public void adjustValue(int value) {
		deduct(value);
	}
}
