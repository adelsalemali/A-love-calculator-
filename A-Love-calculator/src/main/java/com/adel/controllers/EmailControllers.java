package com.adel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.adel.dto.Email;
import com.adel.dto.UserInfo;
import com.adel.service.LCAppEmailServiceImpl;

@Controller
public class EmailControllers {

	@Autowired
	private LCAppEmailServiceImpl lCAppEmailService;
	
	
	@RequestMapping(value = "/sendEmailnow")   
	public String sendEmail(Model model)
	{ 
		model.addAttribute("emailDTO", new Email());
		return "send_email_page";
	} 
	
	@RequestMapping(value = "/processEmali")
	public String processEmali(@SessionAttribute("userInfo") UserInfo userInfoDTO,
			                   @ModelAttribute("emailDTO") Email emailDTO)
	{
		lCAppEmailService.sendEmail(userInfoDTO.getName(),emailDTO.getUserEmail(),"F");
		return "process_emali_page";
	}
}