package checkvaliddateprogram;

import java.util.Scanner;

import utils.MyDate;

public class CheckValidDate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String buff;
		String[] array = new String[3];
		int d, m, y;
		
		System.out.print("Enter the date(dd/mm/yyyy): ");
		buff = sc.nextLine();
		array = buff.split("/");
		d = Integer.parseInt(array[0]);
		m = Integer.parseInt(array[1]);
		y = Integer.parseInt(array[2]);
		
		if (MyDate.isValidDate(d, m, y)) {
			System.out.println("The date is valid.");
		} else {
			System.out.println("Invalid date!");
		}
		
		sc.close();

	}

}
