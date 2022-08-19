package com.adel.dto;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfo {
    
	@NotBlank(message = "* User name must not be blank")
//	@Min(value = 3 , message = "* Your name shoud have atleast 3 char ")
//	@Size(min = 3 , max = 15 , message = "* Your name shoud have between 3-15 ")
	private String name ;
	@NotBlank(message = "* crush name must not be blank")
	@Size(min = 3 , max = 15 , message = "* Your name shoud have between 3-15 ")
	private String crushName ;
	
	@AssertTrue(message = "* You have to agree to play")
	boolean termAndCondithion ;
	
	private String result;
	
	
	public UserInfo() {}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCrushName() {
		return crushName;
	}
	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}

	public boolean isTermAndCondithion() {
		return termAndCondithion;
	}

	public void setTermAndCondithion(boolean termAndCondithion) {
		this.termAndCondithion = termAndCondithion;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "UserInfoDTO [name=" + name + ", crushName=" + crushName + ", termAndCondithion=" + termAndCondithion
				+ ", result=" + result + "]";
	}

}
