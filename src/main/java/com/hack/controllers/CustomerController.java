package com.hack.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hack.bean.AccountBean;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@RequestMapping(value = "/{id}/card", method = RequestMethod.GET)
	public @ResponseBody AccountBean getAccountDetails(@PathVariable String id) {

		AccountBean acct = new AccountBean();
		acct.setCardNumber("5353986725153777");
		acct.setSortcode("20-16-16");
		acct.setAccountNumber("57869865");
		acct.setPin("2668");
		acct.setBalance("100");
		acct.setCardHolder("Joe Vincent");
		return acct;

	}
}