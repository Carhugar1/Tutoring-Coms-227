package Pets;

import Interfaces.Person;
import Interfaces.Pet;
import Interfaces.Type;

public class Cat implements Pet, Type {
	
	private String _name;
	private int _age;
	private Person _owner;
	
	
	
	public Cat(String name, int age, Person owner) {
		_name = name;
		_age = age;
		_owner = owner;
	}
	

	
	public String getType() {
		return "Cat";
	}


	
	public String getName() {
		return _name;
	}

	

	public int getAge() {
		return _age;
	}

	
	
	public Person getOwner() {
		return _owner;
	}


	
	public void birthday() {
		_age++;
	}


	
	public String getSound() {
		return "Meow";
	}


	
	public Type getAnimal() {
		return this;
	}

}
