package com.cts.cba.service;

import java.util.ArrayList;
import java.util.List;

import com.cts.cba.dao.ContactDao;
import com.cts.cba.dao.ContactDaoBinaryFileImpl;
import com.cts.cba.dao.ContactDaoImpl;
import com.cts.cba.exceptions.InvalidContactException;
import com.cts.cba.model.Contact;

public class ContactServiceImpl implements ContactService{

	private ContactDao contactDao;
	
	public ContactServiceImpl() {
		//this.contactDao = new ContactDaoImpl();
		this.contactDao = new ContactDaoBinaryFileImpl();
	}
	
	private boolean isValidContact(Contact c) throws InvalidContactException {
		List<String> errors = new ArrayList<String>();
		
		if(c.getContactId()<=0) {
			errors.add("Contact Id is not expected to be zero or negative");
		}
			
		if(c.getFullName()==null || c.getFullName().length()==0) {
			errors.add("Full Naem can not blank");
		}
		
		if(!errors.isEmpty()) {
			throw new InvalidContactException(errors.toString());
		}
		
		return errors.isEmpty();
	}
	
	@Override
	public List<Contact> getAll() {
		return contactDao.getAll();
	}

	@Override
	public Contact getById(long id) {
		return contactDao.getById(id);
	}

	@Override
	public Contact add(Contact contact) throws InvalidContactException {
		
		if(isValidContact(contact)) {
			contactDao.add(contact);
		}
		
		return contact;
	}

	@Override
	public void deleteById(long id) {
		contactDao.deleteById(id);
	}

}
