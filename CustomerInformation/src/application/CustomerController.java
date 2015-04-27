package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;

public class CustomerController {
	
	@FXML
	TextField FirstName;
	@FXML
	TextField MiddleInit;
	@FXML
	TextField LastName;
	@FXML
	TextField Address;
	@FXML
	TextField City;
	@FXML
	ComboBox<String> State;
	ObservableList<String> StateData = FXCollections.observableArrayList();
	@FXML
	PasswordField Zip;
	@FXML
	RadioButton Male;
	@FXML
	RadioButton Female;
	@FXML
	Button Save;
	@FXML
	Button Clear;
	ToggleGroup Gender = new ToggleGroup();
	
	public CustomerController() {
		StateData.add("Alabama");
		StateData.add("Alaska");
		StateData.add("Arizona");
		StateData.add("Arkansas");
		StateData.add("California");
		StateData.add("Colorado");
		StateData.add("Connecticut");
		StateData.add("Delaware");
		StateData.add("Florida");
		StateData.add("Georgia");
		StateData.add("Hawaii");
		StateData.add("Idaho");
		StateData.add("Illinois");
		StateData.add("Indiana");
		StateData.add("Iowa");
		StateData.add("Kansas");
		StateData.add("Kentucky");
		StateData.add("Louisianna");
		StateData.add("Maine");
		StateData.add("Maryland");
		StateData.add("Massachusetts");
		StateData.add("Michigan");
		StateData.add("Minnesota");
		StateData.add("Mississippi");
		StateData.add("Missouri");
		StateData.add("Montana");
		StateData.add("Nebraska");
		StateData.add("Nevada");
		StateData.add("New Hampshire");
		StateData.add("New Jersey");
		StateData.add("New Mexico");
		StateData.add("New York");
		StateData.add("North Carolina");
		StateData.add("North Dakota");
		StateData.add("Ohio");
		StateData.add("Oklahoma");
		StateData.add("Oregon");
		StateData.add("Pennsylvania");
		StateData.add("Rhode Island");
		StateData.add("South Carolina");
		StateData.add("South Dakota");
		StateData.add("Tennessee");
		StateData.add("Texas");
		StateData.add("Utah");
		StateData.add("Vermont");
		StateData.add("Virginia");
		StateData.add("Washington");
		StateData.add("West Virginia");
		StateData.add("Wisconsin");
		StateData.add("Wyomming");
	}
	
	@FXML
	private void initialize() {
		State.setItems(StateData);
		Male.setToggleGroup(Gender);
		Female.setToggleGroup(Gender);
		Male.setSelected(true);
	}
	
	@FXML
	private void handleSave() {
		Customer c = new Customer();
		c.setFirstName(FirstName.getText());
		c.setMiddleInit(MiddleInit.getText());
		c.setLastName(LastName.getText());
		c.setAddress(Address.getText());
		c.setCity(City.getText());
		c.setZip(Zip.getText());
		c.setState(State.getValue());
		if (Male.isSelected()) {
			c.setGender("Male");
		}
		else if (Female.isSelected()) {
			c.setGender("Female");
		}
	}
	
	@FXML
	private void handleClear() {
		FirstName.clear();
		MiddleInit.clear();
		LastName.clear();
		Address.clear();
		City.clear();
		Zip.clear();
		Male.setSelected(true);
		State.setValue(null);
	}
	
	

}

