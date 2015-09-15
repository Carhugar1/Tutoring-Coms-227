package Main;

public class main {
	
	/*
	 * We made a person class then made a method for determining the age
	 */

	public static void main(String[] args) {
		
		// new baby!
		
		Person baby = new Person("Keven the 3rd", 9142013, "Male", "Green");
		
		// get the babies age
		System.out.println(baby.age(9142015));
		
		// one month less?
		System.out.println(baby.age(10142015));
		
		
	}

}
