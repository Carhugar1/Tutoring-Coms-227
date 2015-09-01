package Main;

public class Cat extends Dog {

	public Cat(String name, int age, Human owner) {
		super(name, age, owner);
	}
	
	@Override
	public void walk() {
		System.out.println("Meow, No walk Plz!");
	}

}
