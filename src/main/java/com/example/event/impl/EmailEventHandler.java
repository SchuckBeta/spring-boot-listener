package com.example.event.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;

import com.example.entity.Email;
import com.example.event.EmailEvent;
import com.example.service.impl.EmailServiceImpl;

public class EmailEventHandler implements ApplicationListener<EmailEvent>{
	@Autowired
	EmailServiceImpl emailService;

	@Override
	public void onApplicationEvent(EmailEvent event) {
		emailService.sendEmail((Email) event.getSource());
	}
}
