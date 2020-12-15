package com.shop.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="user")
public class User {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "iduser")
private int iduser;
	
	

@Column(name = "first_name")
private String firstName;
	
	
@Column(name = "last_name")
private String lastName;
	
	
@Column(name = "email")
private  String email;
	
	
@Column(name = "password")
private String password;
	

@Column(name = "contactno")
private String contactno;

@Column(name = "address")
private String address;

@Column(name = "type")
private String type;

@Column(name = "gender")
private String gender;

public User() {
	
}




public User(int iduser, String firstName, String lastName, String email, String password, String contactno,
		String address, String type, String gender) {
	super();
	this.iduser = iduser;
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.password = password;
	this.contactno = contactno;
	this.address = address;
	this.type = type;
	this.gender = gender;
}




public int getIduser() {
	return iduser;
}




public void setIduser(int iduser) {
	this.iduser = iduser;
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




public String getEmail() {
	return email;
}




public void setEmail(String email) {
	this.email = email;
}




public String getPassword() {
	return password;
}




public void setPassword(String password) {
	this.password = password;
}




public String getContactno() {
	return contactno;
}




@Override
public String toString() {
	return "User [iduser=" + iduser + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
			+ ", password=" + password + ", contactno=" + contactno + ", address=" + address + ", type=" + type
			+ ", gender=" + gender + "]";
}




public User(String firstName, String lastName, String email, String password, String contactno, String address,
		String type, String gender) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.password = password;
	this.contactno = contactno;
	this.address = address;
	this.type = type;
	this.gender = gender;
}




public void setContactno(String contactno) {
	this.contactno = contactno;
}




public String getAddress() {
	return address;
}




public void setAddress(String address) {
	this.address = address;
}




public String getType() {
	return type;
}




public void setType(String type) {
	this.type = type;
}




public String getGender() {
	return gender;
}




public void setGender(String gender) {
	this.gender = gender;
}





}
