package ExamCreator;

public class School {
	private String name;
	private String address;
	private String city;
	private String State;
	private String zipCode;
	private String Phone;
	private Class nClass;
	
	
	public School(String name){
		this.name = name;
	}
	
	public School(String name, String address, String city, String state, String zipCode, String phone) {
		this.name = name;
		this.address = address;
		this.city = city;
		this.State = state;
		this.zipCode = zipCode;
		this.Phone = phone;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return State;
	}


	public void setState(String state) {
		State = state;
	}


	public String getZipCode() {
		return zipCode;
	}


	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}


	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}


}