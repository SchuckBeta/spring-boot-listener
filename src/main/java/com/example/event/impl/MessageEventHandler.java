package com.example.event.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;

import com.example.entity.Message;
import com.example.event.MessageEvent;
import com.example.service.impl.MessageServiceImpl;

public class MessageEventHandler implements ApplicationListener<MessageEvent>{
	@Autowired
	MessageServiceImpl messageService;

	@Override
	public void onApplicationEvent(MessageEvent event) {
		messageService.sendMessage((Message) event.getSource());
	}
}
