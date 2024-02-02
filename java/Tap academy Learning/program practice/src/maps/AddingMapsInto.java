package maps;

import java.util.HashMap;

public class AddingMapsInto {

	public static void main(String[] args) {

		HashMap<String, String> flights = new HashMap();

		flights.put("09:00", "Indore");
		flights.put("10:00", "Indore");
		flights.put("12:00", "HYD");
		flights.put("14:00", "Pune");
		flights.put("15:00", "Mumbai");
		flights.put("18:00", "Chennai");
		flights.put("19:00", "Chennai");
		flights.put("Name", "Chennai");
		
		System.out.println(flights);


		HashMap<String, String> data = new HashMap();

		data.put("Name", "Sahil");
		data.put("Gender", "Male");
		data.put("City", "Indore");
		
		
		flights.putAll(data);
		
		System.out.println(flights);
	}

}
