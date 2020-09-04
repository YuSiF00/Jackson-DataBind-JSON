package com.luv2code.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			// create object mapper
			ObjectMapper mapper = new ObjectMapper();
			
			// read JSON file and map/convert to Java POJO
			//data/sample-lite.json
			Student theStudent = mapper.readValue(new File("data/sample-full.json"), Student.class);
			
			//print Student firstName and lastName
			System.out.println("First name : " + theStudent.getFirstName());
			System.out.println("Last name : " + theStudent.getLastName());
			
			//print out adress : street and city
			Address tempAddress = theStudent.getAddress();
			
			System.out.println("Street : " + tempAddress.getStreet());
			System.out.println("City : " + tempAddress.getCity());
			
			//print out languages
			for (String lang : theStudent.getLanguages()) {
				System.out.println(lang);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
