public class TestDate3 {

	public static void main(String[] args) {
		getSquare2(0,10); 
		}
	
	static void getSquare(int n) {
		for(int i = 0; i < n || i == n; i++) {
			System.out.println("The square of " + i + " is " + i * i); 
		}
	}
	
	static void getSquare2(int i, int n) {
		if (i <= n) {
			System.out.println("The square of " + i + " is " + i * i);
			getSquare2(i + 1, n );
		}
		
		else {
			return;
		}
	}
}