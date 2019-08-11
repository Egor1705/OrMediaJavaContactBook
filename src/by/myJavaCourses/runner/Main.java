package by.myJavaCourses.runner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import by.myJavaCourses.entities.Contact;
import by.myJavaCourses.entities.ContactBook;
import by.myJavaCourses.entities.Record;
import by.myJavaCourses.entities.View;
import by.myJavaCourses.impl.ContactBookImpl;
import by.myJavaCourses.impl.ContactImpl;
import by.myJavaCourses.impl.RecordImpl;
import by.myJavaCourses.impl.ViewImpl;

public class Main {
	
	
	

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
List<Contact>listContAlex = new ArrayList<>();
		Record record = new RecordImpl("Alexey", listContAlex);
		Contact contAlex1 = new ContactImpl("+375 29 5466576",record);
		Contact contAlex2 = new ContactImpl("alex21@gmail.com",record);
		Contact contAlex3 = new ContactImpl("Gyrieva Street 15-6",record);
	
		List<Record>fullListRec = new ArrayList<>();
		List<Contact>fullListCont = new ArrayList<>();
		
		ContactBook cont = new ContactBookImpl(fullListRec,fullListCont);
		fullListRec.add(record);
		fullListCont.add(contAlex3);
		View view = new ViewImpl();
		System.out.println("=========");
		
		view.showFullListOfContacts(fullListCont);
		view.showFullListOfRecords(fullListRec);
		
		
		
		
		
		
	System.out.println(record.addNewContact(contAlex1));
	System.out.println(contAlex1.getRecord());
		
	
	cont.addRecord(record);

		cont.fullListOfContacts(fullListCont);
		cont.fullListOfRecords(fullListRec);
		
		
		Record rec = new RecordImpl("re");
		
	fullListRec.add(rec);
		
	System.out.println(cont.searchOfRecordByName("re"));
		
		
		
		
		
	}

}
