package Main;

public class Person {
	
	// What does a person need?
	
	// name
	public String name;
	
	// birthday
	public int birthday;
	
	// gender
	public String gender;
	
	// favorite color
	public String color;
	

	public Person(String in_name, int in_birthday, String in_gender, String in_favColor) {
		
		// something = something;
		
		name = in_name;
		
		birthday = in_birthday;
		
		gender = in_gender;
		
		color = in_favColor;
		
		
	}
	
	// public age?
	public int age(int current_date) {
		
		// 00     00   0000
		// months days years
		int months;
		months = (current_date / 1000000) - (birthday / 1000000);
		
		int days;
		days = ((current_date % 1000000) / 10000) - ((birthday % 1000000) / 10000);
		
		int years;
		years = (current_date % 10000) - (birthday % 10000);
		
		int age;
		age = months * 1000000 + days * 10000 + years;
		
		return age;
		
	}

}
