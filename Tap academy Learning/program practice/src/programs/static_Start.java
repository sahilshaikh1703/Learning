package programs;

class DemoStatic {
	// Static variable
	static int a, b;

	// Static block
	static {
		System.out.println("inside static block ");
	}

	// Static method
	static void fun() {
		System.out.println("Inside static method");
		a = 10;
		b = 20;
	}

	// Instance variable / non static variable
	int x, y;

	// Non static block
	{
		System.out.println("Inside non static block");
	}

	// Non static method
	void fun1() {
		System.out.println("inside non static method");
	}

	// Constructor
	DemoStatic() {
		System.out.println("Inside constructor");
		x = 23;
		y = 55;
	}

}

public class static_Start {
	//

	public static void main(String[] args) {
		DemoStatic.fun();
	
		DemoStatic c1 = new  DemoStatic();
		c1.fun1();
	}

}
