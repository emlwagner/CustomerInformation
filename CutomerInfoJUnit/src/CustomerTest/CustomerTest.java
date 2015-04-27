package CustomerTest;

import static org.junit.Assert.*;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import application.Customer;
import application.CustomerController;

public class CustomerTest {
	
	Customer c = new Customer("Emily", "L", "Wagner", "Female", "440 Gaul Rd", "Reading", "Pennsylvania", "19785");
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFirst() {
		String first = "Emily";
		assertEquals(first, c.getFirstName());
	}
	
	@Test
	public void testMid() {
		String mid = "L";
		assertEquals(mid, c.getMiddleInit());
	}
	
	@Test 
	public void testLast() {
		String last = "Wagner";
		assertEquals(last, c.getLastName());
	}
	
	@Test
	public void testGender() {
		String gender = "Female";
		assertEquals(gender, c.getGender());
	}
	
	@Test
	public void testAddress() {
		String addr = "440 Gaul Rd";
		assertEquals(addr, c.getAddress());
	}
	
	@Test
	public void testCity() {
		String city = "Reading";
		assertEquals(city, c.getCity());
	}
	
	@Test
	public void testState() {
		String state = "Pennsylvania";
		assertEquals(state, c.getState());
	}
	
	@Test
	public void testZip() {
		String zip = "19785";
		assertEquals(zip, c.getZip());
	}

}
