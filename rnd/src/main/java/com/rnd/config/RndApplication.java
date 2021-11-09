package com.rnd.config;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@SpringBootApplication(scanBasePackages = {"com.rnd"})
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class RndApplication {

	public static void main(String[] args) {
		SpringApplication.run(RndApplication.class, args);
	}
	
	@Autowired
    private Environment env;
 
    @Bean
    public JavaMailSender getMailSender() {
 
    	
    	System.out.println("############getMailSender########===="+env.getProperty("communication.mail.host"));
    	JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
 
        mailSender.setHost(env.getProperty("communication.mail.host"));
        mailSender.setPort(Integer.valueOf(env.getProperty("communication.mail.port")));
        mailSender.setUsername(env.getProperty("communication.mail.username"));
        mailSender.setPassword(env.getProperty("communication.mail.password"));
 
        Properties javaMailProperties = new Properties();
        javaMailProperties.put("mail.smtp.starttls.enable", "true");
        javaMailProperties.put("mail.smtp.auth", "true");
        javaMailProperties.put("mail.transport.protocol", "smtp");
        javaMailProperties.put("mail.debug", "true");
        mailSender.setJavaMailProperties(javaMailProperties);
        return mailSender;
    }

}
