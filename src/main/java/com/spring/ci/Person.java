package com.spring.ci;

import java.util.List;

public class Person {
	private String name;
	private int personId;
	private Certi certi;
	private List<String> list;
	
	public Person(String name, int personId, Certi certi) {
		this.name = name;
		this.personId = personId;
		this.certi=certi;
	}

	@Override
	public String toString() {
		return this.personId+" : "+this.name+ "{ "+this.certi.name+" }";
	}
	
	
	
	
}
