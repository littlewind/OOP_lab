package lab09date0416.ticketgate;

import java.util.Date;

public class OneWayTicket extends Ticket {
	private boolean valid = true;

	public OneWayTicket(int value, Date issuedDate) {
		super(value, issuedDate);
	}
	
	@Override
	public void setOrigin(Gate origin) {
		super.setOrigin(origin);
		if (origin == null)
			setValid(false);
	}
	
	@Override
	public boolean isValid() {
		return this.valid;
	}
	
	public void setValid(boolean valid) {
		this.valid = valid;
	}

	@Override
	public void adjustValue(int value) {
	}
}
