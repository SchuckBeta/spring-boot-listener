package com.example.service.impl;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.util.SerializationUtils;

import com.example.entity.Email;
import com.example.service.EmailService;

@Service
public class EmailServiceImpl implements EmailService {

	@Override
	public void sendEmail(Email email) {
		try {
			FileCopyUtils.copy(SerializationUtils.serialize(email), new File(Class.class.getClass().getResource("/").getPath() + "/email/"+email.getTitle()));
		} catch (IOException e) {
			throw new RuntimeException("Email 邮件服务器发生异常！"+e.getMessage());
		}
	}
}
