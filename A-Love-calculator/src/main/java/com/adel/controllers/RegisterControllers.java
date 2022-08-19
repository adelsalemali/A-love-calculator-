package com.adel.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.adel.dto.Communication;
import com.adel.dto.Phone;
import com.adel.dto.Register;
import com.adel.propertyEditor.NamePropertyEditor;
import com.adel.validator.EmaliValidator1;
import com.adel.validator.UserNameValidator;
@Controller
public class RegisterControllers {
 
	@RequestMapping("/register")
	public String showtRegister(@ModelAttribute("registerPage") Register rg)
	{
        System.out.println("insde showtRegister method");
        
            //load the saved user data from the database
      		Phone phone = new Phone();
      		phone.setCountryCode("91");
      		phone.setUserNumber("2335566647");
      		
      	    Communication communicationDTO = new Communication();
      	    communicationDTO.setPhone(phone);
      	    
      	    rg.setCommunicationDTO(communicationDTO);
      		
		return "registerPage";
	}
	
	@RequestMapping("/resultRegister")
	public String resultRegister(@Valid @ModelAttribute("registerPage") Register rg ,BindingResult result)
	{
		System.out.println("User*******"+ "|" +rg.getUser() + "|");
		System.out.println("insde resultRegister method");
		
		if(result.hasErrors())
		{
			System.out.println("My age has errors");
			List<ObjectError> error= result.getAllErrors();
			
			for (ObjectError errors : error)
			{
				System.out.println(errors);
			}
			return "registerPage";
		}
		
		return "resultRegister";
	}
	
	@InitBinder 
	public void initBinder(WebDataBinder binder) {
		
		System.out.println("user");
		//If we do not want to bind a specific text box data
//		binder.setDisallowedFields("user");
		
		//If user makes a space on filed,it will be deleted 
		StringTrimmerEditor editor = new StringTrimmerEditor(false);
		binder.registerCustomEditor(String.class, "user", editor);
		
		//If we want to change small letters to capital letters 
		NamePropertyEditor namePropertyEditor = new NamePropertyEditor();
		binder.registerCustomEditor(String.class,  "user" , namePropertyEditor);
		
		
		//UserNameValidator 
		
		UserNameValidator validator = new UserNameValidator();
		binder.addValidators(validator); 
		
		//EmaliValidator1
		EmaliValidator1 emaliValidator1 = new EmaliValidator1();
		binder.addValidators(emaliValidator1);
	}
	
}
