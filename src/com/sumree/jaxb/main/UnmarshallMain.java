package com.sumree.jaxb.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.sumree.jaxb.bean.Country;
import com.sumree.jaxb.bean.State;

public class UnmarshallMain {

	
	public static void main(String[] args) throws JAXBException, FileNotFoundException
	{
		
		JAXBContext con=JAXBContext.newInstance(Country.class);
		

		File file=new File("./output/country.xml");
		
		if (file.exists()){
	        System.out.println("File exists!");
	      }else{
	        System.out.println("File not exists.");
	        System.exit(0);
	      }
		
		Unmarshaller u=con.createUnmarshaller();
		//u.setValidating( true );
		Country c=(Country) u.unmarshal(new FileInputStream(file));
		
		System.out.println(c.getName());
		System.out.println(c.getCountryPop());
		
		List<State> l=c.getStateList();
		
		for(State s: l)
		{
			System.out.println(s.getStateName());
			System.out.println(s.getStatePop());
		}
		
	}
	
}
