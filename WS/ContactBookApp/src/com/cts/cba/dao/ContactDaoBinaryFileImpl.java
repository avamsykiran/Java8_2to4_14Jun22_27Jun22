package com.cts.cba.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.cts.cba.model.Contact;

public class ContactDaoBinaryFileImpl implements ContactDao {

	private static final String FILE_NAME="./contacts.data";
	
	Map<Long,Contact> contacts;
	
	public ContactDaoBinaryFileImpl() {	
		if(Files.exists(Paths.get(FILE_NAME))) {
			try(ObjectInputStream oin = new ObjectInputStream(new FileInputStream(FILE_NAME))){
				this.contacts = (Map<Long, Contact>) oin.readObject();
			} catch (IOException | ClassNotFoundException e) {
				System.out.println(e.getMessage());
				this.contacts = new TreeMap<>();	
			}
		}else {
			this.contacts = new TreeMap<>();
		}
	}
	
	private void writeData() {
		try(ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream(FILE_NAME))){
			oout.writeObject(contacts);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
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
		contacts.put(contact.getContactId(), contact);
		writeData();
		return contact;
	}

	@Override
	public void deleteById(long id) {
		contacts.remove(id);
		writeData();
	}

}
