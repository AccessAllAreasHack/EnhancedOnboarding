package com.hack.bean;

import java.util.List;

public class PersonalDetailsBean {

	private  NameBean name;
	private  List<AddressBean> address;
	private String dateofBirth;
	public NameBean getName() {
		return name;
	}
	public void setName(NameBean name) {
		this.name = name;
	}
	public List<AddressBean> getAddress() {
		return address;
	}
	public void setAddress(List<AddressBean> address) {
		this.address = address;
	}
	public String getDateofBirth() {
		return dateofBirth;
	}
	public void setDateofBirth(String dateofBirth) {
		this.dateofBirth = dateofBirth;
	}
	
}
