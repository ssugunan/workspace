package org.sree.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.sree.messenger.service.ProfileService;
import org.sree.messenger.model.Profile;

@Path("/profiles")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public class ProfileResource {
	
	ProfileService ps =new ProfileService();	
	
	@GET
	public List<Profile> getProfiles()
	{
		return ps.getAllProfiles();
	}
	
	@GET
	@Path("/{profileName}")
	public Profile getProfile(@PathParam("profileName") String profName)
	{
		return ps.getProfile(profName);
	}
	
	@POST
	public Profile addProfile(Profile prof)
	{
		return ps.addProfile(prof);
	}
	
	@PUT
	@Path("/{profName}")
	public Profile updateProfile(@PathParam("profName") String profName, Profile prof)
	{
		prof.setProfileName(profName);
		return ps.updateProfile(prof);
	}
	
	@DELETE
	@Path("/{profName}")
	public Profile updateProfile(@PathParam("profName") String profName)
	{
		return ps.removeProfile(profName);
	}
	

}
