package Main;

public class Dog implements Pet {
	
	private String name;
	private int age;
	private Human owner;

	public Dog(String name, int age, Human owner) {
		this.name = name;
		this.age = age;
		this.owner = owner;
		owner.addPet(this);
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getAge() {
		return age;
	}

	@Override
	public void walk() {
		System.out.println("Doge like walk!");
	}

	@Override
	public void feed() {
		System.out.println("Nom nom");
	}

	@Override
	public Human getOwner() {
		return owner;
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
