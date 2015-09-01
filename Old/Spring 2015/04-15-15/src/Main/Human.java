package Main;

import java.util.ArrayList;

public class Human implements Animal {

	private String name;
	private int age;
	
	private ArrayList<Pet> pets;
	
	/**
	 * Constructs a human with the given name and age
	 * @param name name of the human
	 * @param age age of the human
	 */
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
		this.pets = new ArrayList<Pet>();
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getAge() {
		return age;
	}
	
	/**
	 * Humans can add pets
	 * @param Pet p
	 */
	public void addPet(Pet p) {
		pets.add(p);
	}
	
	/**
	 * Humans can show off their pets
	 * @param int index
	 */
	public Pet getPet(int index) {
		return pets.get(index);
	}
	
	/**
	 * Humans love to tell others about all their pets
	 * @return a list of all the pets that this Human owns
	 */
	public String getPets() {
		return pets.toString(); // will call all the the pets .toString()
	}
	
	/**
	 * Make the printing of stuff in println() pretty.
	 * We are overloading the toString method found in the Object class
	 * For more on the Object class refer to the internet.
	 */
	@Override
	public String toString() {
		return this.getName();
	}

}
