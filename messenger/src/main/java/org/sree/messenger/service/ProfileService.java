package org.sree.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.sree.messenger.database.DatabaseClass;
import org.sree.messenger.model.Profile;
import org.sree.messenger.model.Profile;

public class ProfileService {
	
private Map<String, Profile> profs = DatabaseClass.getProfiles();
	
	public ProfileService()
	{
		profs.put("ssugunan", new Profile(1L,"ssugunan","Sree", "Sugunan"));
		profs.put("muthi",new Profile(2L,"muthi","Muthu","Kungu"));
	}
	public List<Profile> getAllProfiles()
	{
	
		return new ArrayList<Profile>(profs.values());
	}
	public Profile getProfile(String profName)
	{
		return profs.get(profName);
	}
	
	public Profile addProfile(Profile prof)
	{
		prof.setId(profs.size()+1);
		profs.put(prof.getProfileName(), prof);
		return prof;
	}
	
	public Profile updateProfile(Profile prof)
	{
		if(prof.getProfileName()==null){
			return null;
		}
		profs.put(prof.getProfileName(), prof);
		return profs.get(prof.getProfileName());
			
	}
	
	public Profile removeProfile(String profName)
	{
		return profs.remove(profName);
	}

}


