package by.myJavaCourses.impl;

import java.util.List;

import by.myJavaCourses.entities.Contact;
import by.myJavaCourses.entities.ContactBook;
import by.myJavaCourses.entities.Record;

public class ContactBookImpl implements ContactBook {

	private List<Record> fullListOfRecords;

	private List<Contact> fullListOfContacts;

	public ContactBookImpl(List<Record> fullListOfRecords, List<Contact> fullListOfContacts) {
		this.fullListOfContacts = fullListOfContacts;
		this.fullListOfRecords = fullListOfRecords;
	}

	@Override
	public void fullListOfRecords(List<Record> list) {
		// TODO Auto-generated method stub
		for (int i = 0; i < list.size(); i++) {
			Record record = list.get(i);
			printRecordList(record);
		}
	}

	@Override
	public void fullListOfContacts(List<Contact> list) {
		// TODO Auto-generated method stub
		for (int i = 0; i < list.size(); i++) {
			Contact contact = list.get(i);
			printContactList(contact);
		}
	}

	@Override
	public boolean addRecord(Record record) {
		// TODO Auto-generated method stub
		boolean check = false;
		check = this.fullListOfRecords.add(record);

		return check;
	}

	@Override
	public boolean deleteRecord(Record record) {
		// TODO Auto-generated method stub
		boolean check = false;
		check = this.fullListOfRecords.remove(record);
		return check;
	}

	@Override
	public boolean addContact(Contact contact) {
		// TODO Auto-generated method stub
		boolean check = false;
		check = this.fullListOfContacts.add(contact);

		return check;
	}

	@Override
	public boolean deleteContact(Contact contact) {
		// TODO Auto-generated method stub
		boolean check = false;
		check = this.fullListOfContacts.remove(contact);

		return check;
	}


	@Override
	public Record searchOfRecordByName(String name) {
		// TODO Auto-generated method stub

		int k = 0;
		int count = 0;
	    Record record = null;
		for (int i = 0; i < fullListOfRecords.size(); i++) {
			 record = fullListOfRecords.get(i);
			 if(record.getNameOfHuman(record)==name) {
				k = i;
				count++;
			}
			
		}
if(count>0) {
	record = fullListOfRecords.get(k);
}
else {
	record = null;
}
		
		return record;
	}

	public static void printRecordList(Record record) {
		System.out.println("record: " + record);
	}

	public static void printContactList(Contact contact) {
		System.out.println("contact: " + contact);
	}

}
