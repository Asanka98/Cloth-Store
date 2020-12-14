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
	
	

@Column(name = "firstName")
private String firstName;
	
	
@Column(name = "lastName")
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





}
