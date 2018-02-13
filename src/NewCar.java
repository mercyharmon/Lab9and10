import java.util.Scanner;

	public class NewCar extends Car {

		// Constructors
		public NewCar() {
			
		}
		
		public NewCar(String make, String model, int year, double price) {
			super.make = make;
			super.model = model;
			super.Year = year;
			super.Price = price;
		}

	// Functional Methods

		public String toString(String make, String model, int year, double price) {
			String printString = String.format("%-10s %-18s %-6d  $%,9.2f", make, model, year, price);
			return printString;
		}
		
		public String toString() {
			String printString = String.format("%-10s %-18s %-6d  $%,9.2f", make, model, Year, Price);
			return printString;
		}
		
		public static void showCar(NewCar car, int num) {
			System.out.println("Car #" + num);
			System.out.println(car.getYear() + " " + car.getMake() + " " + car.getModel());
			System.out.println("$" + car.getPrice());
			
		}




	}

