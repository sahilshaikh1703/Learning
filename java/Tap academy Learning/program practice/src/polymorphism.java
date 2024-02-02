class Plane {

	void fly() {
		System.out.println("Plane is flying ");
	}
	void landing() {
		System.out.println("Plane require runway ");
	}
	void CaryyingObjects() {
		System.out.println("Plane is carrying objects ");
	}
}

class CargoPlane extends Plane{
	void fly() {
		System.out.println("Cargo Plane is flying at low altitude");
	}
	void landing() {
		System.out.println("Cargo Plane require long runway ");
	}
	void CaryyingObjects() {
		System.out.println("Cargo Plane is carrying cargos ");
	}
}

class FighterPlane extends Plane {

	void fly() {
		System.out.println("Fighter Plane is flying at high altitude");
	}
	void landing() {
		System.out.println("Fighter Fighter Plane require long runway  ");
	}
	void CaryyingObjects() {
		System.out.println("Fighter Plane is carrying weapons ");
	}
}


class Airport{
//	here Plane ref is reference of parent class and object is of child class ... This is DOWNCASTING
	static void PermitAction(Plane ref)
	{
		ref.fly();
		ref.CaryyingObjects();
		ref.landing();
	}
	
}
public class polymorphism {

	public static void main(String[] args) {
		
	CargoPlane	cp = new CargoPlane();
	FighterPlane	fp = new FighterPlane();
	Airport.PermitAction(cp);
	Airport.PermitAction(fp);
	
		
	}

}
