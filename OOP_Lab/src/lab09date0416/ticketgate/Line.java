package lab09date0416.ticketgate;

public class Line {
	public final Gate A = new Gate("A", 0);
	public final Gate B = new Gate("B", 17);
	public final Gate C = new Gate("C", 22);
	public final Gate D = new Gate("D", 33);
	
	public static int getFare(int distance) {
		return 120 + (Math.max(distance - 3, 0) / 2) * 30;
	} 
}
