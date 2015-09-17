package Main;

public class main {

	public static void main(String[] args) {
		
		// variables testing!
		Variables var = new Variables(5);
		
		// output?
		System.out.println(var.local(10));
		// 10
		
		// output?
		System.out.println(var.instance(10));
		// 5
		
		// print i 
		System.out.println(var.i);
		
		System.out.println(var.getO());
		
		// new testing of our empty constructor
		Variables var2 = new Variables();
		
		// print it out
		System.out.println(var2.instance(10));
		
		System.out.println(var2.getO());
		
		
		
		System.out.println("testing of this");
		
		
		// this.a()
		System.out.println(var2.a());
		
		// this.a() * 2?
		System.out.println(var2.a2());
		
	}

}
