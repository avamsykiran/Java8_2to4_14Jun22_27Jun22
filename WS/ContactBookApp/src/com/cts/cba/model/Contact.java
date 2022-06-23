package com.cts.cba.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Contact implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private long contactId;
	private String fullName;
	private String mailId;
	private String mobile;
	private LocalDate dateOfbirth;
	
	public Contact() {
		// TODO Auto-generated constructor stub
	}

	public Contact(long contactId, String fullName, String mailId, String mobile, LocalDate dateOfbirth) {
		super();
		this.contactId = contactId;
		this.fullName = fullName;
		this.mailId = mailId;
		this.mobile = mobile;
		this.dateOfbirth = dateOfbirth;
	}

	public long getContactId() {
		return contactId;
	}

	public void setContactId(long contactId) {
		this.contactId = contactId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public LocalDate getDateOfbirth() {
		return dateOfbirth;
	}

	public void setDateOfbirth(LocalDate dateOfbirth) {
		this.dateOfbirth = dateOfbirth;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (contactId ^ (contactId >>> 32));
		result = prime * result + ((dateOfbirth == null) ? 0 : dateOfbirth.hashCode());
		result = prime * result + ((fullName == null) ? 0 : fullName.hashCode());
		result = prime * result + ((mailId == null) ? 0 : mailId.hashCode());
		result = prime * result + ((mobile == null) ? 0 : mobile.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		if (contactId != other.contactId)
			return false;
		if (dateOfbirth == null) {
			if (other.dateOfbirth != null)
				return false;
		} else if (!dateOfbirth.equals(other.dateOfbirth))
			return false;
		if (fullName == null) {
			if (other.fullName != null)
				return false;
		} else if (!fullName.equals(other.fullName))
			return false;
		if (mailId == null) {
			if (other.mailId != null)
				return false;
		} else if (!mailId.equals(other.mailId))
			return false;
		if (mobile == null) {
			if (other.mobile != null)
				return false;
		} else if (!mobile.equals(other.mobile))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", fullName=" + fullName + ", mailId=" + mailId + ", mobile="
				+ mobile + ", dateOfbirth=" + dateOfbirth + "]";
	}
	
	
	
}
