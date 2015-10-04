package com.sumree.jaxb.bean;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace="com.sumree.jaxb.bean.Country")
public class State {
	
	String stateName;
	String statePop;
	
	public String getStateName() {
		return stateName;
	}
	@XmlElement
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getStatePop() {
		return statePop;
	}
	@XmlElement
	public void setStatePop(String statePop) {
		this.statePop = statePop;
	}
	
	

}
