package com.spring.javaconfig;

import org.springframework.stereotype.Component;

//@Component("firstStudent")


public class Student {
	
	private Samosa samosa;
	
	
	
	
	public Student(Samosa samosa2) {
		// TODO Auto-generated constructor stub
	}



	public Samosa getSamosa() {
		return samosa;
	}



	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}
	
	

	@Override
	public String toString() {
		return "Student [samosa=" + samosa + "]";
	}



	public void study() {
		this.samosa.display(); 
		System.out.println("reading books...");
	}

}
