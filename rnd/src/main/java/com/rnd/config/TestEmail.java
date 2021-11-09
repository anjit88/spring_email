package com.rnd.config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class TestEmail {

	@PostConstruct
	public void init() {
		sendEmail();
	}
	
	@Autowired
	private JavaMailSender javaMailSender;

	void sendEmail() {

		System.out.println("################### sendEmail ############");
		
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo("anjit.kr@gmail.com");

		msg.setSubject("Testing from Spring Boot");
		msg.setText("Hello World \n Spring Boot Email");

		javaMailSender.send(msg);
		
		System.out.println("###### javaMailSender #########");

	}
}
