package a1;

import java.util.Scanner;

public class A1Adept {

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
		
		//Find the no. of customers
		int people = scan.nextInt();
		
		double[] pricetotal = new double[people];
		String[] fullname = new String[people];
		
		//scan their names
		for (int j=0; j<people;j++) {
			String first = scan.next();
			String last = scan.next();
			double totalbought = 0;
			fullname[j] = first + " " + last;
			
			//Check the items
			int bought = scan.nextInt();
			for (int k=0; k<bought; k++) {
				int amount = scan.nextInt();
				String items = scan.next();
				
				for (int x=0; x<count;x++) {
					if (items.contains(names[x])) {
						totalbought += amount*prices[x];
						;
					}
				}
				//record the total price each person pays
				pricetotal[j] = totalbought;
			}
		}
		// Find the maximum, minimum and average value
		int maxPos = findValueMax(pricetotal);
		int minPos = findValueMin(pricetotal);
		double ave = findAverage(pricetotal);
				
		System.out.println("Biggest: " + fullname[maxPos] +
						" (" + String.format("%.2f", pricetotal[maxPos]) + ")");
		System.out.println("Smallest: " + fullname[minPos] +
						" (" + String.format("%.2f", pricetotal[minPos]) + ")");
		System.out.println("Average: " + String.format("%.2f", ave));
				
		scan.close();
	}
	// find the maximum value
        static int findValueMax(double[] vals) {
		    int pos = 0;
        	double cur_max = vals[0];
		
		for (int i=1; i < vals.length; i++) {
			if (vals[i] > cur_max) {
				cur_max = vals[i];
				pos=i;
			}
		}
		
		return pos;
	}
    	// find the minimum value
    	static int findValueMin(double[] vals) {
    		int pos = 0;
    		double cur_min = vals[0];
    		
    		for (int i=1; i < vals.length; i++) {
    			if (vals[i] < cur_min) {
    				cur_min = vals[i];
    				pos=i;
    			}
    		}
    		
    		return pos;
    	}
    	// find the average value
    	static double findAverage(double[] vals) {
    		
    		double total = 0;
    		
    		for (int i = 0; i < vals.length; i++) {
    			
    			total += vals[i];
    			
    		} double ave = total / vals.length;
    		
    		return ave;
    	}
    	
}
