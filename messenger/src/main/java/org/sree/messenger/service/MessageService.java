package org.sree.messenger.service;

import org.sree.messenger.database.DatabaseClass;
import org.sree.messenger.model.Message;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MessageService {
	
	private Map<Long, Message> msgs = DatabaseClass.getMessages();
	
	public MessageService()
	{
		msgs.put(1L, new Message(1L,"Hello World","Sree"));
		msgs.put(2L,new Message(2L,"Hello Muthu World","Muthu"));
	}
	public List<Message> getAllMessages()
	{
//		Message m1= new Message(1L,"Hello World","Sree");
//		Message m2= new Message(2L,"Hello Muthu World","Muthu");
//		List <Message> a1= new ArrayList<>();
//		a1.add(m1);
//		a1.add(m2);
//		return a1;
		
		return new ArrayList<Message>(msgs.values());
	}
	
	public Message getMessage(Long id)
	{
		return msgs.get(id);
	}
	
	public Message addMessage(Message msg)
	{
		msg.setId(msgs.size()+1);
		msgs.put(msg.getId(), msg);
		return msg;
	}
	
	public Message updateMessage(Message msg)
	{
		if(msg.getId()<=0){
			return null;
		}
		msgs.put(msg.getId(), msg);
		return msgs.get(msg.getId());
			
	}
	
	public Message removeMessage(long id)
	{
		return msgs.remove(id);
	}

}
