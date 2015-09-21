package main;

public class Yellow {
	
	// Instance Variable
	public String var;
	
	
	// Constructor
	// public Class(inputs)
	// public [Yellow]( [no input] )
	public Yellow() {
		
	}
	
	// getter method
	// public Type name()
	// public [String] [get]( [no input] )
	public String get() {
		
		return var;
		
	}
	
	// setter method
	// public [void (aka no return)] [set]( [String input] )
	public void set(String input) {
		
		// input is a local Variable
		// var is a instance Variable
		
		// input only exists in the local scope (aka this method)
		// where as var exists within the classes scope (aka this file)
		
		var = input;
		
		// now our input can be use within the class since we have set var (instance) equal to input (local)
		
	}

}
