import java.util.Map;
import java.util.TreeMap;

public class TestDates2 {

	public static void main(String[] args) {
		Date d1 = new Date(7, 24, 2018); 
		Date d2 = new Date(8, 26, 2019);
		Date d3 = new Date(9, 30, 2020);
		Date d4 = new Date(10, 3, 2021);
		
		TreeMap<Date, String> syllabus = new TreeMap();
			syllabus.put(d1, "Java2"); 
			syllabus.put(d2, "Python");
			syllabus.put(d3, "C++");
			syllabus.put(d4, "JavaScript");
			
		for(Map.Entry<Date, String> topic : syllabus.entrySet()) {
			if (topic.getKey().month == 9 && topic.getKey().year == 2002) {
				System.out.println(topic.getValue());
			}
			else {
				System.out.println(topic.getValue() + " does not fall in September, 2002" + "\n" );
			}
		
		}

	}
	
}