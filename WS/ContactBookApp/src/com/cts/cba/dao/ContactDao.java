package com.cts.cba.dao;

import java.util.List;

import com.cts.cba.model.Contact;

public interface ContactDao {

	List<Contact> getAll();
	Contact getById(long id);
	Contact add(Contact contact);
	void deleteById(long id);
}
