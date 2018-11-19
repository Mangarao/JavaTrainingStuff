package com.mangaraoit.beans;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="country")
public class Country {
	private int id;
	private String name;
	public Country(){
		System.out.println("No arg constructor is invoked");
	}
	public Country(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@XmlElement
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@XmlElement
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
