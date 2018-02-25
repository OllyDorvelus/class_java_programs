import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Register extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Register");
		
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10,10,10,10));
		grid.setVgap(12);
		grid.setHgap(12);
	
		Label nameLabel = new Label("User Name:");
		GridPane.setConstraints(nameLabel, 0, 0);
		
		TextField nameInput = new TextField();
	    GridPane.setConstraints(nameInput, 1, 0);
	    
		Label passwordLabel = new Label("Password:");
		GridPane.setConstraints(passwordLabel, 0, 1);
		
		PasswordField passwordInput = new PasswordField();
	    GridPane.setConstraints(passwordInput, 1, 1);
	    
		Label emailLabel = new Label("Email:");
		GridPane.setConstraints(emailLabel, 0, 2);
		
		TextField emailInput = new TextField();
		GridPane.setConstraints(emailInput, 1, 2);
	
		
		Label phoneLabel = new Label("Phone:");
		GridPane.setConstraints(phoneLabel, 0, 3);
		
		TextField phoneInput = new TextField();
		GridPane.setConstraints(phoneInput, 1, 3);
		
	    Button loginButton = new Button("Register");
	    GridPane.setConstraints(loginButton, 0, 4);
	    
	    Button cancelButton = new Button("Cancel");
	    GridPane.setConstraints(cancelButton, 1, 4);
	    
	    grid.getChildren().addAll(nameLabel, nameInput, passwordLabel, passwordInput, emailLabel, emailInput, phoneLabel, phoneInput, loginButton, cancelButton);
	    Scene scene = new Scene(grid, 400, 300);
	    primaryStage.setScene(scene);
		primaryStage.show();
	}
}
