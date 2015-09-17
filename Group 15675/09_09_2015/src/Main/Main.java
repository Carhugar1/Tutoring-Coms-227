package Main;

public class Main {
	
	/*
	 * Today we made a Class (Surprises) and 
	 * some methods (.surprise() and .nothing())
	 * 
	 * We talked about how class variables (_i, _j, and _s) 
	 * are useful for storing numbers and 
	 * text while the program is running.
	 */

	public static void main(String[] args) {
		
		// Type VariableName;
		
		Surprises s;
		
		// VariableName = new Type()
		
		s = new Surprises(1, 7, "Tutees");
		
		System.out.println(s.surprise());
		
		
		// old code due to the new nothing method
		// s = new Surprises(5);
		
		// the new nothing method usage
		s.nothing(5, 400, "Bubbles");
		
		// 5. we have 10 people + 5 - 10 thus we have 5
		System.out.println(s.surprise());
		
	}

}
