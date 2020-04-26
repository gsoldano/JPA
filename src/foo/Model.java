package foo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="newtable")
public class Model {
	
	@Id
	private int id;
	private String firstName;
	private String lastName;
	private String country;
	
	Model() {
		
	}
	
	Model(String s0, String s1, String s2) {
		this.firstName = s0;
		this.lastName = s1;
		this.country = s2;
	}
	
	Model(int i0, String s0, String s1, String s2) {
		this.id = i0;
		this.firstName = s0;
		this.lastName = s1;
		this.country = s2;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}

}
