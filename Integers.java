import java.util.ArrayList;

public class Integers {
	ArrayList<Integer> nums = new ArrayList();
	
	static int computeSun(ArrayList<Integer> ints) {
		int sum = 0;
		for(int num: ints) {
		
			sum = sum + num;
		}
		return sum;
	}
	
}
