package com.rnd.config;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

//@Configuration
public class MailConfiguration {

	/*
	 * @Autowired private Environment env;
	 * 
	 * @Bean public JavaMailSender getMailSender() {
	 * 
	 * 
	 * System.out.println("############getMailSender########$"); JavaMailSenderImpl
	 * mailSender = new JavaMailSenderImpl();
	 * 
	 * mailSender.setHost(env.getProperty("communication.mail.host"));
	 * mailSender.setPort(Integer.valueOf(env.getProperty("communication.mail.port")
	 * )); mailSender.setUsername(env.getProperty("communication.mail.username"));
	 * mailSender.setPassword(env.getProperty("communication.mail.password"));
	 * 
	 * Properties javaMailProperties = new Properties();
	 * javaMailProperties.put("mail.smtp.starttls.enable", "true");
	 * javaMailProperties.put("mail.smtp.auth", "true");
	 * javaMailProperties.put("mail.transport.protocol", "smtp");
	 * javaMailProperties.put("mail.debug", "true");
	 * 
	 * mailSender.setJavaMailProperties(javaMailProperties); return mailSender; }
	 */
}
