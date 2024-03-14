package poPI;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeSet;

import javax.naming.ldap.SortControl;

class Flights implements Comparable<Flights> {
	private String departure;
	private String name;
	private float duration;
	private int price;

	public Flights(String departure, String name, float duration, int price) {

		this.setDeparture(departure);
		this.setName(name);
		this.setDuration(duration);
		this.setPrice(price);

	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public float getDuration() {
		return duration;
	}

	public void setDuration(float duration) { 
		this.duration = duration;
	}

	// This is called when you are trying to print an object
	public String toString() {

		return "[ departure:" + departure + ", name:" + name + ", duration: " + duration + ", price :" + price + " ]";

	}

	@Override
	public int compareTo(Flights f1) {
		String s1 = this.departure;
		String s2 = f1.departure;
		
		return s1.compareTo(s2);
	}


}

public class PoPiClass {

	public static void main(String[] args) {
		Flights f2 = new Flights("12:00", "Air Asia", 1.5f, 5000);
		Flights f5 = new Flights("20:00", "Air India", 1.5f, 5000);
		Flights f1 = new Flights("10:00", "Indigo", 1.5f, 5000);
		Flights f3 = new Flights("15:00", "luftansa", 1.5f, 5000);
		Flights f4 = new Flights("18:00", "Emirate", 1.5f, 5000);

		ArrayList<Flights> arr = new ArrayList<Flights>();
		arr.add(f1);
		arr.add(f2);
		arr.add(f3);
		arr.add(f4);
		arr.add(f5);
		
		Collections.sort(arr);
		
		for (Flights flight : arr) {
			System.out.println(flight);
		}

	}

}
