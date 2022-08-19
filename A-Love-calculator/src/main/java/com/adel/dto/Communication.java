package com.adel.dto;

import com.adel.validator.PhoneNO;

public class Communication {
 
	private String email  = "m.q.b2009@gmail.com";
	@PhoneNO
	private Phone  phone  ;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}
}