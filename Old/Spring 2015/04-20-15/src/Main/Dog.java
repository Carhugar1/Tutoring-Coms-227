package Main;

public class Dog extends BasePet {

	public Dog(String name, int age, Human owner) {
		super(name, age, owner);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void walk() {
		System.out.println("BARK BARK!");
	}

	@Override
	public void feed() {
		System.out.println("Much Munch!");
	}

}
