package programs;

class plane {

	void fly() {
		System.out.println("Plane is flying ");
	}

	void land() {
		System.out.println("Plane is landing ");
	}

	void carryObject() {
		System.out.println("Plane is carrying objects ");
	}
}

class Cargoplane extends plane {
	// Here Landing is void land() is Inherited Method
	// fly() is overriden method
	void fly() {
		System.out.println("Cargo Plane is flying at low altitude ");
	}

	// CarryPassenger is specilised method
	void carryCargo() {
		System.out.println("Plane is carrying Cargo ");
	}
}

class passengerPlane {

	void fly() {
		System.out.println("Plane is flying high altitude  ");

	}

	void carryPassenger() {
		System.out.println("Plane is carrying passenger ");
	}
}

public class TypeOfInheritance {

	public static void main(String[] args) {
		
		Cargoplane obj1 = new Cargoplane();
		obj1.fly();
		obj1.carryCargo();
		obj1.land();

	}

}
