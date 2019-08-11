package by.myJavaCourses.impl;

import java.util.List;

import by.myJavaCourses.entities.Contact;
import by.myJavaCourses.entities.Record;

public class RecordImpl implements Record {

private String nameOfHuman;
	
	private List<Contact> listOfHumanContacts;
	

	

	public RecordImpl(String name) {
		this.nameOfHuman = name;
	}
	
	public RecordImpl(String nameOfHuman,List<Contact> list ) {
		this.nameOfHuman = nameOfHuman;
		this.listOfHumanContacts = list;
	}

	@Override
	public String getNameOfHuman(Record record) {
		// TODO Auto-generated method stub
		return this.nameOfHuman;
	}

	@Override
	public void listOfHumanContacts(List<Contact> list ) {
		// TODO Auto-generated method stub
		 for (int i = 0; i < list.size(); i++) {
	          Contact cont = list.get(i);
	           printItemList(cont);
	       }
	}

	@Override
	public boolean addNewContact(Contact contact) {
		// TODO Auto-generated method stub
	
		boolean check = false;
		
		check = listOfHumanContacts.add(contact);
		
		return check;
	}

	@Override
	public boolean deleteContact(Contact contact) {
		// TODO Auto-generated method stub
		boolean check = false;
		check = this.listOfHumanContacts.remove(contact);
		return check;
	}
	
	public static void printItemList(Contact contact) {
	       System.out.println("contact: " + contact);
	   }
	



	
	


	
}
