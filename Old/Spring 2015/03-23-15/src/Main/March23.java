package Main;

import java.util.ArrayList;

public class March23 {

	/*
	 * We talked about ArrayList and some useful things in their class like add remove and set.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> tutee = new ArrayList<String>();
		
		tutee.add("Branden");
		
		tutee.add("Dan");
		
		tutee.add("Kelvin");
		
		tutee.remove("Dan");
		
		tutee.remove(0); // the tutor isn't a tutee
		
		System.out.println(tutee);
		
		// Integers now
		
		ArrayList<Integer> ints = new ArrayList<Integer>();
		
		ints.add(0);
		
		ints.add(2); // .add(E) adds to the next location in the list
		
		System.out.println(ints);
		
		ints.add(1,1); // where as .add(index, E) adds the the location specified and shifts the rest to the right.
		
		System.out.println(ints);
		
		ints.add(3);
		
		ints.add(4);
		
		ints.add(6); // this is wrong should be 5
		
		System.out.println(ints);
		
		ints.remove(1); // removes the 1 in the 1 index
		
		System.out.println(ints);
		
		ints.remove(2); // removes the 3 in the 2 index
		 
		System.out.println(ints);
		
		ints.remove(new Integer(2)); // removes the first 2 which is in the 1 index
		
		System.out.println(ints);
		
		int index = ints.indexOf(6); // need to fix it of course
		
		ints.set(index, 5);
		
		System.out.println(ints);
		
	}	

}
