public class Date implements Comparable {
	int month;
	int day;
	int year;

Date(int m,int d, int y) {
	this.month = m;
	this.day=d;
	this.year = y;
	
	}

public int compareTo(Object datee) {
	Date compare = (Date) datee;
		if( this.year > compare.year) {
			return 1;
			} 
	
		else if (this.year < compare.year) {
			return -1;
			}
	
		else if (this.month > compare.month) {
			return 1;
			}
		
		else if (this.month < compare.month) {
			return -1;
			}
		
		else if (this.day > compare.day) {
			return 1;
			}
		
		else if (this.day < compare.day) {
			return -1;
			
		}
		
		else {
			
			return 0; 
		}
	
	}


public String toString() {
	return "" + this.month + "/" + this.day + "/" + this.year;
	}

}