package com.sumree.jaxb.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.sumree.jaxb.bean.Country;
import com.sumree.jaxb.bean.State;

public class MarshallMain {
	
	public static void main(String[] args) throws IOException
	{
		
		
		File file=new File("./output/country.xml");
		
		if (file.createNewFile()){
	        System.out.println("File is created!");
	      }else{
	        System.out.println("File already exists.");
	      }
			
		
		JAXBContext con=null;
		Country c=new Country();
		c.setName("India");
		c.setCountryPop("1000000000");
		
		State s1=new State();
		s1.setStateName("Punajb");
		s1.setStatePop("20000000");
		
		State s2=new State();
		s2.setStateName("Delhi");
		s2.setStatePop("30000000");
		
		c.getStateList().add(s1);
		c.getStateList().add(s2);
		
		try {
			con=JAXBContext.newInstance(Country.class);
			
			FileOutputStream fos=new FileOutputStream(file);
			
			Marshaller mar=con.createMarshaller();
			mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
			mar.marshal(c, fos);
			
			
			
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
