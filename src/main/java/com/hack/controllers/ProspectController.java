package com.hack.controllers;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.hack.bean.AdditionalDetailsBean;
import com.hack.bean.AddressBean;
import com.hack.bean.ContactBean;
import com.hack.bean.CustomerBean;
import com.hack.bean.EmploymentBean;
import com.hack.bean.IdentityBean;
import com.hack.bean.NameBean;
import com.hack.bean.PersonalDetailsBean;
import com.hack.bean.ProspectBean;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

@Controller
@RequestMapping("/prospect")
public class ProspectController {
	@Autowired
	private ServletContext servletContext;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody ProspectBean getProspect(@PathVariable String id) {

		ProspectBean prospect = new ProspectBean();
		
		PersonalDetailsBean p = new PersonalDetailsBean();
		NameBean name = new NameBean();
		name.setFirstName("Joe");
		name.setFirstName("Vincent");
		p.setName(name);
		p.setDateofBirth("30-May-1992");
		AddressBean a = new AddressBean();
		a.setHouseNumber("23");
		a.setPostcode("WA169EU");
		a.setYearsofstay(5);
		
		List<AddressBean> aList = new ArrayList<AddressBean>();
		aList.add(a);
		p.setAddress(aList);
		prospect.setPerson(p);
		
		ContactBean c = new ContactBean();
		c.setMailId("joe.m@gmail.com");
		c.setPhone("07746202777");
		prospect.setContact(c);
		
		EmploymentBean e = new EmploymentBean();
		e.setEmployer("ABC Corp.");
		e.setEmploymentStatus(true);
		e.setSalary("£ 24,000.00");
		prospect.setEmployment(e);
		return prospect;

	}
	
	@RequestMapping(value = "/{id}/passport", method = RequestMethod.GET)
	public @ResponseBody IdentityBean getPassport(@PathVariable String id) {

		IdentityBean identity = new IdentityBean();
		identity.setIdentityType("Passport");
		
		try{
			File file = new File(servletContext.getRealPath("resources/Passport.png"));
			InputStream resourceInputStream = new FileInputStream(file);

			BufferedImage image = ImageIO.read(resourceInputStream); 
			ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
			ImageIO.write(image, "png", baos); 
			//byte[] res=baos.toByteArray();
			String encodedImage = Base64.encode(baos.toByteArray());
			identity.setIdentity(encodedImage);
		} 
		catch(Exception e) 
		{
			e.printStackTrace(); 
		} 
		
		return identity;

	}
	
	@RequestMapping(value = "/{id}/drivinglicence", method = RequestMethod.GET)
	public @ResponseBody IdentityBean getDrivingLicence(@PathVariable String id) {

		IdentityBean identity = new IdentityBean();
		identity.setIdentityType("DrivingLicence");
		try{
			File file = new File(servletContext.getRealPath("resources/dl.gif"));
			InputStream resourceInputStream = new FileInputStream(file);

			BufferedImage image = ImageIO.read(resourceInputStream); 
			ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
			ImageIO.write(image, "gif", baos); 
			//byte[] res=baos.toByteArray();
			String encodedImage = Base64.encode(baos.toByteArray());
			identity.setIdentity(encodedImage);
		} 
		catch(Exception e) 
		{
			e.printStackTrace(); 
		} 
		return identity;

	}
	
	@RequestMapping(value = "/{id}/governmentId", method = RequestMethod.GET)
	public @ResponseBody IdentityBean getGovernmentId(@PathVariable String id) {

		IdentityBean identity = new IdentityBean();
		identity.setIdentityType("GovId");
		try{
			File file = new File(servletContext.getRealPath("resources/govid.png"));
			InputStream resourceInputStream = new FileInputStream(file);

			BufferedImage image = ImageIO.read(resourceInputStream); 
			ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
			ImageIO.write(image, "png", baos); 
			//byte[] res=baos.toByteArray();
			String encodedImage = Base64.encode(baos.toByteArray());
			identity.setIdentity(encodedImage);
		} 
		catch(Exception e) 
		{
			e.printStackTrace(); 
		} 
		return identity;

	}
	
	@RequestMapping(value = "/{id}/convert", method = RequestMethod.GET)
	public @ResponseBody CustomerBean convertToCustomer(@PathVariable String id) {

		CustomerBean customer = new CustomerBean();
		customer.setCustId("4267145217");
		return customer;

	}
	
	
	@RequestMapping(value = "/generate", method = RequestMethod.GET)
	public @ResponseBody String generateProspect() {
		return "4267145217";
	}
	
	@RequestMapping(value = "/{id}/person", method = RequestMethod.POST)
	@ResponseStatus ( HttpStatus.CREATED)
	public void addPerson(@PathVariable String id, @RequestBody PersonalDetailsBean person) {

	}

	@RequestMapping(value = "/{id}/contact", method = RequestMethod.POST)
	@ResponseStatus ( HttpStatus.CREATED)
	public void addContact(@PathVariable String id, @RequestBody ContactBean contaact) {

	}
	
	@RequestMapping(value = "/{id}/income", method = RequestMethod.POST)
	@ResponseStatus ( HttpStatus.CREATED)
	public void addIncome(@PathVariable String id, @RequestBody EmploymentBean employment) {

	}
	
	@RequestMapping(value = "/{id}/passport", method = RequestMethod.POST)
	@ResponseStatus ( HttpStatus.CREATED)
	public void addPassport(@PathVariable String id, @RequestBody IdentityBean passport) {

	}
	@RequestMapping(value = "/{id}/drivinglicence", method = RequestMethod.POST)
	@ResponseStatus ( HttpStatus.CREATED)
	public void addDrivingLicence(@PathVariable String id, @RequestBody IdentityBean dl) {

	}
	@RequestMapping(value = "/{id}/govId", method = RequestMethod.POST)
	@ResponseStatus ( HttpStatus.CREATED)
	public void addGovId(@PathVariable String id, @RequestBody IdentityBean govId) {

	}
	@RequestMapping(value = "/{id}/additionalInfo", method = RequestMethod.POST)
	@ResponseStatus ( HttpStatus.CREATED)
	public void addInfo(@PathVariable String id, @RequestBody AdditionalDetailsBean additional) {

	}
	@RequestMapping(value = "/{id}/validate", method = RequestMethod.POST)
	@ResponseStatus ( HttpStatus.CREATED)
	public void validate(@PathVariable String id) {

	}
	@RequestMapping(value = "/{id}/confirm", method = RequestMethod.POST)
	@ResponseStatus ( HttpStatus.CREATED)
	public void confirm(@PathVariable String id, @RequestBody EmploymentBean contaact) {

	}
}