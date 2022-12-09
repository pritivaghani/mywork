package model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="stddetails")
public class Std_details {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="sdid")
	int sdid;
	
	@Column(name="address")
	String address;
	
	@OneToOne(mappedBy = "sd", cascade = CascadeType.ALL)
	Std s;

	public int getSdid() {
		return sdid;
	}

	public void setSdid(int sdid) {
		this.sdid = sdid;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Std getS() {
		return s;
	}

	public void setS(Std s) {
		this.s = s;
	}

	
}
