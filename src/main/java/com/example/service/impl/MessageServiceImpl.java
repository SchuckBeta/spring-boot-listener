package com.example.service.impl;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.util.SerializationUtils;

import com.example.entity.Message;
import com.example.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService {
	@Override
	public void sendMessage(Message message) {
		try {
			FileCopyUtils.copy(SerializationUtils.serialize(message), new File(Class.class.getClass().getResource("/").getPath() + "/message/"+message.getTitle()));
		} catch (IOException e) {
			throw new RuntimeException("Message 短信服务器发生异常！"+e.getMessage());
		}
	}
}
