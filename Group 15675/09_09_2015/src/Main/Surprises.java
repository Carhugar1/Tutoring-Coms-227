package Main;

public class Surprises {

	
	/*
	 * Holds our number for us to use at a later time
	 */
	public int _i;
	
	
	/*
	 * Holds our second number for us to use at a later time
	 */
	public int _j;
	
	
	/*
	 * Holds our String for us to use at a later time
	 */
	public String _s;
	
	
	/*
	 * Takes in some number and gives us some sort of output
	 */
	public Surprises(int i, int j, String s) {
		_i = i;
		_j = j;
		_s = s;
	}
	
	
	/*
	 * Method 
	 * how to declare a method:
	 * 
	 * public [return type] methodName( [input(s) 0-?] ) {
	 * 		return something of type [return type];
	 * }
	 * 
	 */
	public String surprise() {
		
		return _i + ". we have " + _j + " " + _s + " + " +
				_i + " - " + _j + " thus we have " + _i;
		
			// outputs? given _i = 1
		// 1. we have 10 people + 1 - 10 thus we have 1
		
	}
	
	
	/*
	 * nothing should change the _i so 
	 * that we can have different surprises 
	 */
	public void nothing(int i, int j, String s) {
		
		_i = i;
		_s = s;
		_j = j;
		
	}
	
	

}
