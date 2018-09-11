package com.exilant.blog.services;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationServiceImpl implements NotificationService {
	 public static final String NOTIFY_MSG_SESSION_KEY = "siteNotificationMessages";
	 @Autowired
	 private HttpSession httpSession;
	@Override
	public void addInfoMessage(String msg) {
		addNotificationMessage(NotificationMessageType.INFO, msg);
	}

	@Override
	public void addErrorMessage(String msg) {
  addNotificationMessage(NotificationMessageType.ERROR, msg);
	}
	private void addNotificationMessage(NotificationMessageType type,String msg) {
		List<NotificationMesssage> notifymsgs=(List<NotificationMesssage>) httpSession.getAttribute(NOTIFY_MSG_SESSION_KEY);
		if (notifymsgs==null) {
			notifymsgs=new ArrayList<NotificationMesssage>();
			
		}
		notifymsgs.add(new NotificationMesssage(type, msg));
		httpSession.setAttribute(NOTIFY_MSG_SESSION_KEY,notifymsgs);
	
	}
public enum NotificationMessageType{
	INFO,
	ERROR
}
public class NotificationMesssage{
	NotificationMessageType type;
	String text;
	public NotificationMesssage(NotificationMessageType type, String text) {
		super();
		this.type = type;
		this.text = text;
	}
	public NotificationMessageType getType() {
		return type;
	}
	public String getText() {
		return text;
	}
	
}
}
