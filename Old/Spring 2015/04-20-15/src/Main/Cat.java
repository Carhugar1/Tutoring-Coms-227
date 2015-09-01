package Main;

public class Cat extends BasePet {

	public Cat(String name, int age, Human owner) {
		super(name, age, owner);
	}
	
	@Override
	public void walk() {
		System.out.println("Meow, No walk Plz!");
	}

	@Override
	public void feed() {
		System.out.println("Nom nom!");
	}

}
