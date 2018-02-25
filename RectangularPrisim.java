import java.lang.Math;
public class RectangularPrisim {
	
	double width;
	double length;
	double height;
	
	public RectangularPrisim(double w,double l,double h) {
		this.width = w;
		this.length = l;
		this.height = h;
	}
	
	public double Volume() {
		return width * length * height;
	}
	
	public double surfaceArea() {
		return 2 * ((width*length) + (height * length) + (height * width));
	}
	
	public double spaceDiagonal() {
		double root = (length * length)  + (width * width) + (height * height);
		return Math.sqrt(root);
	}

	public static void main(String[] args) {
		RectangularPrisim myPrisim = new RectangularPrisim(2,3,4);
		RectangularPrisim myPrisim2 = new RectangularPrisim(10,3.5,9.8);
		System.out.println(myPrisim.Volume());
		System.out.println(myPrisim.surfaceArea());
		System.out.println(myPrisim.spaceDiagonal());
		System.out.println(myPrisim2.Volume());
		System.out.println(myPrisim2.surfaceArea());
		System.out.println(myPrisim2.spaceDiagonal());
		
		}

}
