package poPI;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.TreeSet;

class Flights_1 implements Comparable<Flights_1> {
	private String departure;
	private String name;
	private float duration;
	private int price;

	public Flights_1(String departure, String name, float duration, int price) {

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
	public int compareTo(Flights_1 f1) {
		String s1 = this.departure;
		String s2 = f1.departure;

		return s1.compareTo(s2);
	}

}

public class CompareToInterface {
	public static void main(String[] args) {
		Flights_1 f5 = new Flights_1("20:00", "Air India", 1.5f, 5000);

		Flights_1 f1 = new Flights_1("10:00", "Indigo", 1.5f, 5000);
		Flights_1 f2 = new Flights_1("12:00", "Air Asia", 1.5f, 5000);
		Flights_1 f3 = new Flights_1("15:00", "luftansa", 1.5f, 5000);
		Flights_1 f4 = new Flights_1("18:00", "Emirate", 1.5f, 5000);

		TreeSet<Flights_1> arr = new TreeSet<Flights_1>();
		arr.add(f1);
		arr.add(f2);
		arr.add(f3);
		arr.add(f4);
		arr.add(f5);
		
		for (Flights_1 flight : arr) {
			System.out.println(flight);
		}

	}

}
