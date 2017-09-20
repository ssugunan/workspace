package org.sree.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.sree.messenger.model.Message;
import org.sree.messenger.model.Profile;

public class DatabaseClass {
	
	private static Map<Long, Message> msgs = new HashMap<Long, Message>();
	private static Map<String, Profile> profs = new HashMap<String, Profile>();
	
	public static Map<Long, Message> getMessages(){
		return msgs;
	}
	
	public static Map<String, Profile> getProfiles(){
		return profs;
	}

}
