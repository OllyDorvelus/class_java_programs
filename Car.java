
public class Car {
	int year;
	String make;
	String model;
	int currentMiles;
	int warrantyMiles;
	int warrantyYears;
	
	public Car(int year, String make,String model, int currentMiles) {
		this.year = year;
		this.make = make;
		this.currentMiles = currentMiles;
		this.model = model;
	}
	public int getWarrantyMiles() {
		return warrantyMiles;
	}
	
	public void setWarrantyMiles(int miles) {
		this.warrantyMiles = miles;
	}
	
	public int getWarrantyYears() {
		return warrantyYears;
	}
	
	public void setWarrantyYears(int years) {
		this.warrantyYears = years;
	}
	
	public void checkWarrantyStatus() {
		if(isCoveredUnderWarranty()) {
		System.out.println("Your car " + this.year + " " + this.model + " with " + this.currentMiles + " miles is still covered under warranty");
		}
		else {
			System.out.println("Your car " + this.year + " " + this.model + " with " + this.currentMiles + " miles is out of warranty");
		}
	}
	
	public boolean isCoveredUnderWarranty() {
		if((warrantyYears <= 0) || (currentMiles > warrantyMiles)) {
			return false;
		}
		else {
			return true;
		}
	}

}


