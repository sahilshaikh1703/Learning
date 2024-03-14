package maps;

import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map;
import java.util.Map.Entry;
public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	TreeMap<String , String>	flights = new TreeMap() ;
	System.out.println("Is the Map Empty " + flights.isEmpty());

	flights.put("09:00", "Indore");
	flights.put("10:00", "Indore");
	flights.put("12:00", "HYD");
	flights.put("14:00", "Pune");
	flights.put("15:00", "Mumbai");
	flights.put("18:00", "Chennai");
	flights.put("19:00", "Chennai");

	flights.put("21:00", "Chennai");

	System.out.println("The size of the flight " + flights.size());	

	System.out.println(flights);
	// Remove first entry
	 System.out.println(flights.pollFirstEntry());
		System.out.println(flights);
	//Remove last Entry 
		flights.pollLastEntry();
		System.out.println("Is the Map Empty " + flights.isEmpty());
		
	System.out.println("The size of the flight " + flights.size());	
		

	System.out.println("is key present or not " + flights.containsKey("10:00"));
	
	System.out.println("The Removed entry: " + flights.remove("19:00"));
	
	flights.remove("09:00", "Indore");
	System.err.println(flights);
	System.out.println("*******************");
//	Set<Entry<String, String>> flight = flights.entrySet();
	
//	for(Entry<String, String> e : flight) {
//		System.out.println(e.getKey() + " : " + e.getValue());
//	}
//	
//	//	Exclusive of 14:00
//		Map<String, String> flight2 = flights.headMap("14:00");
//	// Inclusive of 14:00
//		Map<String, String> flight2 = flights.headMap("14:00", true);
//		
//		Set<Entry<String, String>> entries = flight2.entrySet();
//		for ( Entry<String, String> E:entries) {
//			System.out.println(E);
//		}
	
	
//	System.out.println(flights.tailMap("14:00"));
	
//	System.out.println(	flights.subMap("10:00", "14:00"));
	
	//puts Key value if it is absent

	flights.putIfAbsent("23:00", "Banglore ");
	flights.putIfAbsent("23:00", "India");
	
	System.out.println(flights);
	 Map<String, String> f1 = flights.subMap("10:00", true , "14:00", true) ;
	 Set<Entry<String, String>> e1 = f1.entrySet();
	 for (Entry e:e1) {
		 System.out.println(e);
	 }
	 
	 
	}
	
	}


