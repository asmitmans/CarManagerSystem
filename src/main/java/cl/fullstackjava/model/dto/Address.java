package cl.fullstackjava.model.dto;

public class Address {
	private int id;
	private String street;
	private String number;
	private int userId;
	private User user;
	
	public Address() {
		super();
	}
	
	

	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	public Address(int id, String street, String number, int userId) {
		super();
		this.id = id;
		this.street = street;
		this.number = number;
		this.userId = userId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}
