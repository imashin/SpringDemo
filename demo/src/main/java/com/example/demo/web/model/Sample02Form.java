package com.example.demo.web.model;

public class Sample02Form {

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
		return "Sample02Form [id=" + id + ", name=" + name + "]";
	}

}
