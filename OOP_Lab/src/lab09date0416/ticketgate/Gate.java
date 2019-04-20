package lab09date0416.ticketgate;

public class Gate {
	private String name;
	private int distance;
	
	public Gate(String name, int distance) {
		super();
		this.name = name;
		this.distance = distance;
	}

	public void enter(Ticket ticket) {
		 if (ticket.isValid() && ticket.getOrigin() == null) {
			 ticket.setOrigin(this);
			 open();
		 } else {
			 close();
		 }
	}

	public void exit(Ticket ticket) {
		Gate origin = ticket.getOrigin();
		if (origin != null) {
			int totalDistance = Math.abs(origin.distance - distance);
			int fare = Line.getFare(totalDistance);
			if ( ticket.getValue() >= fare ) {
				if (ticket instanceof OneWayTicket) {
					((OneWayTicket) ticket).setValid(false);
				}
				else {
					ticket.adjustValue(fare);
				}
				ticket.setOrigin(null);
//				ticket.adjustValue(fare);

				open();
				return;
			}
		 }
		 close(); 
		
	}
	public void open() {
		System.out.println("Gate " + name + ": open");
	}
	public void close() {
		System.out.println("Gate " + name + ": close");
	}
}
