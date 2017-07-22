package sy.service;

import java.util.List;

import sy.model.MessageLeave;


public interface MessageLeaveService {

	public MessageLeave getMessageId(String messageId);
	
	int insert(MessageLeave record);
	
	int delete(MessageLeave record);
	
	public List<MessageLeave> getMessage(MessageLeave record);

}
