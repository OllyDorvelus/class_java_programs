import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class Login extends Application {
	Label nameLabel = new Label("Username:");
	Label passwordLabel = new Label("Password:");
	TextField nameInput = new TextField();
	Text errorMessage = new Text("");
	Text successMessage = new Text("");
	PasswordField passwordInput = new PasswordField();
	Button loginButton = new Button("Login");
	Button clearButton = new Button("Clear");
	public static void main(String[] args) {
		launch(args);
	}
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Login");
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10,10,10,10));
		grid.setVgap(12);
		grid.setHgap(12);
		GridPane.setConstraints(errorMessage, 0, 0);
		errorMessage.setFill(Color.RED);
		GridPane.setConstraints(successMessage, 0, 0);
		successMessage.setFill(Color.GREEN);
		GridPane.setConstraints(nameLabel, 0, 1);
		GridPane.setConstraints(nameInput, 1, 1);
		GridPane.setConstraints(passwordLabel, 0, 2);
		GridPane.setConstraints(passwordInput, 1, 2);
		GridPane.setConstraints(loginButton, 0, 3);
		GridPane.setConstraints(clearButton, 1, 3);
		
		loginButton.setOnAction(e -> loginUser());
		clearButton.setOnAction(e -> clearFields());
	    grid.getChildren().addAll(errorMessage, successMessage,nameLabel, nameInput, passwordLabel, passwordInput, loginButton, clearButton);
	    Scene scene = new Scene(grid, 400, 300);
	    primaryStage.setScene(scene);
		primaryStage.show();
		

	}
	public void clearFields() {
		nameInput.clear();
		passwordInput.clear();
	}
	
	public void loginUser() {
	    String username = nameInput.getText();
	    username = username.toLowerCase();
		String password = passwordInput.getText();
		String user = username + "|" + password;
		boolean isUser = false;
		
		File file = new File("users.txt");

		try {
		    Scanner text = new Scanner(file);
		    //now read the file line by line...
		    int lineNum = 0;
		    while (text.hasNextLine()) {
		        String line = text.nextLine();
		        lineNum++;
		        if(user.equals(line)) { 
		        	isUser = true;
		        	break;
	        }
		        else {
		        	isUser = false;
		        }
		    }
		    if(isUser) {
		    	errorMessage.setText("");
		    	successMessage.setText("Welcome " + username);
		    }
		    else {
		    	successMessage.setText("");
		    	errorMessage.setText("Wrong Credentials");
		    }
		} 
		
		catch(FileNotFoundException e) { 
		    System.out.println("The File: " + file.getName() + " Does Not Exist");
		}
	}
	
}
