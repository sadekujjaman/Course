package sylhetEnginnerCollege;


class MonthClass{
	int m;
	
	void generateCalender(int year, int month){
        this.m = month;
	}
	
	public String getMonth(){
		String month = "";
		switch(m){
		case 1:
			month = "January";
			break;
		case 2:
			month = "February";
			break;
		case 3: 
			month = "March";
			break;
		case 4:
			month = "April";
			break;
		case 5:
			month = "May";
			break;
		case 6:
			month = "June";
			break;
		case 7:
			month = "July";
			break;
		case 8:
			month = "August";
			break;
		case 9:
			month = "September";
			break;
		case 10:
			month = "October";
			break;
		case 11:
			month = "November";
			break;
		case 12:
			month = "December";
			break;
			
		}
		
		return month;
	}
}

public class TodayClass extends MonthClass {

	private int y, m, d;

	public TodayClass(int d, int m, int y){
		this.d = d;
		this.m = m;
		this.y = y;
		generateCalender(y, m);
	}

	public int getDay(){
		return d;
	}
	
	public int getYear(){
		return y;
	}

	public boolean isLeapYear(){
		if(y % 400 == 0){
			return true;
		}
		else if(y % 100 == 0)
			return false;
		else if(y % 4 == 0){
			return true;
		}
		return false;
	}

	public int numOfDaysInMonth(int m){
		int days = 0;
		switch(m){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
		case 2:
			if(isLeapYear()){
				days = 29;
			}
			else{
				days = 28;
			}
		}
		return days;
	}

	public String toString(){
		return "Today is " + getMonth() + " " + getDay() + ", " + getYear() + "\n" +
	getMonth() + " " + getYear() + " has " + numOfDaysInMonth(m) + " days";
	}
	
	public static void main(String[] args) {
		TodayClass obj = new TodayClass(21, 2, 2017);
		System.out.println(obj.toString());
	}

}
