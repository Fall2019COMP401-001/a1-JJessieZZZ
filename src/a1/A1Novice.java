package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// Your code follows here.
		
		int count = scan.nextInt();
		
		for (int i=0; i<count; i++) {
			char initial = scan.next().charAt(0);
			String last = scan.next();
			int items = scan.nextInt();
			double totalprice = 0;
			String pricetotal="";
			for (int j=0; j<items; j++) {
				int amount = scan.nextInt();
				String name = scan.next();
				double price = scan.nextDouble();
				totalprice += price*amount;
				pricetotal = String.format("%.2f",totalprice);
			}
			System.out.println(initial+". "+last+": "+ pricetotal);
		}
		scan.close();
		
	}
}
