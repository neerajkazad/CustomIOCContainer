package org.yinsol.beans;


import java.util.List;

import org.yinsol.messages.Message;

public class MessagesDisplay {
	private List<Message> messageslist;
	private Message message;
	
	public MessagesDisplay(Message message) {
		this.message=message;
	}
	
	
	
	public void  setMessage(Message message){
		this.message=message;
	}
	
	public Message getMessage(){
		return message;
	}
	
	public List<Message> getMessageslist() {
		return messageslist;
	}

	public void setMessageslist(List<Message> messageslist) {
		this.messageslist = messageslist;
	}

	public static void main(String[] args) {
		
	}

}
