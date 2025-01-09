package com.spring.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {
	private String name;
	private List<String> phones;
	private Set<String> addreses;
	private Map<String, String> courses;
	private Properties props;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddreses() {
		return addreses;
	}
	public void setAddreses(Set<String> addreses) {
		this.addreses = addreses;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	public Emp(String name, List<String> phones, Set<String> addreses, Map<String, String> courses, Properties props) {
		super();
		this.name = name;
		this.phones = phones;
		this.addreses = addreses;
		this.courses = courses;
		this.props = props;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
