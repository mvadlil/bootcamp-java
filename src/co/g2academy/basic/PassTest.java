package co.g2academy.basic;

public class PassTest {

	public static void changeInt(int val) {
		val = 55;
	}
	
	public static void changeReference(MyDate myDate) {
		myDate.setDay(4);
	}

	public static void changeString(String str) {
		str = "new value";
	}

	public static void main(String[] args) {
		//variable declaration
		int val;
		//variable assignment
		val = 11;
		//try to change it
		changeInt(val);
		//is this operation change val value??
		System.out.println("Val value is: " + val);
		
		//this operation change value of reference
		MyDate today = new MyDate(25, 10, 2020);
		changeReference(today);
		today.showMyDate();

		String str = "this is original value";
		changeString(str);
		System.out.println("String value is: " + str);


	}

}