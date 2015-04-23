package Main;

import java.util.ArrayList;

public class Tutor extends Human {

	private ArrayList<Human> tutees;
	
	public Tutor(String name, int age) {
		super(name, age);
		tutees = new ArrayList<Human>();
	}
	
	@Override
	public String getName() {
		return "Tutor " + super.getName();
	}
	
	/**
	 * Tutor can add Tutees
	 */
	public void addTutee(Human h) {
		tutees.add(h);
		Tutee t = (Tutee) h; // this is called casting it is for the complier
		// It lets us force something through compile time and will only error
		// if at run time the objects are not the same. Throws a CastErrorException
		
		t.addTutor(this);
	}
	
	/**
	 * Tutor can show off their Tutees
	 * @param int index
	 */
	public Human getTutee(int index) {
		return tutees.get(index);
	}
	
	/**
	 * Tutors love to tell others about all their Tutees
	 */
	public String getTutees() {
		return tutees.toString(); // will call all the the Tutees .toString()
	}
	
	/**
	 * Overrides the toString method in Human
	 */
	@Override
	public String toString() {
		return super.getName();
	}

}
