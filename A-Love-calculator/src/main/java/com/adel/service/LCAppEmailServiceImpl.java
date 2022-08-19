package com.adel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class LCAppEmailServiceImpl implements LCAppEmailService{

	@Autowired
	private JavaMailSender javaMailSender ;
	
	@Override
	public void sendEmail(String userName,String userEmail,String result) {
		
		SimpleMailMessage newMessage = new SimpleMailMessage();
		newMessage.setTo(userEmail);
		newMessage.setSubject("Love Calculator");
		newMessage.setText("Hi" + userName + "The result predicted by the LC" + result);
		
		javaMailSender.send(newMessage); 
	}
}
