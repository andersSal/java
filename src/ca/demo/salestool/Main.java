package ca.demo.salestool;

public class Main {
	public static void main(String[] args) {
		SalesData data = new SalesData(); 
		displayGreeting(); 
		data.display(); 
	} 
	
	public static void displayGreeting() {
		System.out.println("Hello peeple");
		System.out.println("This app shows sales data");
	}
}	
