import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;


public class AddUser extends Application {
	Label nameLabel = new Label("Username:");
	Label passwordLabel = new Label("Password:");
	TextField nameInput = new TextField();
	Text errorMessage = new Text("");
	Text successMessage = new Text("");
	PasswordField passwordInput = new PasswordField();
	Button addUserButton = new Button("Add User");
	Button clearButton = new Button("Clear");

	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Add User");
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10,10,10,10));
		grid.setVgap(12);
		grid.setHgap(12);
		errorMessage.setFill(Color.RED);
		successMessage.setFill(Color.GREEN);
		GridPane.setConstraints(errorMessage, 0, 0);
		GridPane.setConstraints(successMessage, 0, 0);
		GridPane.setConstraints(nameLabel, 0, 1);
		GridPane.setConstraints(nameInput, 1, 1);
		GridPane.setConstraints(passwordLabel, 0, 2);
		GridPane.setConstraints(passwordInput, 1, 2);
		GridPane.setConstraints(addUserButton, 0, 3);
		GridPane.setConstraints(clearButton, 1, 3);
		
		addUserButton.setOnAction(e -> addUser());
		clearButton.setOnAction(e -> clearFields());
	    grid.getChildren().addAll(successMessage, errorMessage,nameLabel, nameInput, passwordLabel, passwordInput, addUserButton, clearButton);
	    Scene scene = new Scene(grid, 500, 400);
	    primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	private void addUser() {
		if(validateFields()) {
		String username = nameInput.getText();
		username = username.toLowerCase();
		String password = passwordInput.getText();
		//System.out.println(username + "|" + password);
		java.io.File file = new java.io.File("users.txt");
		try {
	    Writer output;
	    output = new BufferedWriter(new FileWriter(file, true));  //clears file every time
	   // output.close();
	    
	    output.append(username + "|" + password + System.lineSeparator());
	    output.close();
	    errorMessage.setText("");
	    successMessage.setText(username + " is added!");
		}
	    catch(Exception ex) { 

	    	System.out.println("Unable to write to " + file.getName()); 

	        
	           } 
		}
		else {
	    	successMessage.setText("");
	    	errorMessage.setText("Empty Fields");
		}
	}
	private boolean validateFields() {
		String username = nameInput.getText();
		String password = passwordInput.getText();
		
		if(username.length() == 0 || password.length() == 0) {
			return false;
		}
		else {
			return true;
		}
	}
	private void clearFields() {
		nameInput.clear();
		passwordInput.clear();
		errorMessage.setText("");
	}
}
