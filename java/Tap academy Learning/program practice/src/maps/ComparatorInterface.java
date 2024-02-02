package maps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

class ComparePrice implements Comparator<Flights_1> {

	@Override
	public int compare(Flights_1 f1, Flights_1 f2) {
		Integer price1 = f1.getPrice();
		Integer price2 = f2.getPrice();
		return price1.compareTo(price2);

	}
}

class CompareDuration implements Comparator<Flights_1> {

	@Override
	public int compare(Flights_1 f1, Flights_1 f2) {
		Integer d1 = f1.getPrice();
		Integer d2 = f2.getPrice();
		return d1.compareTo(d2);

	}
}

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

public class ComparatorInterface {

	public static void main(String[] args) {

		Flights_1 f1 = new Flights_1("10:00", "Indigo", 1.5f, 2500);
		Flights_1 f2 = new Flights_1("12:00", "Air Asia", 1.2f, 5000);
		Flights_1 f3 = new Flights_1("15:00", "luftansa", 1.5f, 3500);
		Flights_1 f4 = new Flights_1("18:00", "Emirate", 2.5f, 10000);
		Flights_1 f5 = new Flights_1("20:00", "Air India", .5f, 7500);

		ArrayList<Flights_1> arr = new ArrayList<Flights_1>();
		arr.add(f1);
		arr.add(f2);
		arr.add(f3);
		arr.add(f4);
		arr.add(f5);

		System.out.println("Choose the way in which Sort has to be done ");
		System.out.println("On basis of departure, Press 1");
		System.out.println("On basis of Price , Press 2");
		System.out.println("On basis of Duration, Press 3 ");

		Scanner scan = new Scanner(System.in);
		
		int choise = scan.nextInt();

		if (choise == 1) {
			Collections.sort(arr);
			System.out.println("Choise 1 got executed");

		} else if (choise == 2) {
			Collections.sort(arr, new ComparePrice());
			System.out.println("Choise 2 got executed");

		} else {
			Collections.sort(arr, new CompareDuration());
			System.out.println("Choise 3 got executed");
		}
		Collections.sort(arr, new ComparePrice());

		for (Flights_1 flight : arr) {
			System.out.println(flight);
		}

	}

}
