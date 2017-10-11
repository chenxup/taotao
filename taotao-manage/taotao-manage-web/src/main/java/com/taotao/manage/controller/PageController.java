package com.taotao.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("page")
@Controller
public class PageController {
	
	@RequestMapping(value="{page}", method=RequestMethod.GET)
	public String showLogin(@PathVariable("page") String page) {
		return page;
	}
	
}
