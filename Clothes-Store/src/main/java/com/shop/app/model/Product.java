package com.shop.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idproduct")
	private int idProduct;
	
	@Column(name="pname")
	private String pName;
	
	@Column(name="size")
	private String size;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="color")
	private String color;
	
	@Column(name="ptype")
	private String ptype;
	
	@Column(name="brand")
	private String brand;
	
	public Product() {
		super();
	}


	public Product(String pName, String size, String color, String ptype, String brand, String gender) {
		super();
		this.pName = pName;
		this.size = size;
		this.color = color;
		this.ptype = ptype;
		this.brand = brand;
		this.gender = gender;
	}

	public Product(int idProduct, String pName, String size, String color, String ptype, String brand, String gender) {
		super();
		this.idProduct = idProduct;
		this.pName = pName;
		this.size = size;
		this.color = color;
		this.ptype = ptype;
		this.brand = brand;
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public int getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPtype() {
		return ptype;
	}

	public void setPtype(String ptype) {
		this.ptype = ptype;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

}

