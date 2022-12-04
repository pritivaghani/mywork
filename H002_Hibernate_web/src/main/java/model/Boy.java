package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Boy")

public class Boy {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	int id;
	
	@Column(name="bname")
	String bname;
	
	@Column(name="email")
	String email;
	
	
	@Column(name="pass")
	String pass;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getBname() {
		return bname;
	}


	public void setBname(String bname) {
		this.bname = bname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public Boy() {
		// TODO Auto-generated constructor stub
	}


	public Boy(int id, String bname, String email, String pass) {
		super();
		this.id = id;
		this.bname = bname;
		this.email = email;
		this.pass = pass;
	}
	
		
	
	
}
