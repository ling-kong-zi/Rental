package com.rental.service;

import java.util.List;

import com.rental.entity.Message;


public interface MessageService extends BaseService<Message>{
//	Message getMessagesByHuifu(Message message);
	List<Message> getMessagesDaoXu();
}
