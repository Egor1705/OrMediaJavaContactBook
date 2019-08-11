package by.myJavaCourses.impl;

import by.myJavaCourses.entities.Contact;
import by.myJavaCourses.entities.Record;

public class ContactImpl implements Contact {

private String information;
private Record record;

	
	
public ContactImpl(String inf) {
	this.information = inf;
}



	public ContactImpl(String information,Record record) {
		this.information = information;
		this.record = record;
	}

	

	@Override
	public String getPhoneNumber() {
		// TODO Auto-generated method stub
		return this.information;
	}


	@Override
	public Record getRecord() {
		// TODO Auto-generated method stub
		return this.record;
	}







	
	
}
