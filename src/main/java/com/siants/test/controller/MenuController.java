package com.siants.test.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.siants.test.model.LDMenu;
import com.siants.test.service.impl.ILDMenuService;

@Controller
@RequestMapping("/menu")
public class MenuController {
	
	@Resource
	private ILDMenuService ldMenuService;
	
	@RequestMapping("/showMenu")
	public String showMenu(HttpServletRequest request,Model model){
		String nodeCode = request.getParameter("nodeCode");
		LDMenu menu = ldMenuService.getLDMenuByCode(nodeCode);
		model.addAttribute("menu", menu);
		return "showMenu";
	}
}
