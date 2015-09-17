package Main;

public class Variables {
	
	// instance variable for our input
	public int i;
	
	public Object o;

	// constructor that takes an integer input.
	public Variables(int input) {
		i = input;
	}
	
	// empty constructor useful in many of situations 
	public Variables() {
		this(227);
		o = null;
	}
	
	// method doesn't return the right number?
	public int local(int i) {
		return i;
	}
	
	// method does return the right number why?
	public int instance(int i) {
		return this.i;
	}

	
	public Object getO() {
		return o;
	}
	
	
	// This and how it works
	public int a() {
		return 12;
	}
	
	public int a2() {
		// how to do a * 2
		return this.a() * 2;
	}
}
