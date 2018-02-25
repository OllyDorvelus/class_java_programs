
public class TestCar {
	public static void main(String args[]) {
        
		Car m6 = new Car(2017, "Camaro", "SS", 10); 
        m6.setWarrantyYears(10); 
        m6.setWarrantyMiles(50000); 
        m6.checkWarrantyStatus(); 
        
        Car eclipse = new Car(2007, "Eclipse", "MX-5", 100000); 
        eclipse.setWarrantyYears(3); 
        eclipse.setWarrantyMiles(99000); 
        eclipse.checkWarrantyStatus(); 
        
        Car audi = new Car(2016, "Audi", "R8", 10000); 
        audi.setWarrantyYears(3); 
        audi.setWarrantyMiles(36000); 
        audi.checkWarrantyStatus(); 
        
        CertifiedPreOwnCar accord = new CertifiedPreOwnCar(2010, "Honda", "Accord", 45000); 
        accord.setWarrantyYears(0); 
        accord.setWarrantyMiles(36000); 
        accord.setExtendedWarrantyMiles(100000); 
        accord.setExtendedWarrantyYears(0); 
        accord.checkWarrantyStatus(); 
        
        CertifiedPreOwnCar infinity = new CertifiedPreOwnCar(2010, "Infinity", "Q50", 1000); 
        infinity.setWarrantyYears(0); 
        infinity.setWarrantyMiles(36000); 
        infinity.setExtendedWarrantyMiles(100000); 
        infinity.setExtendedWarrantyYears(6); 
        infinity.checkWarrantyStatus(); 
	}
}
