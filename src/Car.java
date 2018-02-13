

public class Car {
	String make; //instance varibles
	String model;
	int Year;
	double Price;

	Car (String make, String model, int Year, double Price) {
		this.make = make;
		this.model = model;
		this.Year= Year;
		this.Price= Price;
				
	}
	Car (){// the empty constructor (you can take in no paramters)
		
	}
	
		public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int year) {
		Year = year;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
		public String toString() {
			return String.format("%-10s %-10s %-10d %-10.2f", make, model, Year, Price);
			//this is %(whatever letter =string(%s), string, int(%d), double%f)
			//
			
			
			
			
		}
		

}
