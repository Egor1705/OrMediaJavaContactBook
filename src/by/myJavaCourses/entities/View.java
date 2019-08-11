package by.myJavaCourses.entities;

import java.util.List;

public interface View {

	void showFullListOfRecords(List<Record>listOfRecords);
	
	void showFullListOfContacts(List<Contact>listOfContacts);
	
	void show(Record record);
	
	void show(Contact contact);
	
}
