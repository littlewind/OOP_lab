package lab09date0416.ticketgate;

import java.util.Date;

public class OneDayTicket extends Ticket {
	public OneDayTicket(Date issuedDate) {
		super(Integer.MAX_VALUE, issuedDate);	
	}

	@Override
	public boolean isValid() {
		Date currentDate = new Date();
		long interval = currentDate.getTime() - issuedDate.getTime();
		// interval is  the number of milliseconds between 2 events, 24h = 24*60*60*1000 ms
		// here we only test with 2s = 1000ms
		if (interval < (2000))
			return true;
		return false;
	}

	@Override
	public void adjustValue(int value) {		
	}
	
}
