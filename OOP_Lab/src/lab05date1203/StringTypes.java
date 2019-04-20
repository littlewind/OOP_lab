package lab05date1203;

public class StringTypes {
	
	public static void concat1(String s1) {
		s1 = s1 + "ICT K61";
	}
	public static void concat2(StringBuilder s2) {
		s2 = s2.append("ICT K61");
	}
	public static void concat3(StringBuffer s3) {
		s3 = s3.append("ICT K61");
	}
	public static void main(String[] args) {
		String s1 = "HUST ";
		concat1(s1);	// s1 is not changed
		System.out.println("String: " + s1);
		
		StringBuilder s2 = new StringBuilder("HUST ");
		concat2(s2);	// s2 is changed
		System.out.println("StringBuilder: " + s2);
		
		StringBuffer s3 = new StringBuffer("HUST ");
		concat3(s3);	// s3 is changed
		System.out.println("StringBuffer: " + s3);

	}

}
