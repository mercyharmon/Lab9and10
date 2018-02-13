//Lab10
import java.util.ArrayList;
import java.util.Scanner;

public class UsedCar extends Car {

			// Instance Variables
			double miles;

			// Constructors
			public UsedCar() {
				
			}

			public UsedCar(String make, String model, int year, double price, double miles) {
				super.make = make;
				super.model = model;
				super.Year = year;
				super.Price = price;
				this.miles = miles;
			}

			// Getter / Setter Methods
			public double getMiles() {
				return miles;
			}

			public void setMiles(double miles) {
				this.miles = miles;
			}

			// Functional Methods
				public String toString(String make, String model, int year, double price, double mileage) {
					String printString = String.format("%-10s %-18s %-6d  $%,9.2f   %,11.1f", make, model, year, price, mileage);
					return printString;
				}
				
				public String toString() {
					String printString = String.format("%-10s %-18s %-6d  $%,9.2f   %,11.1f", make, model, Year, Price, miles);
					return printString;
				}
			
				public static void showCar(UsedCar car, int num) {
					System.out.println("Car #" + num);
					System.out.println(car.getYear() + " " + car.getMake() + " " + car.getModel());
					System.out.println(car.getMiles() + " Miles");
					System.out.println("$" + car.getPrice());
					
				}
			
		

}


