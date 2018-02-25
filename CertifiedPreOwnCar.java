
class CertifiedPreOwnCar extends Car {
	int extendedWarrantyYears;
	int extendedWarrantyMiles;
	public CertifiedPreOwnCar(int year, String make, String model, int currentMiles) {
		super(year, make, model, currentMiles);
		
	}
	
	public int getExtendedWarrantyMiles() {
		return extendedWarrantyMiles;
	}
	
	public void setExtendedWarrantyMiles(int miles) {
		extendedWarrantyMiles = miles;
	}
	
	public int getExtendedWarrantyYears() {
		return extendedWarrantyYears;
	}
	
	public void setExtendedWarrantyYears(int years) {
		extendedWarrantyYears = years;
	}
	
	public boolean isCoveredUnderWarranty() {
		if((warrantyYears + extendedWarrantyYears <= 0) || (currentMiles > warrantyMiles + extendedWarrantyMiles)) {
			return false;
		}
		else{
			return true;
		}
	}
}
