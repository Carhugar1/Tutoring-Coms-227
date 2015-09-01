package Main;

public interface Pet extends Animal {

	/**
	 * All pets need walked!
	 */
	public void walk();
	
	/**
	 * All pets need fed and watered
	 */
	public void feed();
	
	/**
	 * All pets have an owner thus we should be able to look at 
	 * their tag and determine the owner of the pet.
	 * @returns the owner of the pet
	 */
	public Human getOwner();
	
}
