package com.adel.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.adel.dto.UserInfo;
import com.adel.service.LoveCAppService;

@Controller
@SessionAttributes({"userInfo"})
public class LCAppController {
	
	@Autowired
	LoveCAppService loveCAppService;
	@RequestMapping("/")
	public String showhomepage(Model model)
	{		
		model.addAttribute("userInfo" , new UserInfo());
		return "home-page";
	}
	
	@RequestMapping("/process-homepage") 
	public String resulthomepage
	(@Valid @ModelAttribute("userInfo") UserInfo userInfoDTO, BindingResult result ,HttpServletRequest requet)
	{
		
		if(result.hasErrors()) {
			System.out.println("my form has errors");
			
			List<ObjectError>  errors =  result.getAllErrors();
			for (ObjectError objectError : errors) {
				
				System.out.println(objectError);
			}
			
			return "home-page";
		}
		String showResult = loveCAppService.calculateLove(userInfoDTO.getName(),userInfoDTO.getCrushName());
		userInfoDTO.setResult(showResult);
		
		//Create a session
		HttpSession session = requet.getSession();
		session.setAttribute("name", userInfoDTO.getName());
		
		
		//Write a service which will calculate the love % between the user & the crushName
		return "result-page";
	}
}
