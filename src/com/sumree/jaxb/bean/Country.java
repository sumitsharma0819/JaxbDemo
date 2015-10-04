package com.sumree.jaxb.bean;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder={})
public class Country {
	
	String name;
	List<State> stateList=new ArrayList<State>();
	String countryPop;
	
	public String getName() {
		return name;
	}
	@XmlElement
	public void setName(String name) {
		this.name = name;
	}
	public List<State> getStateList() {
		return stateList;
	}
	
	@XmlElementWrapper
	@XmlElement(name="state")
	public void setStateList(List<State> stateList) {
		this.stateList = stateList;
	}
	public String getCountryPop() {
		return countryPop;
	}
	@XmlElement
	public void setCountryPop(String countryPop) {
		this.countryPop = countryPop;
	}
	
	
	
	
	

}
