package programs;

public class constructorChaining {

	public constructorChaining() {
		System.out.println("The is the zero parameterized constructor");
	}

	public constructorChaining(int a) {
		// ThisMenthod is called as constructor chaining, which calls another
		// constructor within the constructor , based on the parameters passed
		this();
		System.out.println("The is a single parameterized constructor");
	}

	public constructorChaining(int a, String b) {
		// ThisMenthod is called as constructor chaining, which calls another
		// constructor (constructorChaining(int a)) within the constructor , based on
		// the parameters passed
		this(a);
		System.out.println(b);
		System.out.println("The is a double parameterized constructor");
	}

	public static void main(String[] args) {

		constructorChaining c1 = new constructorChaining(5, "Sahil");
	}

}
