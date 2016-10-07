package com.hack.bean;

import java.util.List;

public class ProspectBean {

	private PersonalDetailsBean person;
	private List<IdentityBean> identity;
	private AdditionalDetailsBean additionalDetails;
	private EmploymentBean employment;
	private ContactBean contact;
	public PersonalDetailsBean getPerson() {
		return person;
	}
	public void setPerson(PersonalDetailsBean person) {
		this.person = person;
	}
	public List<IdentityBean> getIdentity() {
		return identity;
	}
	public void setIdentity(List<IdentityBean> identity) {
		this.identity = identity;
	}
	public AdditionalDetailsBean getAdditionalDetails() {
		return additionalDetails;
	}
	public void setAdditionalDetails(AdditionalDetailsBean additionalDetails) {
		this.additionalDetails = additionalDetails;
	}
	public EmploymentBean getEmployment() {
		return employment;
	}
	public void setEmployment(EmploymentBean employment) {
		this.employment = employment;
	}
	public ContactBean getContact() {
		return contact;
	}
	public void setContact(ContactBean contact) {
		this.contact = contact;
	}
}
