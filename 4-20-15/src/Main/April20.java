package Main;

public class April20 {

	public static void main(String[] args) {
		
		/*
		 * 
		 * We have a tutoring group, inside this group is humans. Those people may have pets.
		 * However, not all humans have pets. We are going to start by creating the Pets that we have.
		 * 
		 * After that there is a difference between Tutor and Tutee.
		 * Thus we are going to fix that difference by extending human into two different classes Tutor and Tutee.
		 * 
		 * Tutor needs to have a listing for all the Tutees under them.
		 * And Tutee needs to have a listing of all the Tutors that they fall under.
		 * 
		 */
		
		Tutor Branden = new Tutor("Branden", 20);
		Tutee Dan = new Tutee("Dan", 20);
		Tutee Kelvin = new Tutee("Kelvin", 19);
		
		Pet Snoopie = new Cat("Snoopie", 14, Branden);
		
		Branden.addTutee(Dan);
		Branden.addTutee(Kelvin);
		
		System.out.println(Branden.getPets());
		
		System.out.println(Branden.getName());
		
		System.out.println(Branden.getTutees());
		
		System.out.println(Kelvin.getTutors());
		

	}

}
