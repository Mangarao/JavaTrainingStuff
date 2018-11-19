package com.mangaraoit.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mangaraoit.beans.Country;
@RestController
public class CountryController {
	
	@RequestMapping(value="/country", method=RequestMethod.GET, headers="Accept=application/xml")
	public List<Country> getCounties(){
		return countriesList();
	}
	@RequestMapping(value="/country/{id}", method=RequestMethod.GET, headers="Accept=application/xml")
	public Country getCountryById(@PathVariable int id){
		List<Country> countriesList = countriesList();
		for (Country country : countriesList) {
			if(id==country.getId()){
				return country;
			}
		}
		return null;
		
	}
	private List<Country> countriesList(){
		List<Country> countriesList = new ArrayList<>();
		countriesList.add(new Country(1, "India"));
		countriesList.add(new Country(2, "USA"));
		countriesList.add(new Country(3, "Germany"));
		return countriesList;
	}

}
