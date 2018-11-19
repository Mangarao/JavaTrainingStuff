package com.mangaraoit.bean;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="myproducts")
public class Product {
	private int id;
	private String name;
	private double price;
	public Product(){
	}
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@XmlAttribute
	public int getId() {
		return id;
	}
	@XmlElement
	public String getName() {
		return name;
	}
	@XmlElement
	public double getPrice() {
		return price;
	}
}
