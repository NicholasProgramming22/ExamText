package Test;

public class Student {
	private int studentId;
	private String firstName;
	private String surname;
	private String emailAddress;
	private String phone;
	private String homeAddress;
	private String postcode;
	
	public Student (int id, String fName, String lName, String email, String tel, String home, String post) {
		 this.studentId = id;
		 this.firstName = fName;
		 this.surname = lName;
		 this.emailAddress = email;
		 this.phone = tel;
		 this.homeAddress = home;
		 this.postcode = post;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	
	public void output () {
		System.out.println();
		System.out.println("Your details");
		System.out.println("Student Id: " + getStudentId());
		System.out.println("First Name: " + getFirstName());
		System.out.println("Last Name: " + getSurname());
		System.out.println("Email: " + getEmailAddress());
		System.out.println("Phone Number: " + getPhone());
		System.out.println("Home address: " + getHomeAddress());
		System.out.println("Postcode: " + getPostcode());
	}
	
	
}
