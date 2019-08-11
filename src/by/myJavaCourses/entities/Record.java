package by.myJavaCourses.entities;

import java.util.List;

import by.myJavaCourses.impl.ContactImpl;

public interface Record {

	 String getNameOfHuman(Record record);

	 void listOfHumanContacts(List<Contact> list );

	 boolean addNewContact(Contact contact);
	
     boolean deleteContact(Contact contact);
	
    
}
