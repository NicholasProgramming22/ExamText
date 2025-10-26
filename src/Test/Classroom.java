package Test;
import java.util.Scanner;

public class Classroom {
	
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int id = 0;
		String fName = "";
		String lName = "";
		String email = "";
		String phone = "";
		String home = "";
		String post = "";
		
		String answer1;
		
		Student student1 = new Student(id, fName, lName, email, phone, home, post);
		
		System.out.println("Welcome to the school survey");
		System.out.println("Please enter the following details");
		System.out.println();
		System.out.print("Student Id: ");
		id = input.nextInt();
		id = validationInt(id);
		student1.setStudentId(id);
		System.out.print("First Name: ");
		fName = input.next();
		fName = validation(fName);
		student1.setFirstName(fName);
		System.out.print("Last Name: ");
		lName = input.next();
		lName = validation(lName);
		student1.setSurname(lName);
		System.out.print("Email: ");
		email = input.next();
		student1.setEmailAddress(email);
		System.out.print("Phone number: ");
		phone = input.next();
		student1.setPhone(phone);
		System.out.print("Home address: ");
		home = input.next();
		home = input.nextLine();
		student1.setHomeAddress(home);
		System.out.print("Postcode: ");
		post = input.next();
		student1.setPostcode(post);
		System.out.println();
		
		System.out.println("I will be asking you questions on hobbies and activities you like");
		System.out.println();
		System.out.println("1. What is your favourite colour?");
		System.out.println();
		System.out.print("Student answer: ");
		answer1 = input.next();
	}
	
	public static String validation (String value) {
		while (!String.valueOf(value).matches("[A-Za-z ]+")) {
			System.out.println("Letters only");
			System.out.print("Enter value: ");
			value = input.next();
		}
		
		return value;
	}
	
	public static int validationInt (int value1) {
		while (!String.valueOf(value1).matches("\\d{4}")) {
			System.out.println("Value must be 4 digits");
			System.out.print("Enter value: ");
			value1 = input.nextInt();
		}
		
		return value1;
	}

}
