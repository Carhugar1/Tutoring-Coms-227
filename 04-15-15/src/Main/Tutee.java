package Main;

import java.util.ArrayList;

public class Tutee extends Human {
	
	private ArrayList<Tutor> tutors;

	public Tutee(String name, int age) {
		super(name, age);
		tutors = new ArrayList<Tutor>();
	}
	
	/**
	 * Tutee can add Tutors
	 */
	public void addTutor(Tutor t) {
		tutors.add(t);
	}
	
	/**
	 * Tutee can show off their Tutors
	 * @param int index
	 */
	public Human getTutor(int index) {
		return tutors.get(index);
	}
	
	/**
	 * Tutees dislike to tell others about all 
	 * their Tutors, but some times they have to.
	 */
	public String getTutors() {
		return tutors.toString(); // will call all the the Tutors .toString()
	}

}
