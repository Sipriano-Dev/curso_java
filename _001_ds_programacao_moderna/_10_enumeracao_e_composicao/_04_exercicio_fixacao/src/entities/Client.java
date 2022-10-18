package entities;

import java.util.Date;

public class Client {
	
	private String name;
	private String email;
	private Date BirthDate;
	
	public Client() {
		
	}

	public Client(String name, String email, Date birthDate) {
		this.name = name;
		this.email = email;
		BirthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return BirthDate;
	}

	public void setBirthDate(Date birthDate) {
		BirthDate = birthDate;
	}
	
	

}
