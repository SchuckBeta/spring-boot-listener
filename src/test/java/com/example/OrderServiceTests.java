package com.example;

import static org.junit.Assert.assertArrayEquals;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.entity.Email;
import com.example.entity.Message;
import com.example.entity.Order;
import com.example.service.impl.EmailServiceImpl;
import com.example.service.impl.MessageServiceImpl;
import com.example.service.impl.OrderServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderServiceTests {

	@Autowired
	OrderServiceImpl orderService;
	@Autowired
	MessageServiceImpl messageService;
	@Autowired
	EmailServiceImpl emailService;

	@Test
	public void buyAndSend() {
		Order order = new Order();
		order.setName("机票订单Order");
		order.setPersion("张三");
		order.setTime(new Date());
		orderService.buy(order);

		Message message = new Message();
		message.setTitle("机票订单Message");
		message.setMsg("机票订单Message已经成功");
		message.setTime(new Date());
		messageService.sendMessage(message);

		Email email = new Email();
		email.setTitle("机票订单Email");
		email.setMsg("机票订单Email已经成功");
		email.setTime(new Date());
		email.setAddr("111111@qq.com");
		emailService.sendEmail(email);
	}

}