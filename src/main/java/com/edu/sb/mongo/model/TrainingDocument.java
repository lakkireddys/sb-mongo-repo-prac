package com.edu.sb.mongo.model;

public class TrainingDocument {
	
	
	private String name;
	private String location;
	
	public TrainingDocument() {
		
	}
	
	
	public TrainingDocument(String name, String location) {
		this.name = name;
		this.location = location;
	}


	public String getName() {
		return name;
	}
	public void setName(String docName) {
		this.name = docName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String docLocation) {
		this.location = docLocation;
	}


}
