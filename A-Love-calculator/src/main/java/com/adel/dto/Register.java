package com.adel.dto;

import javax.validation.constraints.NotEmpty;

import com.adel.validator.Age;

public class Register {

	@NotEmpty(message = "* Can not be empty")
	private String  user;
	private String  userName ;
	private char[]  password;
	private String  country ;
	private String[] hobby;
	private String   gender;
	@Age
	private Integer age;
	 
	
	private Communication communicationDTO ;
	
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public char[] getPassword() {
		return password;
	}
	public void setPassword(char[] password) {
		this.password = password;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String[] getHobby() {
		return hobby;
	}
	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Communication getCommunicationDTO() {
		return communicationDTO;
	}
	public void setCommunicationDTO(Communication communicationDTO) {
		this.communicationDTO = communicationDTO;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	

}
