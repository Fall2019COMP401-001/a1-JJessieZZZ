
package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// Your code follows here.
		
		int count = scan.nextInt();
		//Find the no. of goods
        
        //Collect names and prices of goods
        String[] names = new String[count];
        double[] prices = new double[count];
		for (int i=0; i<count; i++) {
			names[i] = scan.next();
			prices[i] = scan.nextDouble();
		}
		
		int[] number = new int[count];
		int[] total = new int[count];
		String[] item = new String[count];
		
		//Find the no. of customers
		int people = scan.nextInt();
		for (int j=0; j<people;j++) {
			String first = scan.next();
			String last = scan.next();
			
			int bought = scan.nextInt();
			for (int k=0; k<bought; k++) {
				int amount = scan.nextInt();
				String items = scan.next();
				
				for (int x=0; x<count;x++) {
					item[x]=names[x];	
					if (items.equals(names[x])) {
						number[x]++;
						total[x]+=amount;
											
					}
	    }
}
		}
		for (int b = 0; b < count; b++) {
			if (number[b] == 0)
				System.out.println("No customers bought " + item[b]);
			else
				System.out.println(number[b] + " customers bought " +
								total[b] + " " + item[b]);
		}
		
		scan.close();
	}
}
