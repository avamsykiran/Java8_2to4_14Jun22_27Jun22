package com.cts.cba.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.cts.cba.model.Contact;

public class ContactDaoImpl implements ContactDao {

	Map<Long,Contact> contacts;
	
	public ContactDaoImpl() {
		this.contacts = new TreeMap<>();
	}
	
	@Override
	public List<Contact> getAll() {
		return new ArrayList<Contact>(contacts.values());
	}

	@Override
	public Contact getById(long id) {
		return contacts.get(id);
	}

	@Override
	public Contact add(Contact contact) {
		return contacts.put(contact.getContactId(), contact);
	}

	@Override
	public void deleteById(long id) {
		contacts.remove(id);
	}

}
