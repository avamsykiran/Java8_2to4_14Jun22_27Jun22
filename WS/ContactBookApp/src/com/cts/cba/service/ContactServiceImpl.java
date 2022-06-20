package com.cts.cba.service;

import java.util.List;

import com.cts.cba.dao.ContactDao;
import com.cts.cba.dao.ContactDaoImpl;
import com.cts.cba.exceptions.InvalidContactException;
import com.cts.cba.model.Contact;

public class ContactServiceImpl implements ContactService{

	private ContactDao contactDao;
	
	public ContactServiceImpl() {
		this.contactDao = new ContactDaoImpl();
	}
	
	@Override
	public List<Contact> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact add(Contact contact) throws InvalidContactException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		
	}

}
