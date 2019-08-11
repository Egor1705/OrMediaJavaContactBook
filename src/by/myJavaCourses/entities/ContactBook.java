package by.myJavaCourses.entities;

import java.util.List;

public interface ContactBook {

	void fullListOfRecords(List<Record> list);

	void fullListOfContacts(List<Contact> list);

	boolean addRecord(Record record);

	boolean deleteRecord(Record record);

	boolean addContact(Contact contact);

	boolean deleteContact(Contact contact);

	Record searchOfRecordByName(String name);

}
