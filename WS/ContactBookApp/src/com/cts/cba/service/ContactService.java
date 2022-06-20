package com.cts.cba.service;

import java.util.List;

import com.cts.cba.exceptions.InvalidContactException;
import com.cts.cba.model.Contact;

public interface ContactService {

	List<Contact> getAll();
	Contact getById(long id);
	Contact add(Contact contact) throws InvalidContactException;
	void deleteById(long id);
}
