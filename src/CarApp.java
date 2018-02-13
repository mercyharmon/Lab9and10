/*
 * Lab 9 
 * Make a new main for Lab 10
 */
import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {
	public static void main(String[] args) {
		System.out.println("Welcome to the Grand Circus console!");
		System.out.println("inventory");
		Scanner scan = new Scanner(System.in);

		ArrayList<Car> carlist = new ArrayList<Car>();

		Car a = new Car();// object of a
		a.setMake("Ford");
		a.setModel("Escape");
		a.setYear(2015);
		a.setPrice(34999.99);
		//System.out.println(a);
		carlist.add(a);

		Car b = new Car();// object of b
		b.setMake("BMW");
		b.setModel("FiveSeries");
		b.setYear(2018);
		b.setPrice(544999.99);
		//System.out.println(b);
		carlist.add(b);

		Car c = new Car();// object of c
		c.setMake("Honda");
		c.setModel("Accord");
		c.setYear(2010);
		c.setPrice(18999.99);
		//System.out.println(c);
		carlist.add(c);

		Car d = new Car();// object of d
		d.setMake("Dodge");
		d.setModel("Challenger");
		d.setYear(2016);
		d.setPrice(40999.99);
		//System.out.println(d);
		carlist.add(d);

		Car e = new Car();// object of e
		e.setMake("Mercedes");
		e.setModel("SFiveFifty");
		e.setYear(2017);
		e.setPrice(64999.99);
		//System.out.println(e);
		carlist.add(e);
		
		printList(carlist);

		int numofCars = Validator.getInt(scan, "How many cars are you entering:");

		int carCounter = 1;
		for (int i = 0; i < numofCars; i++) {// prompt for # of cars and the assc info
			String carMake = Validator.getString(scan, "Please enter the make for car # " + carCounter + ": ");
			String carModel = Validator.getString(scan, "Please enter the model for car # " + carCounter+ ": ");
			int carYear = Validator.getInt(scan, "Please enter the year for car # " + carCounter+ ": ");
			double carPrice = Validator.getDouble(scan, "Please enter the price for car # " + carCounter+ ": ");
			carCounter++;

			Car userCar = new Car(carMake, carModel, carYear, carPrice);
			carlist.add(userCar);

		}

		printList(carlist);

	}

	private static void printList(ArrayList<Car> carlist) {
		for (Car car : carlist) {
			System.out.println(car);
			
		}
	}
}
