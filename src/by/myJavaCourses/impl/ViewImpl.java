package by.myJavaCourses.impl;

import java.util.List;

import by.myJavaCourses.entities.Contact;
import by.myJavaCourses.entities.Record;
import by.myJavaCourses.entities.View;

public class ViewImpl implements View {

	@Override
	public void showFullListOfRecords(List<Record> listOfRecords) {
		// TODO Auto-generated method stub
		for(Record r : listOfRecords) {
			  System.out.println(r.getNameOfHuman(r));
		}
	}

	@Override
	public void showFullListOfContacts(List<Contact> listOfContacts) {
		// TODO Auto-generated method stub
		for(Contact c : listOfContacts) {
			  System.out.println(c.getPhoneNumber());
		}
	}

	@Override
	public void show(Record record) {
		// TODO Auto-generated method stub
		System.out.println("some information");
	}

	@Override
	public void show(Contact contact) {
		// TODO Auto-generated method stub
		System.out.println("some information");
	}

}
