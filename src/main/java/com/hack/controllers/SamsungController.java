package com.hack.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.hack.bean.ProspectBean;

@Controller
@RequestMapping("/prospect")

public class SamsungController {
	@RequestMapping(value = "/{id}/package", method = RequestMethod.POST)
	@ResponseStatus ( HttpStatus.CREATED)
	public void convertToCustomer(@PathVariable String id, @RequestBody ProspectBean prospect) {


	}
}