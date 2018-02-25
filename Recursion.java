
public class Recursion {

	
	
	public int factorialRecursive(int n) {
		if(n <= 1) {
			return 1;
		} else {
			return n * factorialRecursive(n-1);
		}
	}
	
	public int factorial(int n) {
		if(n <= 1) {
			return 1;
		}
		else {
			int factorial = n;
			int counter = n;
			while(counter != 1) {
				factorial = factorial * (counter - 1);
				counter--;
			}
			return factorial;
		}
	}
	
	public void printBackwardsRecursive(int n) {
		if(n <= 0) {
			System.out.println("0");
			return;
		}
		if(n != 0) {
			System.out.print(n + " ");
			printBackwardsRecursive(n - 1);
			
		}
		

	}
	public void printBackwards(int n) {
		if (n <= 0) {
			System.out.println("0");
		}
		else {
			int counter = n;
			while(counter != -1) {
				System.out.print(counter + " ");
				counter--;
			}
		}
	}	
	
	public static void main(String args[]) {
		Recursion recursive = new Recursion();
		recursive.printBackwardsRecursive(30);
		recursive.printBackwards(30);
		System.out.println();
		recursive.printBackwardsRecursive(-3);
		recursive.printBackwards(-4);
		System.out.println();
		System.out.println(recursive.factorial(5));
		System.out.println(recursive.factorialRecursive(5));
		System.out.println(recursive.factorial(-3));
		System.out.println(recursive.factorialRecursive(0));
		
		
		
		
	}
}
