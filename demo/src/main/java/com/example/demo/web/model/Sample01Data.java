package com.example.demo.web.model;

public class Sample01Data {

	private String id = null;
	private String name = null;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Sample01Data [id=" + id + ", name=" + name + "]";
	}
	
}
