package com.cts.cba.ui;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.cts.cba.exceptions.InvalidContactException;
import com.cts.cba.model.Contact;
import com.cts.cba.service.ContactService;
import com.cts.cba.service.ContactServiceImpl;

public class ContactsApplicationRunner {

	private ContactService service;
	private Scanner kbin;

	public ContactsApplicationRunner() {
		this.kbin = new Scanner(System.in);
		this.service = new ContactServiceImpl();
	}

	public void run() {
		Menu menu = null;

		while (menu != Menu.QUIT) {
			for (Menu m : Menu.values()) {
				System.out.println(m.ordinal() + "\t" + m);
			}
			System.out.print("Choice? ");
			int ch = kbin.nextInt();

			if (ch < 0 || ch >= Menu.values().length) {
				System.out.println("Invlaid choice");
				continue;
			}

			menu = Menu.values()[ch];

			switch (menu) {
			case LIST:
				doList();
				break;
			case ADD:
				doAdd();
				break;
			case DELETE:
				doDelete();
				break;
			case QUIT:
				System.out.println("App terminated");
				break;
			}
		}
	}

	private void doList() {
		List<Contact> cl = service.getAll();
		if (cl.isEmpty()) {
			System.out.println("No Records To Display");
		} else {
			// cl.stream().forEach(c -> System.out.println(c));
			for (Contact c : cl) {
				System.out.println(c);
			}
		}
	}

	private void doAdd() {
		System.out.print("\nContact Id: ");
		long contactId = kbin.nextLong();
		System.out.print("\nFull Name: ");
		String fullName = kbin.next();
		System.out.print("\nMailId: ");
		String mailId = kbin.next();
		System.out.print("\nMobile: ");
		String mobile = kbin.next();
		System.out.print("\nDateOfBirth: ");
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dateOfBirth = LocalDate.parse(kbin.next(), dateFormat);
		Contact c;
		try {
			c = service.add(new Contact(contactId, fullName, mailId, mobile, dateOfBirth));
			System.out.print("\n Contact Saved With Id: " + c.getContactId());
		} catch (InvalidContactException e) {
			System.out.println(e.getMessage());
		}
		
	}

	private void doDelete() {
		System.out.print("\nContact Id: ");
		long cId = kbin.nextLong();
		service.deleteById(cId);
		System.out.print("\n The Contact is Deleted!");
	}
}
