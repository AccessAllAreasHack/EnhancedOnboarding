package com.hack.bean;

public class AddressBean {

	private String houseNumber;
	private String postcode;

	private int yearsofstay;
	
	public int getYearsofstay() {
		return yearsofstay;
	}
	public void setYearsofstay(int yearsofstay) {
		this.yearsofstay = yearsofstay;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
}
