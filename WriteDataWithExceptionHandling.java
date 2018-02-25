public class WriteDataWithExceptionHandling {
  public static void main(String[] args) throws Exception {
	try {
    java.io.File file = new java.io.File("scores.txt");
 

    // Create a file
    java.io.PrintWriter output = new java.io.PrintWriter(file);
    

    // Write formatted output to the file
    output.print("John T Smith ");
    output.println(90);
    output.print("Eric K Jones ");
    output.println(85);

    // Close the file
    output.close();
	}
    catch(Exception ex) { 
        System.out.println("Unable to write to scores.txt file.  Possible cause:"); 
        System.out.println(ex.getMessage()); 
    } 
  }
}
